package uz.consortgroup.core.api.v1.dto.forum;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
public class CreateForumGroupByHrRequest {
    
    @NotNull(message = "Course ID is required")
    private UUID courseId;

    @NotEmpty(message = "User list cannot be empty")
    private List<UUID> userIds;

    @NotNull(message = "Start time is required")
    private Instant startTime;

    @NotNull(message = "End time is required")
    private Instant endTime;
}
