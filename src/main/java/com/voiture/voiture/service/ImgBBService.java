package com.voiture.voiture.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Service
public class ImgBBService {

    private final String apiKey;
    private final RestTemplate restTemplate;

    public ImgBBService(@Value("${imgbb.api-key}") String apiKey, RestTemplate restTemplate) {
        this.apiKey = apiKey;
        this.restTemplate = restTemplate;
    }


    public String uploadImage(byte[] imageData) {
        String apiUrl = "https://api.imgbb.com/1/upload";
        String base64Image = Base64.getEncoder().encodeToString(imageData);

        MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
        bodyMap.add("key", apiKey);
        bodyMap.add("image", base64Image);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers);

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, String.class);

        // Traitement de la réponse, par exemple, extraction de l'URL de l'image téléchargée.
        String imageUrl = extractImageUrlFromResponse(response.getBody());

        return imageUrl;
    }

    private String extractImageUrlFromResponse(String responseBody) {
        // Analysez la réponse JSON et extrayez l'URL de l'image.
        try {
            // Utilisez une bibliothèque JSON (par exemple, Jackson) pour analyser la réponse.
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(responseBody);

            // Extrayez l'URL de l'image à partir de la structure JSON spécifique.
            JsonNode imageUrlNode = jsonNode.path("data").path("url");
            String imageUrl = imageUrlNode.asText();

            return imageUrl;
        } catch (JsonProcessingException e) {
            // Gérez les erreurs d'analyse JSON.
            e.printStackTrace();
            return null; // ou lancez une exception appropriée selon le contexte.
        }
    }

}
