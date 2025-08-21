package uz.consortgroup.core.api.v1.dto.forum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ForumListResponseDto {
    private Long total;
    private Integer page;
    private Integer limit;
    private List<ForumListItemResponseDto> data;
}