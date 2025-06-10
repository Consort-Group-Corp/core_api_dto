package uz.consortgroup.core.api.v1.dto.payment.order;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderRequest {
    @NotNull(message = "userId is required")
    private UUID userId;

    @NotBlank(message = "externalOrderId is required")
    @Size(min = 1, max = 50, message = "External order ID must be between 1 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+$", message = "External order ID must contain only letters, numbers, underscores, or hyphens")
    private String externalOrderId;

    @NotNull(message = "itemId is required")
    private UUID itemId;

    @NotNull(message = "itemType is required")
    private OrderItemType itemType;

    @NotNull(message = "amount is required")
    @Positive(message = "amount must be positive")
    @Min(value = 500, message = "amount must be at least 500")
    private Long amount;

    @NotNull(message = "source is required")
    private OrderSource source;
}
