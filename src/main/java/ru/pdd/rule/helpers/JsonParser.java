package ru.pdd.rule.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import ru.pdd.rule.PddApplication;
import ru.pdd.rule.dto.parser.Question;
import ru.pdd.rule.error.exception.ParserFileException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@UtilityClass
public class JsonParser {

    // TODO сделать аналог этой аннотации, чтоб чз конфиг менять могли ее
    // @Value("${path.file.rule}")
    // private String pathFile;

    private String pathFile = "data/rule.txt";

    public List<Question> getAllQuestion() throws ParserFileException {
        try {
            Question[] questions = new ObjectMapper()
                    .readValue(DataFromResources.getDataFromResourcesInBytes(pathFile), Question[].class);
            return Arrays.asList(questions);
        } catch (Exception ex) {
            throw new ParserFileException("error in parsing file!");
        }
    }

}
