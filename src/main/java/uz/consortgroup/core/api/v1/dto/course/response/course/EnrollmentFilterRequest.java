package uz.consortgroup.core.api.v1.dto.course.response.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentFilterRequest {
    private UUID courseId;
    private List<UUID> userIds;
}