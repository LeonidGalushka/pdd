package ru.pdd.rule.utils;

import lombok.Getter;

public enum PathResources {

    DATA("data"),
    DATA_IMAGES("data/images");

    @Getter
    private String title;

    PathResources(String title) {
        this.title = title;
    }
}
