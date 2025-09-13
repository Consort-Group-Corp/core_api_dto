package uz.consortgroup.core.api.v1.dto.support.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdatePresetRequestDto {
    @Size(max = 255)
    private String text;
    private Integer sortOrder;
    private Boolean active;
}