package ru.pdd.rule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.pdd.rule.dto.response.QuestionResponseDto;
import ru.pdd.rule.error.exception.ParserFileException;
import ru.pdd.rule.mapping.RuleMapper;
import ru.pdd.rule.utils.JsonParser;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final RuleMapper ruleMapper;

    @Cacheable(value = "QuestionsCache")
    @Override
    public List<QuestionResponseDto> getAllQuestions() throws ParserFileException {
        List<QuestionResponseDto> questionResponseDtos = ruleMapper
                .toQuestionResponseDtos(JsonParser.getAllQuestion());
        return questionResponseDtos;
    }

    public List<QuestionResponseDto> getTicketForId(Long id) throws ParserFileException {
        return getAllQuestions()
                .stream()
                .filter(ticket -> ticket.getTicketNumber().equals(id))
                .limit(20)
                .collect(Collectors.toList());
    }

}
