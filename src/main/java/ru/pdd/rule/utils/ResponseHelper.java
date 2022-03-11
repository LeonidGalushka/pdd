package ru.pdd.rule.utils;

import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class ResponseHelper {
    public static <T> ResponseEntity<?> okOrNoContent(T content) {
        return Optional.ofNullable(content)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.noContent().build());
    }
}
