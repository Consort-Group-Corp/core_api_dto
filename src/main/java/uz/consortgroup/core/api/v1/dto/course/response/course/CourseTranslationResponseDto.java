package uz.consortgroup.core.api.v1.dto.course.response.course;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.Language;


import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "CourseTranslationResponseDto", description = "Перевод курса")
public class CourseTranslationResponseDto {
    @Schema(description = "ID перевода", example = "36a9400d-8821-4da8-88a4-b0eedfabbfb4")
    private UUID id;

    @Schema(description = "Язык (RU/EN/UZ)", example = "RU", implementation = Language.class)
    private Language language;

    @Schema(description = "Название", example = "Курс по Java")
    private String title;

    @Schema(description = "Описание", example = "Углублённый курс по разработке на Java")
    private String description;

    @Schema(description = "Slug", example = "kurs-po-java-dlya-nachinayushchih")
    private String slug;
}