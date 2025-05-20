package uz.consortgroup.core.api.v1.dto.course.response.module;

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
public class ModuleTranslationResponseDto {
    private UUID id;
    private Language language;
    private String title;
    private String description;
}