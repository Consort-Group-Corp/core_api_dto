package uz.consortgroup.core.api.v1.dto.course.response.video;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.resource.ResourceTranslationResponseDto;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "VideoUploadResponseDto", description = "Результат загрузки одного видео")
public class VideoUploadResponseDto {
    @Schema(description = "ID ресурса")
    private UUID resourceId;

    @Schema(description = "URL файла", example = "https://cdn.example.com/video1.mp4")
    private String fileUrl;

    @Schema(description = "Длительность, сек", example = "120")
    private Integer durationSeconds;

    @Schema(description = "Разрешение", example = "1080p")
    private String resolution;

    @Schema(description = "Порядок", example = "1")
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationResponseDto.class))
    private List<ResourceTranslationResponseDto> translations;
}