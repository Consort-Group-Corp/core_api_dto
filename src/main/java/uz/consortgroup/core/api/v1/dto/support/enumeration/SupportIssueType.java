package uz.consortgroup.core.api.v1.dto.support.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "SupportIssueType",
        description = "Тип проблемы: предустановленный вариант или произвольный комментарий"
)
public enum SupportIssueType { PRESET, CUSTOM }