package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumCommentResponseDto {
    private UUID id;
    private UUID forumId;
    private UUID topicId;
    private UUID authorId;
    private String content;
    private Instant createdAt;
    private Instant updatedAt;
}
