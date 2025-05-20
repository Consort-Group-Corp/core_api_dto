package uz.consortgroup.core.api.v1.dto.course.request.module;

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
public class ModuleTranslationRequestDto {
    @NotNull
    private Language language;
    private String title;
    private String description;
}