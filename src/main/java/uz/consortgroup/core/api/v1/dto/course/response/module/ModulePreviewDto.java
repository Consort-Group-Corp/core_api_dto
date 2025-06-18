package uz.consortgroup.core.api.v1.dto.course.response.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.lesson.LessonPreviewDto;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModulePreviewDto {
    private UUID id;
    private String title;
    private List<LessonPreviewDto> previewLessons;
}
