package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "FileType", description = "Тип файла", example = "VIDEO")
public enum FileType {
    VIDEO,
    IMAGE,
    PDF
}