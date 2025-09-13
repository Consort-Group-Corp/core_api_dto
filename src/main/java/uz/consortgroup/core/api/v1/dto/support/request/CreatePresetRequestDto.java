package uz.consortgroup.core.api.v1.dto.support.request;

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
public class CreatePresetRequestDto {
    @NotNull(message = "Role is required")
    private UserRole role;

    @Size(max = 255)
    @NotBlank(message = "Text is required")
    private String text;
    private Integer sortOrder;
    private Boolean active;
}
