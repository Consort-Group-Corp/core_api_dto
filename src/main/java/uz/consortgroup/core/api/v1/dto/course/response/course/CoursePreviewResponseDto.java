package uz.consortgroup.core.api.v1.dto.course.response.course;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.response.module.ModulePreviewDto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoursePreviewResponseDto {
    @Schema(description = "ID курса", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    @Schema(description = "Ссылка на обложку курса", example = "https://cdn.example.com/covers/java.png")
    private String coverImageUrl;

    @Schema(description = "Тип оплаты", example = "PAID")
    private PriceType priceType;

    @Schema(description = "Стоимость", example = "99.99")
    private BigDecimal priceAmount;

    @ArraySchema(arraySchema = @Schema(description = "Переводы курса"), schema = @Schema(implementation = CourseTranslationResponseDto.class))
    private List<CourseTranslationResponseDto> translations;

    @Schema
    private TeacherShortDto teacher;
    private List<ModulePreviewDto> modules;
}
