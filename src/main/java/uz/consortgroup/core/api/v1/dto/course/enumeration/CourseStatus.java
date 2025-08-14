package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "CourseStatus", description = "Статус курса", example = "ACTIVE")
public enum CourseStatus {
    ACTIVE,
    INACTIVE,
    DRAFT,
    PUBLISHED,
    ARCHIVED,
    HIDDEN
}