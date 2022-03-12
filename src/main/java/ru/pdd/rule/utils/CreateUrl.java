package ru.pdd.rule.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateUrl {

    public String getAllUrlImage(PathResources pathResourcesWithImage, String imageUrl) {
        return String.format("%s%s", pathResourcesWithImage.getTitle(), imageUrl);
    }

    public String getAllUrl(String... pathUrl) {
        return String.join("/", pathUrl);
    }
}
