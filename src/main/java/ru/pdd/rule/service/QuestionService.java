package ru.pdd.rule.service;

import ru.pdd.rule.dto.Question;
import ru.pdd.rule.error.exception.ParserFileException;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions() throws ParserFileException;
}
