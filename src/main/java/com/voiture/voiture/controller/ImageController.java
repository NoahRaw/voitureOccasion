package com.voiture.voiture.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.voiture.voiture.service.ImgBBService;


@RestController
@CrossOrigin
@RequestMapping("/Image")
public class ImageController {

    private final ImgBBService  ImgBBService;
    @Autowired
    private ObjectMapper objectMapper;
    
    @Autowired
    public ImageController(ImgBBService  ImgBBService ){
        this.ImgBBService= ImgBBService;
    }

    @GetMapping("/uneImage")
    public String testUpload2( @RequestParam("file") MultipartFile response) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(this.ImgBBService.uploadImages(response));

        if (jsonNode.has("data")) {
            JsonNode dataNode = jsonNode.get("data");
            if (dataNode.has("display_url")) {
                return dataNode.get("display_url").asText();
            }
        }
        throw new Exception("erreur de la recuperation du lien de l'image"); 
    }


    @GetMapping("/DesImage")
    public String testUpload3( @RequestParam("files") List<MultipartFile> response) throws Exception{
        
            for (MultipartFile file : response) {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(this.ImgBBService.uploadImages(file));

        if (jsonNode.has("data")) {
            JsonNode dataNode = jsonNode.get("data");
            if (dataNode.has("display_url")) {
                System.out.println(dataNode.get("display_url").asText());;
            }
        }
         
        }
        return "tsis";
    }
}

