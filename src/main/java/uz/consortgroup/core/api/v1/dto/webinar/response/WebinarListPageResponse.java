package uz.consortgroup.core.api.v1.dto.webinar.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class WebinarListPageResponse {
    private List<WebinarListItemResponseDto> webinars;
    private boolean empty;
    private String message;
    private int totalPages;
    private long totalElements;
}
