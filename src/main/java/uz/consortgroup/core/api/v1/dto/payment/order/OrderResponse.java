package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "OrderResponse", description = "Ответ после создания заказа")
public class OrderResponse {

    @Schema(description = "ID заказа", format = "uuid",
            example = "5fc0a7c1-6f07-47a9-9a45-9a0b5f7e3c2a")
    private UUID id;

    @Schema(description = "ID пользователя", format = "uuid",
            example = "2fbbf276-e14f-4db3-a2b3-db543d51d69c")
    private UUID userId;

    @Schema(description = "Внешний ID заказа", example = "ORD-2025-000123")
    private String externalOrderId;

    @Schema(description = "ID оплачиваемого объекта", format = "uuid",
            example = "b6a1dd6c-f6f1-4b42-9b0a-2d7a2d2d3c1f")
    private UUID itemId;

    @Schema(description = "Сумма в UZS (целое число)", example = "150000")
    private Long amount;

    @Schema(description = "Тип оплачиваемого объекта", example = "COURSE")
    private OrderItemType itemType;

    @Schema(description = "Источник платежа", example = "PAYME")
    private OrderSource source;

    @Schema(description = "Статус заказа", example = "NEW")
    private OrderStatus status;

    @Schema(description = "Время создания", type = "string", format = "date-time",
            example = "2025-08-13T12:34:56Z")
    private Instant createdAt;

    @Schema(description = "Время обновления", type = "string", format = "date-time",
            example = "2025-08-13T12:34:56Z")
    private Instant updatedAt;
}
