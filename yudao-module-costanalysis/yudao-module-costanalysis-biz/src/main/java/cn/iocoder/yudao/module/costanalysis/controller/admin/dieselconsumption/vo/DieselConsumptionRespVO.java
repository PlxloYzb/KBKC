package cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 柴油成本分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class DieselConsumptionRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18166")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "实际柴油消耗量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际柴油消耗量(L)")
    private BigDecimal actualDieselConsumptionLiters;

    @Schema(description = "实际柴油消耗金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际柴油消耗金额（美元）")
    private BigDecimal actualDieselCostUsd;

    @Schema(description = "计划柴油消耗量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划柴油消耗量(L)")
    private BigDecimal plannedDieselConsumptionLiters;

    @Schema(description = "计划柴油消耗金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划柴油消耗金额（美元）")
    private BigDecimal plannedDieselCostUsd;

    @Schema(description = "实际发电柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际发电柴油量(L)")
    private BigDecimal actualPowerDieselConsumptionLiters;

    @Schema(description = "实际发电柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际发电柴油金额（美元）")
    private BigDecimal actualPowerDieselCostUsd;

    @Schema(description = "计划发电柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划发电柴油量(L)")
    private BigDecimal plannedPowerDieselConsumptionLiters;

    @Schema(description = "计划发电柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划发电柴油金额（美元）")
    private BigDecimal plannedPowerDieselCostUsd;

    @Schema(description = "实际机采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际机采柴油量(L)")
    private BigDecimal actualMechanicalDieselConsumptionLiters;

    @Schema(description = "实际机采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际机采柴油金额（美元）")
    private BigDecimal actualMechanicalDieselCostUsd;

    @Schema(description = "计划机采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划机采柴油量(L)")
    private BigDecimal plannedMechanicalDieselConsumptionLiters;

    @Schema(description = "计划机采柴油金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划机采柴油金额")
    private BigDecimal plannedMechanicalDieselCostUsd;

    @Schema(description = "实际水采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际水采柴油量(L)")
    private BigDecimal actualHydraulicDieselConsumptionLiters;

    @Schema(description = "实际水采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际水采柴油金额（美元）")
    private BigDecimal actualHydraulicDieselCostUsd;

    @Schema(description = "计划水采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划水采柴油量(L)")
    private BigDecimal plannedHydraulicDieseConsumptionlLiters;

    @Schema(description = "计划水采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划水采柴油金额（美元）")
    private BigDecimal plannedHydraulicDieselCostUsd;

    @Schema(description = "实际其他消耗柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际其他消耗柴油量(L)")
    private BigDecimal actualOtherDieselConsumptionLiters;

    @Schema(description = "实际其他消耗柴油金额(美元)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际其他消耗柴油金额(美元)")
    private BigDecimal actualOtherDieselCostUsd;

    @Schema(description = "计划其他消耗柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划其他消耗柴油量(L)")
    private BigDecimal plannedOtherDieselConsumptionLiters;

    @Schema(description = "计划其他消耗柴油金额(美元)", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划其他消耗柴油金额(美元)")
    private BigDecimal plannedOtherDieselCostUsd;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}