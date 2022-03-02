package ru.pdd.rule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pdd.rule.dto.Question;
import ru.pdd.rule.error.exception.ParserFileException;
import ru.pdd.rule.helpers.JsonParser;

import java.util.List;


@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    @Override
    public List<Question> getAllQuestions() throws ParserFileException {
        return JsonParser.getAllQuestion();
    }
}
