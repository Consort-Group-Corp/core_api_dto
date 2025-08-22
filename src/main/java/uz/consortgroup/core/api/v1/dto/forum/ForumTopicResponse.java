package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForumTopicResponse {
    @Schema(description = "ID топика", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID forumId;

    @Schema(description = "Название топика", example = "Java основы")
    private String title;

    @Schema(description = "Содержание топика", example = "Java основы")
    private String content;

    @Schema(description = "ID автора топика", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID authorId;

    @Schema(description = "Дата создания (UTC, ISO-8601)", example = "2025-08-22T09:30:00Z")
    private Instant createdAt;
}
