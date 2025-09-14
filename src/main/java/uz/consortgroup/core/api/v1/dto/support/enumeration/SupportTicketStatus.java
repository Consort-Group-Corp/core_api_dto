package uz.consortgroup.core.api.v1.dto.support.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "SupportTicketStatus",
        description = "Статус тикета в тех.поддержку",
        allowableValues = {"NEW", "IN_PROGRESS", "CLOSED"}
)
public enum SupportTicketStatus { NEW, IN_PROGRESS, CLOSED }