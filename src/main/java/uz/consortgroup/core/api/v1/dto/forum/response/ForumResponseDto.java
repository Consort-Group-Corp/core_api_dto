package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.ForumAccessPolicy;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumResponseDto {
    private UUID id;
    private UUID courseId;
    private UUID ownerId;
    private ForumAccessPolicy forumAccessPolicy;
    private UUID groupId;
    private String title;
    private Instant startTime;
    private Instant endTime;
    private Instant createdAt;
}
