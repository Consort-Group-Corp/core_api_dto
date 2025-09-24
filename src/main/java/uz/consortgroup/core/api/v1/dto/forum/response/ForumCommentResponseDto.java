package uz.consortgroup.core.api.v1.dto.forum.response;

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
@Schema(description = "Комментарии к форуму")
public class ForumCommentResponseDto {
    @Schema(description = "ID комментария", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID forumId;

    @Schema(description = "ID темы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID topicId;

    @Schema(description = "ID автора", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID authorId;

    @Schema(description = "Содержание", example = "Комментарии к форуму")
    private String content;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant createdAt;

    @Schema(description = "Время обновления", example = "2025-01-01T00:00:00")
    private Instant updatedAt;
}
