package uz.consortgroup.core.api.v1.dto.course.response.video;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "BulkVideoUploadResponseDto", description = "Результат пакетной загрузки видео")
public class BulkVideoUploadResponseDto {
    @ArraySchema(arraySchema = @Schema(description = "Результаты по каждому видео"),
            schema = @Schema(implementation = VideoUploadResponseDto.class))
    private List<VideoUploadResponseDto> videos;
}