package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "CourseType", description = "Тип курса", example = "BASE")
public enum CourseType {
     BASE,
     SPECIAL,
     PREMIUM,
     SCHOOL
}