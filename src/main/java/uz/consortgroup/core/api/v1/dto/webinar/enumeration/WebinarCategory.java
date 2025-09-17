package uz.consortgroup.core.api.v1.dto.webinar.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "WebinarCategory", description = "Категория вебинара", example = "PLANNED")
public enum WebinarCategory {
    PLANNED, PAST;

    @JsonCreator
    public static WebinarCategory from(String v) {
        return WebinarCategory.valueOf(v.trim().toUpperCase());
    }
}