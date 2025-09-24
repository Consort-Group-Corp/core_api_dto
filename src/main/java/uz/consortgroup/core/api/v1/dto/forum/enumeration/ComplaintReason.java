package uz.consortgroup.core.api.v1.dto.forum.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Причина жалобы")
public enum ComplaintReason {
    SPAM,
    FLOOD,
    ADVERTISING,
    LINKS,
    OFF_TOPIC,
    ABUSE,
    HARASSMENT,
    HATE_SPEECH,
    TROLLING,
    TOXIC_BEHAVIOR,
    PROFANITY,
    OBSCENE_LANGUAGE,
    SCAM,
    IMPERSONATION,
    FAKE_INFO,
    NSFW,
    PORNOGRAPHY,
    VIOLENCE,
    EXTREMISM,
    CHEATING,
    EXPLOIT,
    MULTI_ACCOUNT,
    EVASION,
    THREATS,
    PRIVATE_INFO,
    ILLEGAL_CONTENT,
    RULES_VIOLATION,
    ADMIN_DECISION,
    TEMPORARY_BAN,
    OTHER
}
