package uz.consortgroup.core.api.v1.dto.course.response.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseStatus;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.response.module.ModuleResponseDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDto {
    private UUID id;
    private UUID authorId;
    private CourseType courseType;
    private PriceType priceType;
    private BigDecimal priceAmount;
    private BigDecimal discountPercent;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer accessDurationMin;
    private CourseStatus courseStatus;
    private String coverImageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<CourseTranslationResponseDto> translations;
    private List<ModuleResponseDto> modules;
}
