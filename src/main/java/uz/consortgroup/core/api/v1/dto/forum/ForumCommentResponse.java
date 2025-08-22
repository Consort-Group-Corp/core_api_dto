package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ForumCommentResponse", description = "Ответ с данными созданного/полученного комментария")
public class ForumCommentResponse {

    @Schema(description = "Идентификатор комментария", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "Идентификатор топика, к которому относится комментарий", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID topicId;

    @Schema(description = "Идентификатор автора комментария", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID authorId;

    @Schema(description = "Текст комментария", example = "Спасибо за пояснение!")
    private String content;

    @Schema(description = "Дата и время создания (UTC, ISO-8601)", example = "2025-08-22T10:15:30Z")
    private Instant createdAt;

    @Schema(description = "Дата и время обновления (UTC, ISO-8601). Может быть null, если не обновлялся", example = "2025-08-22T11:00:00Z")
    private Instant updatedAt;
}
