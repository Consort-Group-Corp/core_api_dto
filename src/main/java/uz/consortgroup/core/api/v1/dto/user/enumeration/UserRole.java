package uz.consortgroup.core.api.v1.dto.user.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Роли пользователей")
public enum UserRole {
    SUPER_ADMIN,
    ADMIN,
    MENTOR,
    STUDENT,
    HR,
    MODERATOR,
    ACCOUNTANT,
    TECH_SUPPORT,
    GUEST_USER,
    MANAGER_COURSE,
    ANALYST
}
