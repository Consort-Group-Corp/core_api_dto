package uz.consortgroup.core.api.v1.dto.user.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ForumAccessType", description = "Тип доступа к форуму")
public enum ForumAccessType {
    OPEN,
    CLOSED
}
