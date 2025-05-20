package uz.consortgroup.core.api.v1.dto.course.request.lesson;

import jakarta.validation.constraints.NotBlank;
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
public class LessonTranslationRequestDto {
    @NotNull(message = "Language is required")
    private Language language;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;
}