package ru.pdd.rule.service;

import ru.pdd.rule.dto.response.QuestionResponseDto;
import ru.pdd.rule.error.exception.ParserFileException;

import java.util.List;

public interface QuestionService {

    List<QuestionResponseDto> getAllQuestions() throws ParserFileException;

    List<QuestionResponseDto> getTicketForId(Long id) throws ParserFileException;

}
