package uz.consortgroup.core.api.v1.dto.forum;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.AccessFilter;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.CreatedAtSort;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.SortDir;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ForumListParamsRequestDto {
    private String search;
    private AccessFilter accessFilter;
    private UUID mentorId;
    private SortDir commentsCount;
    private SortDir likesCount;
    private CreatedAtSort createdAt;

    @Min(value = 1, message = "Page must be at least 1")
    private Integer page;

    @Min(value = 1, message = "Limit must be at least 1")
    @Max(value = 100, message = "Limit must be at most 100")
    private Integer limit;
}
