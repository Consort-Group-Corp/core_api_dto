package uz.consortgroup.core.api.v1.dto.forum.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.LanguageCode;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumTopicResponseDto {
    private UUID id;
    private UUID forumId;
    private UUID authorId;
    private String title;
    private String content;
    private LanguageCode languageCode;
    private String lessonRefType;
    private UUID lessonRefId;
    private Instant createdAt;
    private Instant updatedAt;
}
