package ru.pdd.rule.helpers;

import lombok.experimental.UtilityClass;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;

@UtilityClass
public class DataFromResources {

    public byte[] getDataFromResourcesInBytes(String pathFile) throws IOException {
        ClassPathResource cpr = new ClassPathResource(pathFile);
        return FileCopyUtils.copyToByteArray(cpr.getInputStream());
    }
}
