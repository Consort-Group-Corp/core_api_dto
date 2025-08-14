package uz.consortgroup.core.api.v1.dto.payment.order;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "OrderRequest", description = "Запрос на создание заказа")
public class OrderRequest {

    @NotNull(message = "userId is required")
    @Schema(description = "Идентификатор пользователя", format = "uuid",
            example = "2fbbf276-e14f-4db3-a2b3-db543d51d69c", requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID userId;

    @NotBlank(message = "externalOrderId is required")
    @Size(min = 1, max = 50, message = "External order ID must be between 1 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+$", message = "External order ID must contain only letters, numbers, underscores, or hyphens")
    @Schema(description = "Внешний ID заказа во фронте/ERP. Только буквы/цифры/`_`/`-`.",
            example = "ORD-2025-000123", requiredMode = Schema.RequiredMode.REQUIRED)
    private String externalOrderId;

    @NotNull(message = "itemId is required")
    @Schema(description = "Идентификатор оплачиваемого объекта (курс/подписка/сертификат)", format = "uuid",
            example = "b6a1dd6c-f6f1-4b42-9b0a-2d7a2d2d3c1f", requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID itemId;

    @NotNull(message = "itemType is required")
    @Schema(description = "Тип оплачиваемого объекта", example = "COURSE",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private OrderItemType itemType;

    @NotNull(message = "amount is required")
    @Positive(message = "amount must be positive")
    @Min(value = 500, message = "amount must be at least 500")
    @Schema(description = "Сумма в UZS (целое число). Минимум — 500.", example = "150000",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private Long amount;

    @NotNull(message = "source is required")
    @Schema(description = "Платёжный провайдер/источник", example = "PAYME",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private OrderSource source;
}
