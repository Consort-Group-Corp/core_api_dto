package uz.consortgroup.core.api.v1.dto.course.request.image;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "BulkImageUploadRequestDto", description = "Пакетная загрузка изображений (метаданные)")
public class BulkImageUploadRequestDto {
    @NotEmpty(message = "Image list must not be empty")
    @ArraySchema(arraySchema = @Schema(description = "Список метаданных изображений",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(implementation = ImageUploadRequestDto.class))
    private List<ImageUploadRequestDto> images;
}