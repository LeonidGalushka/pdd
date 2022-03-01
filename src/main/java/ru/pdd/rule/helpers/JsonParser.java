package ru.pdd.rule.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import ru.pdd.rule.dto.Question;
import ru.pdd.rule.error.exception.ParserFileException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@UtilityClass
public class JsonParser {

    // TODO сделать аналог этой аннотации, чтоб чз конфиг менять могли ее
    // @Value("${path.file.rule}")
    // private String pathFile;

    public List<Question> getAllQuestion() throws ParserFileException {
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get("D://pdd//src//main//resources//data//rule.txt"));
            Question[] questions = new ObjectMapper().readValue(jsonData, Question[].class);
            return Arrays.asList(questions);
//          return Arrays.asList(new ObjectMapper().readValue(getJsonDataForByte(), Question[].class));
        } catch (Exception ex) {
            throw new ParserFileException("error in parsing file!");
        }
    }

//    private byte[] getJsonDataForByte() throws IOException {
//        return Files.readAllBytes(Paths.get(pathFile));
//    }

}
