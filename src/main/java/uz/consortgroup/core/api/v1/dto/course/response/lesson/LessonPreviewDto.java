package uz.consortgroup.core.api.v1.dto.course.response.lesson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonPreviewDto {
    private UUID id;
    private String title;
    private int durationMinutes;
}
