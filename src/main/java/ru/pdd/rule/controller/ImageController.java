package ru.pdd.rule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pdd.rule.service.ImageService;

import java.io.IOException;

import static ru.pdd.rule.utils.ResponseHelper.okOrNoContent;

@RestController
@RequiredArgsConstructor
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    @GetMapping(value = "/", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<?> getImageForUrl(@RequestParam String imageUrl) throws IOException {
        return okOrNoContent(imageService.getImageInByte(imageUrl));
    }

}
