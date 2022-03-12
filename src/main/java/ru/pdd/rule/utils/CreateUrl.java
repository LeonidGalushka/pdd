package ru.pdd.rule.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CreateUrl {

    public String getAllUrlImage(PathResources pathResourcesWithImage, String imageUrl) {
        return String.format("%s%s", pathResourcesWithImage.getTitle(), imageUrl);
    }

    public String getAllUrl(String separator, String... pathUrl) {
        return String.join(separator, pathUrl);
    }

    public String getAllUrlWithStartSep(String separator, String... pathUrl) {
        return String.format("%s" + getAllUrl(separator, pathUrl), SpecTools.SEPARATOR);
    }

}
