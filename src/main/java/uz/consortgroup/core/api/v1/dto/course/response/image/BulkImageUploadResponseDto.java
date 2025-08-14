package uz.consortgroup.core.api.v1.dto.course.response.image;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ImageUploadResponseDto", description = "Результат загрузки одного изображения")
public class BulkImageUploadResponseDto {
    @ArraySchema(arraySchema = @Schema(description = "Результаты по каждому изображению"),
            schema = @Schema(implementation = ImageUploadResponseDto.class))
    private List<ImageUploadResponseDto> images;
}