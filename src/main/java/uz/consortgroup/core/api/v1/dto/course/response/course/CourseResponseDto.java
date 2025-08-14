package uz.consortgroup.core.api.v1.dto.course.response.course;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseStatus;
import uz.consortgroup.core.api.v1.dto.course.enumeration.CourseType;
import uz.consortgroup.core.api.v1.dto.course.enumeration.PriceType;
import uz.consortgroup.core.api.v1.dto.course.response.module.ModuleResponseDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
@Schema(name = "CourseResponseDto", description = "Полная информация о курсе")
public class CourseResponseDto {

    @Schema(description = "ID курса", example = "9e09e19d-2988-453f-ab69-e8f39a8f723b")
    private UUID id;

    @Schema(description = "ID автора курса", example = "e2f00427-fd76-41ad-940e-4624955f9384")
    private UUID authorId;

    @Schema(description = "Тип курса", example = "BASE", implementation = CourseType.class)
    private CourseType courseType;

    @Schema(description = "Тип оплаты", example = "PAID", implementation = PriceType.class)
    private PriceType priceType;

    @Schema(description = "Стоимость", example = "99.99")
    private BigDecimal priceAmount;

    @Schema(description = "Скидка, %", example = "10.0")
    private BigDecimal discountPercent;

    @Schema(description = "Начало доступа", type = "string", format = "date-time",
            example = "2025-05-01T10:00:00Z")
    private Instant startTime;

    @Schema(description = "Окончание доступа", type = "string", format = "date-time",
            example = "2025-07-01T10:00:00Z")
    private Instant endTime;

    @Schema(description = "Длительность доступа в минутах", example = "1440")
    private Integer accessDurationMin;

    @Schema(description = "Статус курса", example = "ACTIVE", implementation = CourseStatus.class)
    private CourseStatus courseStatus;

    @Schema(description = "URL обложки", example = "https://cdn.example.com/covers/java.png")
    private String coverImageUrl;

    @Schema(description = "Дата создания", type = "string", format = "date-time",
            example = "2025-08-13T23:02:19.5947094")
    private LocalDateTime createdAt;

    @Schema(description = "Дата обновления", type = "string", format = "date-time",
            example = "2025-08-13T23:12:00.0000000")
    private LocalDateTime updatedAt;

    @ArraySchema(arraySchema = @Schema(description = "Переводы курса"),
            schema = @Schema(implementation = CourseTranslationResponseDto.class))
    private List<CourseTranslationResponseDto> translations;

    @ArraySchema(arraySchema = @Schema(description = "Модули курса"),
            schema = @Schema(implementation = ModuleResponseDto.class))
    private List<ModuleResponseDto> modules;
}
