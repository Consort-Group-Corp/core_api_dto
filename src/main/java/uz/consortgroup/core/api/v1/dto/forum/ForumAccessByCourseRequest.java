package uz.consortgroup.core.api.v1.dto.forum;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ForumAccessByCourseRequest {
    @NotNull(message = "User ID is required")
    private UUID userId;

    @NotNull(message = "Course ID is required")
    private UUID courseId;
}
