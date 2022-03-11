package ru.pdd.rule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pdd.rule.utils.CreateUrl;
import ru.pdd.rule.utils.DataFromResources;
import ru.pdd.rule.utils.PathResources;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    public byte[] getImageInByte(String imageUrl) throws IOException {
        String allImageUrl = CreateUrl.getAllUrlImage(PathResources.DATA, imageUrl);
        var imageByte = DataFromResources.getDataFromResourcesInBytes(allImageUrl);
        return imageByte;
    }
}
