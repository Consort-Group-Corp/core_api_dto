package uz.consortgroup.core.api.v1.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.user.enumeration.EligibilityReason;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EligibilityResponse {
    private boolean eligible;
    private EligibilityReason reason;
    private Integer accessUntil;
}
