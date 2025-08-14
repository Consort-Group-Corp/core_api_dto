package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ResourceType", description = "Тип ресурса", example = "VIDEO")
public enum ResourceType {
    VIDEO,
    AUDIO,
    TEXT,
    PDF,
    IMAGE,
    SLIDES,
    QUIZ,
    ASSIGNMENT,
    LINK,
    ARCHIVE
}