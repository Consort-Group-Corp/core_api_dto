package uz.consortgroup.core.api.v1.dto.course.response.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.response.module.ModulePreviewDto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoursePreviewResponseDto {
    private UUID id;
    private String coverImageUrl;
    private PriceType priceType;
    private BigDecimal priceAmount;
    private List<CourseTranslationResponseDto> translations;
    private TeacherShortDto teacher;
    private List<ModulePreviewDto> modules;
}
