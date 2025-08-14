package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "LessonType", description = "Тип урока", example = "VIDEO")
public enum LessonType {
    VIDEO,
    AUDIO,
    TEXT
}
