package uz.consortgroup.core.api.v1.dto.course.request.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseCoverDto {
    private UUID courseId;
    private String coverImageUrl;
}