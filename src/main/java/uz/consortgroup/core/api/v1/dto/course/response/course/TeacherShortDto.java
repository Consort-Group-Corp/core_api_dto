package uz.consortgroup.core.api.v1.dto.course.response.course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherShortDto {
    private UUID id;
    private String fullName;
    private String position;
}
