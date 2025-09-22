package uz.consortgroup.core.api.v1.dto.forum.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.ForumAccessType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ForumListQuery {
    private String search;
    private String commentsCount;
    private String likesCount;
    private String createdAt;
    private ForumAccessType accessType;
    private String tutor;
    private Integer page;
    private Integer limit;
}
