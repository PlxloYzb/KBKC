package cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 水源地生产分析新增/修改 Request VO")
@Data
public class WaterSourceProductionDetailsSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "9464")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "水源地供水量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "水源地供水量不能为空")
    private BigDecimal waterSourceSupplyVolumePerM3;

    @Schema(description = "水源地耗电量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "水源地耗电量不能为空")
    private BigDecimal waterSourcePowerConsumptionKwh;

    @Schema(description = "供水单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "供水单耗不能为空")
    private BigDecimal waterSupplyPowerUnitConsumptionKwhPerM3;

}