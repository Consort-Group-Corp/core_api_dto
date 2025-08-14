package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Статус заказа")
public enum OrderStatus {
    NEW,
    PAID,
    CANCELLED,
    FAILED;

    public boolean isPayable() {
        return this == NEW;
    }
}