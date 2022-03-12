package ru.pdd.rule.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import ru.pdd.rule.dto.parser.QuestionParsingDto;
import ru.pdd.rule.error.exception.ParserFileException;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class JsonParser {

    //private String pathFile = "data/rule.txt";
    private final String pathFile = CreateUrl.getAllUrl(SpecTools.SEPARATOR,
            PathResources.DATA.getTitle(), SpecTools.RULE_FILE);

    public List<QuestionParsingDto> getAllQuestion() throws ParserFileException {
        try {
            QuestionParsingDto[] questionParsingDtos = new ObjectMapper()
                    .readValue(DataFromResources.getDataFromResourcesInBytes(pathFile), QuestionParsingDto[].class);
            return Arrays.asList(questionParsingDtos);
        } catch (Exception ex) {
            throw new ParserFileException("error in parsing file!");
        }
    }

}
