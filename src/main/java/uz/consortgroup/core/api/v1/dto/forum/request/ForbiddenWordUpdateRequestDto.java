package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Обновление плохого слова")
public class ForbiddenWordUpdateRequestDto {
    @Schema(description = "Плохое слово", example = "@#$%^!!")
    private String word;

    @Schema(description = "Активность", example = "true")
    private Boolean active;
}
