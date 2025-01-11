package cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 电厂发电成本分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class NpowerPlantRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "19345")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "发电量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("发电量")
    private BigDecimal powerGenerationKwh;

    @Schema(description = "实际电厂发电燃料动力费", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际电厂发电燃料动力费")
    private BigDecimal actualPowerPlantFuelCostUsd;

    @Schema(description = "实际电厂发电人工费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际电厂发电人工费用")
    private BigDecimal actualPowerPlantLaborCostUsd;

    @Schema(description = "实际电厂发电维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际电厂发电维检费")
    private BigDecimal actualPowerPlantMaintenanceCostUsd;

    @Schema(description = "实际电厂发电其他直接费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际电厂发电其他直接费用")
    private BigDecimal actualPowerPlantOtherDirectCostUsd;

    @Schema(description = "计划燃料单位成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划燃料单位成本")
    private BigDecimal plannedPowerPlantFuelCostUsdPerKwh;

    @Schema(description = "计划人工单位成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划人工单位成本")
    private BigDecimal plannedPowerPlantLaborCostUsdPerKwh;

    @Schema(description = "计划维检费单位成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划维检费单位成本")
    private BigDecimal plannedPowerPlantMaintenanceCostUsdPerKwh;

    @Schema(description = "计划制造费用单位成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划制造费用单位成本")
    private BigDecimal plannedPowerPlantOtherDirectCostUsdPerKwh;

    @Schema(description = "计划镍金属产量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划镍金属产量")
    private BigDecimal plannedNickelProductionTons;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}