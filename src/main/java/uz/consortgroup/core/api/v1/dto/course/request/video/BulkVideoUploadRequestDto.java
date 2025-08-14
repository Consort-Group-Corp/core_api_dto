package uz.consortgroup.core.api.v1.dto.course.request.video;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
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
@Schema(name = "BulkVideoUploadRequestDto", description = "Пакетная загрузка видео (метаданные)")
public class BulkVideoUploadRequestDto {
    @NotEmpty(message = "Videos list can not be empty")
    @Valid
    @ArraySchema(arraySchema = @Schema(description = "Список метаданных видео",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(implementation = VideoUploadRequestDto.class))
    private List<VideoUploadRequestDto> videos;
}