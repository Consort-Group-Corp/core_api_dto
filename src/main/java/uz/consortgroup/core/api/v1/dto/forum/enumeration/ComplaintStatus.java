package uz.consortgroup.core.api.v1.dto.forum.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Статус жалобы")
public enum ComplaintStatus {
    NEW, REVIEWING, RESOLVED, REJECTED
}
