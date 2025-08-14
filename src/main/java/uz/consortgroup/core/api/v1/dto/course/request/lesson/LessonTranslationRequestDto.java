package uz.consortgroup.core.api.v1.dto.course.request.lesson;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
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
@Schema(name = "LessonTranslationRequestDto", description = "Перевод метаданных урока")
public class LessonTranslationRequestDto {
    @NotNull(message = "Language is required")
    @Schema(description = "Язык перевода (RU/EN/UZ)", example = "RU",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = Language.class)
    private Language language;

    @NotBlank(message = "Title is required")
    @Schema(description = "Название урока", example = "Введение",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String title;

    @Schema(description = "Описание урока", example = "Первый урок курса")
    private String description;
}