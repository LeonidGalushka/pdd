package ru.pdd.rule.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class Question {
    private String title;
    @JsonAlias("ticket_number")
    private String ticketNumber;
    private String image;
    private String question;
    private List<Answer> answers;
    @JsonAlias("correct_answer")
    private String correctAnswer;
    @JsonAlias("answer_tip")
    private String answerTip;
    private String topic;
}
