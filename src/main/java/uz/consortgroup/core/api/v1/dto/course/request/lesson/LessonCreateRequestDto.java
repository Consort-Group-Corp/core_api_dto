package uz.consortgroup.core.api.v1.dto.course.request.lesson;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.LessonType;
import uz.consortgroup.core.api.v1.dto.course.request.resource.ResourceCreateRequestDto;


import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "LessonCreateRequestDto", description = "Создание урока внутри модуля")
public class LessonCreateRequestDto {
    @Schema(description = "ID урока", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID lessonId;

    @NotNull(message = "Module ID is required")
    @Schema(description = "ID модуля", example = "8dee3104-5753-45fa-acd2-d60585304619",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID moduleId;

    @NotNull(message = "Order position is required")
    @Schema(description = "Позиция урока в модуле", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @NotNull(message = "Lesson type is required")
    @Schema(description = "Тип урока", example = "VIDEO",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = LessonType.class)
    private LessonType lessonType;

    @NotBlank(message = "Content URL is required")
    @Schema(description = "URL контента (видео/текст/и т.д.)", example = "https://cdn.example.com/lesson1.mp4",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String contentUrl;

    @Schema(description = "Длительность урока в минутах", example = "30")
    private Integer durationMinutes;

    @NotNull(message = "Is preview is required")
    @Schema(description = "Доступен ли урок в превью", example = "true",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Boolean isPreview;

    @ArraySchema(arraySchema = @Schema(description = "Переводы урока"),
            schema = @Schema(implementation = LessonTranslationRequestDto.class))
    private List<LessonTranslationRequestDto> translations;

    @NotNull(message = "Resources are required")
    @Size(min = 1, message = "At least one resource is required")
    @ArraySchema(arraySchema = @Schema(description = "Ресурсы урока",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(implementation = ResourceCreateRequestDto.class))
    private List<ResourceCreateRequestDto> resources;
}