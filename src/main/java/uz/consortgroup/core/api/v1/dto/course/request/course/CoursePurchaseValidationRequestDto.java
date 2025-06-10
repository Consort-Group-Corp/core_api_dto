package uz.consortgroup.core.api.v1.dto.course.request.course;

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
public class CoursePurchaseValidationRequestDto {
    @NotNull(message = "Course ID must not be null")
    private UUID courseId;
}
