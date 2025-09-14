package uz.consortgroup.core.api.v1.dto.support.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "PresetResponse", description = "Полная модель пресета")
public class PresetResponse {
    @Schema(description = "ID пресета", pattern = UUID_PATTERN_SCHEMA, maxLength = 36)
    private UUID id;

    @Schema(description = "Роль, для которой действует пресет", implementation = UserRole.class)
    private UserRole role;

    @Schema(description = "Текст пресета", example = "Не можем добавить материалы")
    private String text;

    @Schema(description = "Порядок сортировки", example = "0")
    private Integer sortOrder;

    @Schema(description = "Активен ли пресет", example = "true")
    private boolean active;
}