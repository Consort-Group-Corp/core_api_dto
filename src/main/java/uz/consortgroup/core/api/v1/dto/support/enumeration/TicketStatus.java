package uz.consortgroup.core.api.v1.dto.support.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "TicketStatus",
        description = "Результат создания тикета",
        allowableValues = {"SUCCESS", "FAILED"}
)
public enum TicketStatus {
    SUCCESS,
    FAILED
}
