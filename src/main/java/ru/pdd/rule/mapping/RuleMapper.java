package ru.pdd.rule.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.pdd.rule.dto.parser.Question;
import ru.pdd.rule.dto.response.QuestionResponse;
import ru.pdd.rule.helpers.DataFromResources;

import java.util.List;

@Mapper
public interface RuleMapper {

    @Mapping(source = "image", target = "image", qualifiedByName = "toImageList")
    QuestionResponse QuestionToQuestionResponse(Question recommendationFilter);

    List<QuestionResponse> QuestionToQuestionResponses(List<Question> recommendationFilter);

    @Named("toImageList")
    default byte[] toImageList(String imagesURL) {

        try {
            return DataFromResources.getDataFromResourcesInBytes(String.format("%s" + imagesURL, "data"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
