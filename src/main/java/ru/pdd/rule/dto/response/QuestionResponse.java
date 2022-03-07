package ru.pdd.rule.dto.response;

import lombok.Data;
import ru.pdd.rule.dto.Answer;

import java.util.List;

@Data
public class QuestionResponse {
    private Long title;
    private Long ticketNumber;
    private byte[] image;
    private String question;
    private List<Answer> answers;
    private String correctAnswer;
    private String answerTip;
    private String topic;

/*    @Data
    public static class Answer {
        private String answerText;
        private boolean isCorrect;
    }*/
}
