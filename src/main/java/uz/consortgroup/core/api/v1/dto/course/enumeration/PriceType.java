package uz.consortgroup.core.api.v1.dto.course.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "PriceType", description = "Тип цены", example = "PAID")
public enum PriceType {
    FREE,
    PAID
}