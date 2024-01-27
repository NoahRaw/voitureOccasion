package com.voiture.voiture.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.voiture.voiture.service.ImgBBService;


@RestController
@RequestMapping("/Image")
public class ImageController {

    @Autowired
    private ImgBBService imgBBService;

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            byte[] imageData = file.getBytes();
            String imageUrl = imgBBService.uploadImage(imageData);
            return "Image uploaded successfully. URL: " + imageUrl;
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to upload image.";
        }
    }

    @PostMapping("/teste")
    public String uploadImage() {
        return "a";
    }
}

