package ru.pdd.rule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pdd.rule.service.ImageService;
import ru.pdd.rule.utils.CreateUrl;
import ru.pdd.rule.utils.SpecTools;

import java.io.IOException;

import static ru.pdd.rule.utils.ResponseHelper.okOrNoContent;

@RestController
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @GetMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<?> getImageForUrl(@RequestParam String imageUrl) throws IOException {
        return okOrNoContent(imageService.getImageInByte(imageUrl));
    }

    @GetMapping(value = "{image-file}/{image-ticket}/{image-number}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<?> getImageForUrlPathVariable(@PathVariable("image-file") String imageFile,
                                                        @PathVariable("image-ticket") String imageTicket,
                                                        @PathVariable("image-number") String imageNumber) throws IOException {
        String pathToImage = CreateUrl.getAllUrlWithStartSep(SpecTools.SEPARATOR, imageFile, imageTicket, imageNumber);
        return okOrNoContent(imageService.getImageInByte(pathToImage));
    }

}