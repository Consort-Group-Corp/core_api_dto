package uz.consortgroup.core.api.v1.dto.course.request.course;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.Language;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "CourseTranslationRequestDto", description = "Перевод метаданных курса")
public class CourseTranslationRequestDto {
    @Schema(description = "Язык (RU/EN/UZ)", example = "RU", implementation = Language.class)
    private Language language;

    @Schema(description = "Название курса", example = "Курс по Java")
    private String title;

    @Schema(description = "Описание курса", example = "Углублённый курс по разработке на Java")
    private String description;

    @NotNull(message = "Slug is required")
    @Schema(description = "Человеко-понятный идентификатор (slug)",
            example = "kurs-po-java-dlya-nachinayushchih", requiredMode = Schema.RequiredMode.REQUIRED)
    private String slug;
}