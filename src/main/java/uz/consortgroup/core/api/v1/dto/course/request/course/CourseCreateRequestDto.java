package uz.consortgroup.core.api.v1.dto.course.request.course;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseStatus;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.request.module.ModuleCreateRequestDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseCreateRequestDto {
    @NotNull
    private UUID authorId;

    @NotNull(message = "Course type is required")
    private CourseType courseType;

    @NotNull(message = "Price type is required")
    private PriceType priceType;

    private BigDecimal priceAmount;

    private BigDecimal discountPercent;

    private Instant startTime;

    private Instant endTime;

    private Integer accessDurationMin;

    @NotNull(message = "Course status is required")
    private CourseStatus courseStatus;

    private String coverImageUrl;

    @NotEmpty(message = "Course translations are required")
    private List<CourseTranslationRequestDto> translations;

    private List<ModuleCreateRequestDto> modules;
}