package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.LanguageCode;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Тема форума")
public class ForumTopicResponseDto {

    @Schema(description = "ID темы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID forumId;

    @Schema(description = "ID автора", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID authorId;

    @Schema(description = "Заголовок", example = "Новый заголовок")
    private String title;

    @Schema(description = "Содержание", example = "Новое содержание")
    private String content;

    @Schema(description = "Язык", example = "RU")
    private LanguageCode languageCode;

    @Schema(description = "Тип ссылки на внешний объект (например LESSON, WEBINAR, EXTERNAL_URL, NONE)", example = "LESSON")
    private String lessonRefType;

    @Schema(description = "ID внешнего объекта (например lessonId, webinarId). Может быть null, если type=NONE или EXTERNAL_URL",
            pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID lessonRefId;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant createdAt;

    @Schema(description = "Время обновления", example = "2025-01-01T00:00:00")
    private Instant updatedAt;
}
