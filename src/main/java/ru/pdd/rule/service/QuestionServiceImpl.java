package ru.pdd.rule.service;

import ru.pdd.rule.dto.Question;
import ru.pdd.rule.error.exception.ParserFileException;
import ru.pdd.rule.helpers.JsonParser;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<Question> getAllQuestions() throws ParserFileException {
        return JsonParser.getAllQuestion();
    }
}
