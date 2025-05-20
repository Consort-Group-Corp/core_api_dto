package uz.consortgroup.core.api.v1.dto.course.response.lesson;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.LessonType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonResponseDto {
    private UUID id;
    private UUID moduleId;
    private Integer orderPosition;
    private LessonType lessonType;
    private String contentUrl;
    private Integer durationMinutes;
    private Boolean isPreview;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<LessonTranslationResponseDto> translations;
}