package uz.consortgroup.core.api.v1.dto.forum.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ForumAccessPolicy;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(description = "Создание форума")
public class ForumCreateRequestDto {

    @NotNull(message = "Course ID is required")
    private UUID courseId;

    @NotNull(message = "Forum access policy is required")
    private ForumAccessPolicy forumAccessPolicy;

    private UUID groupId;

    @NotBlank(message = "Title is required")
    private String title;

    @NotNull(message = "Start time is required")
    private Instant startTime;

    @NotNull(message = "End time is required")
    private Instant endTime;
}
