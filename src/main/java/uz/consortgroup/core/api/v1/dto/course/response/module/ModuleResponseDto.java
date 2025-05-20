package uz.consortgroup.core.api.v1.dto.course.response.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.response.lesson.LessonResponseDto;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModuleResponseDto {
    private UUID id;
    private UUID courseId;
    private String moduleName;
    private Integer orderPosition;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<ModuleTranslationResponseDto> translations;
    private List<LessonResponseDto> lessons;
}