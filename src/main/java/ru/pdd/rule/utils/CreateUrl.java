package ru.pdd.rule.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateUrl {

    public String getAllUrlImage(PathResources pathResources, String imageUrl) {
        return String.format("%s%s", pathResources.getTitle(), imageUrl);
    }
}
