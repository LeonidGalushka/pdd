package ru.pdd.rule.dto.parser;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Answer {
    @JsonAlias("answer_text")
    private String answerText;
    @JsonAlias("is_correct")
    private boolean isCorrect;
}
