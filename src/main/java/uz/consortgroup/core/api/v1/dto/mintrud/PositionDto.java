package uz.consortgroup.core.api.v1.dto.mintrud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PositionDto {
    private String org;
    private String position;
}
