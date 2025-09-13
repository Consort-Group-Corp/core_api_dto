package uz.consortgroup.core.api.v1.dto.support.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.TicketStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TicketCreatedResponse {
    private TicketStatus ticketStatus;
    private String message;
}
