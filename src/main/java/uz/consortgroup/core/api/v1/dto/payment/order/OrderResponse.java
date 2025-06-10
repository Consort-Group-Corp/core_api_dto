package uz.consortgroup.core.api.v1.dto.payment.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderResponse {
    private UUID id;
    private UUID userId;
    private String externalOrderId;
    private Long amount;
    private OrderItemType itemType;
    private OrderSource source;
    private OrderStatus status;
    private Instant createdAt;
    private Instant updatedAt;
}