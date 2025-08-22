package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "OrderResponse", description = "Ответ после создания заказа")
public class OrderResponse {

    @Schema(description = "ID заказа", type = "string", maxLength = 36,
            pattern = UUID_PATTERN_SCHEMA)
    private UUID id;

    @Schema(description = "ID пользователя", type = "string", maxLength = 36,
            pattern = UUID_PATTERN_SCHEMA)
    private UUID userId;

    @Schema(description = "Внешний ID заказа", example = "ORD-2025-000123")
    private String externalOrderId;

    @Schema(description = "ID оплачиваемого объекта", type = "string", maxLength = 36,
            pattern = UUID_PATTERN_SCHEMA)
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
