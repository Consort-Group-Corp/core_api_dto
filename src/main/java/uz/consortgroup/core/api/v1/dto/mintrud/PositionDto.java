package uz.consortgroup.core.api.v1.dto.mintrud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PositionDto {
    private String org;
    private String position;
    private LocalDate startDate;
    private String tin;
    private String department;
}
