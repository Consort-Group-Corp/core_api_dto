package uz.consortgroup.core.api.v1.dto.user.enumeration;

public enum EligibilityReason {
    OK,
    ALREADY_ACTIVE,
    USER_BLOCKED,
    USER_NOT_VERIFIED,
    USER_ROLE_NOT_ALLOWED,
    LIMIT_REACHED,
    COURSE_NOT_FOUND,
    COURSE_UNAVAILABLE,
    COURSE_NOT_PUBLISHED
}
