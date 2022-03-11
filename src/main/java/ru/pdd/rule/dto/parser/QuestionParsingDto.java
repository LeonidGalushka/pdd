package ru.pdd.rule.dto.parser;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class QuestionParsingDto {
    private Long title;
    @JsonAlias("ticket_number")
    private Long ticketNumber;
    private String image;
    private String question;
    private List<Answer> answers;
    @JsonAlias("correct_answer")
    private String correctAnswer;
    @JsonAlias("answer_tip")
    private String answerTip;
    private String topic;
}
