package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ForumAccessPolicy;

import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Обновление форума")
public class ForumUpdateRequestDto {

    @Schema(description = "Заголовок", example = "Новый заголовок")
    @NotBlank(message = "Title is required")
    private String title;

    @Schema(description = "Политика доступа", example = "PUBLIC")
    @NotNull(message = "Forum access policy is required")
    private ForumAccessPolicy forumAccessPolicy;

    @Schema(description = "ID группы", pattern = UUID_PATTERN_SCHEMA)
    private UUID groupId;

    @Schema(description = "Начало", example = "2025-01-01T00:00:00")
    @NotNull(message = "Start time is required")
    private Instant startTime;

    @Schema(description = "Конец", example = "2025-01-01T00:00:00")
    @NotNull(message = "End time is required")
    private Instant endTime;
}
