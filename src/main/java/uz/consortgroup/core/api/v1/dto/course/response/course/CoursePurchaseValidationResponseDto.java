package uz.consortgroup.core.api.v1.dto.course.response.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseNotPurchasableReason;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseStatus;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CoursePurchaseValidationResponseDto {
    private UUID id;
    private CourseStatus courseStatus;
    private CourseType courseType;
    private PriceType priceType;
    private BigDecimal priceAmount;
    private Instant startTime;
    private Instant endTime;
    private boolean purchasable;
    private CourseNotPurchasableReason reason;
}
