package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.LanguageCode;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Обновление темы форума")
public class ForumTopicUpdateRequestDto {

    @Size(max = 120, message = "Title must be at most 120 characters")
    @Schema(description = "Заголовок темы", example = "Новый заголовок темы")
    private String title;

    @Schema(description = "Содержание темы", example = "Новое содержание темы")
    private String content;

    @Schema(description = "Язык темы", example = "RU")
    private LanguageCode languageCode;

    @Schema(description = "Тип ссылки на внешний объект (например LESSON, WEBINAR, EXTERNAL_URL, NONE)",
            example = "LESSON",
            allowableValues = {"LESSON", "WEBINAR", "EXTERNAL_URL", "NONE"})
    @Size(max = 32, message = "Lesson ref type must be at most 32 characters")
    private String lessonRefType;

    @Schema(description = "ID внешнего объекта (например lessonId, webinarId). Может быть null, если type=NONE или EXTERNAL_URL")
    private UUID lessonRefId;
}
