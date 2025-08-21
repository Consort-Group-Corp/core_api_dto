package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "Создание форумной группы", description = "HR создает форумную группу")
public class CreateForumGroupByHrRequest {

    @NotNull(message = "Course ID is required")
    @Schema(description = "Идентификатор курса", format = "uuid",
            pattern = UUID_PATTERN_SCHEMA, requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID courseId;

    @NotEmpty(message = "User list cannot be empty")
    @ArraySchema(arraySchema = @Schema(description = "Список пользователей, которых включить в группу",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(format = "uuid", pattern = UUID_PATTERN_SCHEMA))
    private List<UUID> userIds;

    @NotNull(message = "Owner ID is required")
    @Schema(description = "Идентификатор ментора (владельца группы)", format = "uuid",
            pattern = UUID_PATTERN_SCHEMA, example = "8f0e2b8a-9a4b-4d1a-9e2a-1e2f3a4b5c6d",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID ownerId;

    @NotNull(message = "Start time is required")
    @Schema(description = "Дата/время начала действия группы (UTC, ISO-8601)",
            type = "string", format = "date-time", example = "2025-08-14T09:00:00Z",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Instant startTime;

    @NotNull(message = "End time is required")
    @Schema(description = "Дата/время окончания действия группы (UTC, ISO-8601). Должна быть позже startTime.",
            type = "string", format = "date-time", example = "2025-09-14T09:00:00Z",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Instant endTime;
}
