package uz.consortgroup.core.api.v1.dto.forum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateForumCommentRequest {
    @NotNull(message = "Topic ID is required")
    private UUID topicId;

    @NotNull(message = "Author ID is required")
    private UUID authorId;

    @NotBlank(message = "Content is required")
    private String content;
}
