package ru.pdd.rule.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.pdd.rule.dto.parser.QuestionParsingDto;
import ru.pdd.rule.dto.response.QuestionResponseDto;

import java.util.List;

@Mapper
public interface RuleMapper {

    // @Mapping(source = "image", target = "image", qualifiedByName = "toImageList")
    @Mapping(source = "image", target = "linkImage")
    QuestionResponseDto toQuestionResponseDto(QuestionParsingDto questionParsingDto);

    List<QuestionResponseDto> toQuestionResponseDtos(List<QuestionParsingDto> questionParsingDtos);

//    @Named("toImageList")
//    default byte[] toImageList(String imagesURL) {
//
//        try {
//            return DataFromResources.getDataFromResourcesInBytes(String.format("%s" + imagesURL, "data"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
