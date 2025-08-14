package uz.consortgroup.core.api.v1.dto.course.request.image;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.request.resource.ResourceTranslationRequestDto;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ImageUploadRequestDto", description = "Метаданные одного изображения")
public class ImageUploadRequestDto {
    @NotNull(message = "Order position is required")
    @Schema(description = "Позиция порядка в уроке", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationRequestDto.class))
    private List<ResourceTranslationRequestDto> translations;
}