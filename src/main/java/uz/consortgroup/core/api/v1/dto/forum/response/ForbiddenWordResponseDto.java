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
@Schema(description = "Запрещенное слово")
public class ForbiddenWordResponseDto {
    @Schema(description = "ID запрещенного слова", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "Плохое слово", example = "@#$%@#$%!!")
    private String word;

    @Schema(description = "Активность", example = "true")
    private boolean active;

    @Schema(description = "ID создателя", pattern = UUID_PATTERN_SCHEMA)
    private UUID createdBy;

    @Schema(description = "Время создания", example = "2025-01-01T00:00:00")
    private Instant createdAt;

    @Schema(description = "Время обновления", example = "2025-01-01T00:00:00")
    private Instant updatedAt;
}
