package uz.consortgroup.core.api.v1.dto.course.request.course;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseStatus;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.request.module.ModuleCreateRequestDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static uz.consortgroup.core.api.v1.dto.constants.SchemaPatterns.UUID_PATTERN_SCHEMA;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Schema(name = "CourseCreateRequestDto", description = "Запрос на создание курса с переводами, модулями и уроками")
public class CourseCreateRequestDto {
    @NotNull
    @Schema(description = "ID автора", type = "string", maxLength = 36, pattern = UUID_PATTERN_SCHEMA)
    private UUID authorId;

    @NotNull(message = "Course type is required")
    @Schema(description = "Тип курса", example = "BASE",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = CourseType.class)
    private CourseType courseType;

    @NotNull(message = "Price type is required")
    @Schema(description = "Тип оплаты", example = "PAID",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = PriceType.class)
    private PriceType priceType;

    @Schema(description = "Стоимость (если платный курс)", example = "99.99")
    private BigDecimal priceAmount;

    @Schema(description = "Скидка в процентах", example = "10.0")
    private BigDecimal discountPercent;

    @Schema(description = "Время начала доступа", type = "string", format = "date-time",
            example = "2025-05-01T10:00:00Z")
    private Instant startTime;

    @Schema(description = "Время окончания доступа", type = "string", format = "date-time",
            example = "2025-07-01T10:00:00Z")
    private Instant endTime;

    @Schema(description = "Длительность доступа (в минутах)", example = "1440")
    private Integer accessDurationMin;

    @NotNull(message = "Course status is required")
    @Schema(description = "Статус курса", example = "ACTIVE",
            requiredMode = Schema.RequiredMode.REQUIRED, implementation = CourseStatus.class)
    private CourseStatus courseStatus;

    @Schema(description = "URL обложки курса", example = "https://cdn.example.com/covers/java.png")
    private String coverImageUrl;

    @NotEmpty(message = "Course translations are required")
    @ArraySchema(arraySchema = @Schema(description = "Переводы курса",
            requiredMode = Schema.RequiredMode.REQUIRED),
            schema = @Schema(implementation = CourseTranslationRequestDto.class))
    private List<CourseTranslationRequestDto> translations;

    @ArraySchema(arraySchema = @Schema(description = "Модули курса"),
            schema = @Schema(implementation = ModuleCreateRequestDto.class))
    private List<ModuleCreateRequestDto> modules;
}