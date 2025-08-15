package uz.consortgroup.core.api.v1.dto.course.request.resource;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.MimeType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.ResourceType;


import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ResourceCreateRequestDto", description = "Создание ресурса урока (видео/изображение/документ и т.д.)")
public class ResourceCreateRequestDto {
    @NotNull(message = "Lesson ID is required")
    @Schema(description = "ID урока", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID lessonId;

    @NotNull(message = "Resource type is required")
    @Schema(description = "Тип ресурса", example = "VIDEO",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = ResourceType.class)
    private ResourceType resourceType;

    @NotNull(message = "File URL is required")
    @Schema(description = "URL файла ресурса", example = "https://cdn.example.com/lesson1/video.mp4",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String fileUrl;

    @Schema(description = "Размер файла в байтах", example = "1048576")
    private Long fileSize;

    @Schema(description = "MIME-тип", example = "video/mp4", implementation = MimeType.class)
    private MimeType mimeType;

    @NotNull(message = "Order position is required")
    @Schema(description = "Порядок ресурса в уроке", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @ArraySchema(arraySchema = @Schema(description = "Переводы ресурса"),
            schema = @Schema(implementation = ResourceTranslationRequestDto.class))
    private List<ResourceTranslationRequestDto> translations;
}