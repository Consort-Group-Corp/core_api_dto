package uz.consortgroup.core.api.v1.dto.course.request.course;

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
public class CourseTranslationRequestDto {
    private Language language;
    private String title;
    private String description;
    @NotNull(message = "Slug is required")
    private String slug;
}