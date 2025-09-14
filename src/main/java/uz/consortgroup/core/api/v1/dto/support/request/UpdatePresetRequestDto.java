package uz.consortgroup.core.api.v1.dto.support.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UpdatePresetRequest", description = "Запрос на обновление пресета")
public class UpdatePresetRequestDto {
    @Size(max = 255)
    @Schema(description = "Новый текст пресета", maxLength = 255, example = "Не можем добавить материалы")
    private String text;

    @Schema(description = "Новый порядок сортировки", example = "1")
    private Integer sortOrder;

    @Schema(description = "Активность пресета", example = "true")
    private Boolean active;
}