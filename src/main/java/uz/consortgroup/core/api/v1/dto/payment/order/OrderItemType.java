package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Тип оплачиваемого объекта")
public enum OrderItemType {
    COURSE,
    SUBSCRIPTION,
    CERTIFICATE
}