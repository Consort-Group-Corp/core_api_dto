package uz.consortgroup.core.api.v1.dto.course.request.module;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.Language;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "ModuleTranslationRequestDto", description = "Перевод метаданных модуля")
public class ModuleTranslationRequestDto {
    @NotNull(message = "Language is required")
    @Schema(description = "Язык перевода (RU/EN/UZ)", example = "RU",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = Language.class)
    private Language language;

    @Schema(description = "Заголовок модуля", example = "Введение")
    private String title;

    @Schema(description = "Описание модуля", example = "Первый модуль — знакомство с курсом")
    private String description;
}