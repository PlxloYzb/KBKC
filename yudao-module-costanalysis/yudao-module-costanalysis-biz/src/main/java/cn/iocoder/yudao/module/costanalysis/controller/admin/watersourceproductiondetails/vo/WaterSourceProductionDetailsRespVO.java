package cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 水源地生产分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WaterSourceProductionDetailsRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "9464")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "水源地供水量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("水源地供水量")
    private BigDecimal waterSourceSupplyVolumePerM3;

    @Schema(description = "水源地耗电量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("水源地耗电量")
    private BigDecimal waterSourcePowerConsumptionKwh;

    @Schema(description = "供水单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("供水单耗")
    private BigDecimal waterSupplyPowerUnitConsumptionKwhPerM3;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}