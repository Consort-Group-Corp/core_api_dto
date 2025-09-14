package uz.consortgroup.core.api.v1.dto.support.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.support.enumeration.TicketStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "TicketCreatedResponse", description = "Результат создания тикета")
public class TicketCreatedResponse {
    @Schema(description = "Статус операции", implementation = TicketStatus.class, example = "SUCCESS")
    private TicketStatus ticketStatus;

    @Schema(description = "Сообщение для пользователя", example = "Заявка отправлена")
    private String message;
}
