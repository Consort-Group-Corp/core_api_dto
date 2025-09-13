package uz.consortgroup.core.api.v1.dto.support.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportTicketStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateTicketStatusRequestDto {
    private SupportTicketStatus status;
}
