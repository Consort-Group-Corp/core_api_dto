package uz.consortgroup.core.api.v1.dto.course.response.image;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.resource.ResourceTranslationResponseDto;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ImageUploadResponseDto", description = "Результат загрузки одного изображения")
public class ImageUploadResponseDto {
    @Schema(description = "ID ресурса", example = "3d1f2c34-1e7e-42c5-9b3f-2d8d8fa1f123")
    private UUID resourceId;

    @Schema(description = "URL файла", example = "https://cdn.example.com/image1.png")
    private String fileUrl;

    @Schema(description = "Порядок", example = "1")
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationResponseDto.class))
    private List<ResourceTranslationResponseDto> translations;
}