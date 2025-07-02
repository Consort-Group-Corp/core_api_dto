package uz.consortgroup.core.api.v1.dto.mintrud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LabourJobPositionResponse {
    private String jsonrps;
    private String id;
    private JobPositionResult result;
}
