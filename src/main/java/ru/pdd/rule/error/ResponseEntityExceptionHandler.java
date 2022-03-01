package ru.pdd.rule.error;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.pdd.rule.error.exception.ParserFileException;

@ControllerAdvice
@RequiredArgsConstructor
public class ResponseEntityExceptionHandler {

    @ExceptionHandler({
            ParserFileException.class
    })
    protected ResponseEntity<Object> handleParse(RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
