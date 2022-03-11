package ru.pdd.rule.dto.response;

import lombok.Data;
import ru.pdd.rule.dto.parser.Answer;

import java.util.List;

@Data
public class QuestionResponseDto {
    private Long title;
    private Long ticketNumber;
    private String linkImage;
    private String question;
    private List<Answer> answers;
    private String correctAnswer;
    private String answerTip;
    private String topic;
}
