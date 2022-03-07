package ru.pdd.rule.helpers;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@UtilityClass
public class DataFromResources {

    public byte[] getDataFromResourcesInBytes(String pathFile) throws IOException, URISyntaxException {
        URI uri = ClassLoader.getSystemResource(pathFile).toURI();
        Path pathToRuleFile = Paths.get(Paths.get(uri).toString());
        return Files.readAllBytes(pathToRuleFile);
    }

}
