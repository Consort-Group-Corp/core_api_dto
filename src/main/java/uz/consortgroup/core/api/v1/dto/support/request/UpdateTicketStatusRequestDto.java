package uz.consortgroup.core.api.v1.dto.support.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.SupportTicketStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "UpdateTicketStatusRequest", description = "Запрос на изменение статуса тикета")
public class UpdateTicketStatusRequestDto {
    @Schema(description = "Новый статус тикета", example = "IN_PROGRESS")
    private SupportTicketStatus status;
}
