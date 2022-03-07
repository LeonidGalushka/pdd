package ru.pdd.rule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.pdd.rule.dto.parser.Question;
import ru.pdd.rule.dto.response.QuestionResponse;
import ru.pdd.rule.error.exception.ParserFileException;
import ru.pdd.rule.helpers.JsonParser;
import ru.pdd.rule.mapping.RuleMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final RuleMapper ruleMapper;

    @Cacheable(value = "QuestionsCache")
    @Override
    public List<QuestionResponse> getAllQuestions() throws ParserFileException {
        List<Question> questions = JsonParser.getAllQuestion();
        List<QuestionResponse> questionResponses = ruleMapper.QuestionToQuestionResponses(questions);
        return questionResponses;
    }

    public List<QuestionResponse> getTicketForId(Long id) {
        return getAllQuestions()
                .stream()
                .filter(ticket -> ticket.getTicketNumber().equals(id))
                .limit(20)
                .collect(Collectors.toList());
    }

}
