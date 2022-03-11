package ru.pdd.rule.service;

import java.io.IOException;

public interface ImageService {
    byte[] getImageInByte(String urlImage) throws IOException;
}
