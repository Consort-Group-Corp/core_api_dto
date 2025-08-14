package uz.consortgroup.core.api.v1.dto.course.response.lesson;

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
@Schema(name = "LessonTranslationResponseDto", description = "Перевод урока")
public class LessonTranslationResponseDto {
    @Schema(description = "ID перевода")
    private UUID id;

    @Schema(description = "Язык", example = "RU", implementation = Language.class)
    private Language language;

    @Schema(description = "Заголовок", example = "Урок 1")
    private String title;

    @Schema(description = "Описание", example = "Первый урок")
    private String description;
}