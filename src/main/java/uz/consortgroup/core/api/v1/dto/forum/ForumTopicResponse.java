package uz.consortgroup.core.api.v1.dto.forum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForumTopicResponse {
    private UUID id;
    private String title;
    private String content;
    private UUID authorId;
    private Instant createdAt;
}
