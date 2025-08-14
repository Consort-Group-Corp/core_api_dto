package uz.consortgroup.core.api.v1.dto.course.request.course;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "CoursePurchaseValidationRequestDto", description = "Запрос на проверку возможности покупки курса")
public class CoursePurchaseValidationRequestDto {
    @NotNull(message = "Course ID must not be null")
    @Schema(description = "ID курса", example = "9e09e19d-2988-453f-ab69-e8f39a8f723b",
            requiredMode = Schema.RequiredMode.REQUIRED)
    private UUID courseId;
}
