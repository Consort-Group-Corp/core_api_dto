package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Источник (провайдер) платежа")
public enum OrderSource {
    PAYME,
    CLICK
}
