package uz.consortgroup.core.api.v1.dto.support.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.UserRole;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "CreatePresetRequest", description = "Запрос на создание пресета для роли")
public class CreatePresetRequestDto {
    @Schema(description = "Роль, для которой действует пресет")
    @NotNull(message = "Role is required")
    private UserRole role;

    @Schema(description = "Текст пресета", example = "Не получается сохранить курс", maxLength = 255)
    @Size(max = 255)
    @NotBlank(message = "Text is required")
    private String text;

    @Schema(description = "Порядок сортировки (чем меньше, тем выше)", example = "0")
    private Integer sortOrder;

    @Schema(description = "Признак активности пресета", example = "true", defaultValue = "true")
    private Boolean active;
}
