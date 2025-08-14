package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "CreateForumGroupByHrRequest", description = "Параметры создания форумной группы")
public class CreateForumGroupByHrRequest {

    @NotNull(message = "Course ID is required")
    @Schema(description = "Идентификатор курса", format = "uuid",
            example = "b6a1dd6c-f6f1-4b42-9b0a-2d7a2d2d3c1f", requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID courseId;

    @NotEmpty(message = "User list cannot be empty")
    @ArraySchema(arraySchema = @Schema(description = "Список пользователей, которых включить в группу",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(format = "uuid", example = "2fbbf276-e14f-4db3-a2b3-db543d51d69c"))
    private List<UUID> userIds;

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
