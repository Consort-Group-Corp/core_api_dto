package uz.consortgroup.core.api.v1.dto.course.response.module;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.Language;


import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ModuleTranslationResponseDto", description = "Перевод модуля")
public class ModuleTranslationResponseDto {
    @Schema(description = "ID перевода")
    private UUID id;

    @Schema(description = "Язык", example = "RU", implementation = Language.class)
    private Language language;

    @Schema(description = "Заголовок", example = "Введение")
    private String title;

    @Schema(description = "Описание", example = "Первый модуль — знакомство с курсом")
    private String description;
}