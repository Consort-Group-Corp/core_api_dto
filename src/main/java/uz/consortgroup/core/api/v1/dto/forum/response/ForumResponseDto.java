package uz.consortgroup.core.api.v1.dto.forum.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ForumAccessPolicy;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Форум")
public class ForumResponseDto {
    @Schema(description = "ID форума", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "ID курса", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID courseId;

    @Schema(description = "ID создателя", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID ownerId;

    @Schema(description = "Политика доступа", example = "PUBLIC")
    private ForumAccessPolicy forumAccessPolicy;

    @Schema(description = "ID группы", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID groupId;

    @Schema(description = "Заголовок", example = "Новый заголовок")
    private String title;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant startTime;

    @Schema(description = "Время окончания", example = "2025-01-01T00:00:00")
    private Instant endTime;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant createdAt;
}
