package uz.consortgroup.core.api.v1.dto.forum.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.forum.enumeration.LanguageCode;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ForumTopicUpdateRequestDto {

    @Size(max = 120, message = "Title must be at most 120 characters")
    private String title;

    private String content;

    private LanguageCode languageCode;

    @Size(max = 32, message = "Lesson ref type must be at most 32 characters")
    private String lessonRefType;

    private UUID lessonRefId;
}
