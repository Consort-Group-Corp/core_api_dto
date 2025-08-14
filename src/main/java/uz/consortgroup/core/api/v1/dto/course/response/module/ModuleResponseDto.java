package uz.consortgroup.core.api.v1.dto.course.response.module;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.lesson.LessonResponseDto;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ModuleResponseDto", description = "Информация о модуле")
public class ModuleResponseDto {
    @Schema(description = "ID модуля")
    private UUID id;

    @Schema(description = "ID курса")
    private UUID courseId;

    @Schema(description = "Название модуля", example = "Основы Java")
    private String moduleName;

    @Schema(description = "Порядок", example = "1")
    private Integer orderPosition;

    @Schema(description = "Активен", example = "true")
    private Boolean isActive;

    @Schema(description = "Создан", type = "string", format = "date-time")
    private LocalDateTime createdAt;

    @Schema(description = "Обновлён", type = "string", format = "date-time")
    private LocalDateTime updatedAt;

    @ArraySchema(arraySchema = @Schema(description = "Переводы модуля"),
            schema = @Schema(implementation = ModuleTranslationResponseDto.class))
    private List<ModuleTranslationResponseDto> translations;

    @ArraySchema(arraySchema = @Schema(description = "Уроки"),
            schema = @Schema(implementation = LessonResponseDto.class))
    private List<LessonResponseDto> lessons;
}