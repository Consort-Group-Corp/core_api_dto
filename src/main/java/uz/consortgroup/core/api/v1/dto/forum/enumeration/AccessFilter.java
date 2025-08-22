package uz.consortgroup.core.api.v1.dto.forum.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;
import uz.consortgroup.core.api.v1.dto.user.enumeration.ForumAccessType;

@Schema(description = "Фильтр по доступу к форуму: ALL — не фильтровать")
public enum AccessFilter {
    ALL,
    OPEN,
    CLOSED;

    public ForumAccessType toForumAccessType() {
        return switch (this) {
            case OPEN -> ForumAccessType.OPEN;
            case CLOSED -> ForumAccessType.CLOSED;
            case ALL -> throw new IllegalStateException("ALL cannot be converted to ForumAccessType");
        };
    }
}
