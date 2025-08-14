package uz.consortgroup.core.api.v1.dto.course.request.video;

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
@Schema(name = "VideoUploadRequestDto", description = "Метаданные одного видео")
public class VideoUploadRequestDto {
    @NotNull(message = "Duration is required")
    @Schema(description = "Длительность видео в секундах", example = "120",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer duration;

    @Schema(description = "Разрешение видео", example = "1080p")
    private String resolution;

    @NotNull(message = "Order position is required")
    @Schema(description = "Позиция видео в уроке", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationRequestDto.class))
    private List<ResourceTranslationRequestDto> translations;
}