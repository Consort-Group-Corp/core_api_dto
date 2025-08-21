package uz.consortgroup.core.api.v1.dto.forum;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.user.enumeration.ForumAccessType;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ForumListItemResponseDto {
    private UUID id;
    private String title;
    private ForumAuthorDto author;
    private Instant createdAt;
    private Long commentsCount;
    private Long likesCount;
    private ForumAccessType accessType;
    private String previewImageUrl;
}
