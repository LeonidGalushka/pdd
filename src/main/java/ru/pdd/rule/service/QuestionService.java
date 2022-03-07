package ru.pdd.rule.service;

import ru.pdd.rule.dto.response.QuestionResponse;
import ru.pdd.rule.error.exception.ParserFileException;

import java.util.List;

public interface QuestionService {
    List<QuestionResponse> getAllQuestions() throws ParserFileException;
    List<QuestionResponse> getTicketForId(Long id);
}
