package uz.consortgroup.core.api.v1.dto.course.request.module;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.request.lesson.LessonCreateRequestDto;


import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ModuleCreateRequestDto", description = "Создание модуля курса")
public class ModuleCreateRequestDto {
    @NotNull(message = "Module name is required")
    @Schema(description = "ID курса", example = "9e09e19d-2988-453f-ab69-e8f39a8f723b",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID courseId;

    @NotBlank(message = "Module name is required")
    @Schema(description = "Название модуля", example = "Основы Java",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private String moduleName;

    @NotNull(message = "Order position is required")
    @Schema(description = "Позиция модуля в курсе", example = "1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer orderPosition;

    @NotNull(message = "Is active is required")
    @Schema(description = "Активен ли модуль", example = "true",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Boolean isActive;

    @ArraySchema(arraySchema = @Schema(description = "Переводы модуля"),
            schema = @Schema(implementation = ModuleTranslationRequestDto.class))
    private List<ModuleTranslationRequestDto> translations;

    @ArraySchema(arraySchema = @Schema(description = "Уроки модуля"),
            schema = @Schema(implementation = LessonCreateRequestDto.class))
    private List<LessonCreateRequestDto> lessons;
}