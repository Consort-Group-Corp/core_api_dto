package uz.consortgroup.core.api.v1.dto.course.response.lesson;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.LessonType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "LessonResponseDto", description = "Информация об уроке")
public class LessonResponseDto {
    @Schema(description = "ID урока")
    private UUID id;

    @Schema(description = "ID модуля")
    private UUID moduleId;

    @Schema(description = "Позиция в модуле", example = "1")
    private Integer orderPosition;

    @Schema(description = "Тип урока", example = "VIDEO", implementation = LessonType.class)
    private LessonType lessonType;

    @Schema(description = "URL контента", example = "https://cdn.example.com/lesson1.mp4")
    private String contentUrl;

    @Schema(description = "Длительность, мин", example = "30")
    private Integer durationMinutes;

    @Schema(description = "Превью", example = "true")
    private Boolean isPreview;

    @Schema(description = "Создан", type = "string", format = "date-time")
    private LocalDateTime createdAt;

    @Schema(description = "Обновлён", type = "string", format = "date-time")
    private LocalDateTime updatedAt;

    @ArraySchema(arraySchema = @Schema(description = "Переводы урока"),
            schema = @Schema(implementation = LessonTranslationResponseDto.class))
    private List<LessonTranslationResponseDto> translations;
}