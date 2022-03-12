package ru.pdd.rule.mapping;

import org.apache.logging.log4j.util.Strings;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.pdd.rule.dto.parser.QuestionParsingDto;
import ru.pdd.rule.dto.response.QuestionResponseDto;
import ru.pdd.rule.utils.CreateUrl;
import ru.pdd.rule.utils.SpecTools;

import java.util.List;

@Mapper
public interface RuleMapper {

    @Mapping(source = "image", target = "linkImage", qualifiedByName = "toImageLink")
    QuestionResponseDto toQuestionResponseDto(QuestionParsingDto questionParsingDto);

    List<QuestionResponseDto> toQuestionResponseDtos(List<QuestionParsingDto> questionParsingDtos);

    @Named("toImageLink")
    default String toImageList(String imagesUrl) {
        return CreateUrl.getAllUrl(Strings.EMPTY, SpecTools.DOMAIN, imagesUrl);
    }
}
