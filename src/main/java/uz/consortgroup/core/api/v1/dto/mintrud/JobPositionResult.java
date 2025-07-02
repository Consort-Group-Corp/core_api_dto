package uz.consortgroup.core.api.v1.dto.mintrud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JobPositionResult {
    private int id;
    private String pinfl;
    private String surname;
    private String patronym;
    private List<PositionDto> positions;
}
