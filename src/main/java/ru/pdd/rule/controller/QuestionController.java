package ru.pdd.rule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pdd.rule.helpers.JsonParser;
import ru.pdd.rule.model.Rule;
import ru.pdd.rule.repository.RuleRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllQuestions() {
        return new ResponseEntity<>(JsonParser.getAllQuestion(), HttpStatus.OK);
    }

    private final RuleRepository ruleRepository;


    @GetMapping(value = "/a", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<?> test() {

        return null;
    }


}
