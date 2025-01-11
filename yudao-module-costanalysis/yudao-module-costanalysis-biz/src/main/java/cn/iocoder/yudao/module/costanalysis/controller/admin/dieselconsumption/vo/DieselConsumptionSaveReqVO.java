package cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 柴油成本分析新增/修改 Request VO")
@Data
public class DieselConsumptionSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18166")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际柴油消耗量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际柴油消耗量(L)不能为空")
    private BigDecimal actualDieselConsumptionLiters;

    @Schema(description = "实际柴油消耗金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际柴油消耗金额（美元）不能为空")
    private BigDecimal actualDieselCostUsd;

    @Schema(description = "计划柴油消耗量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划柴油消耗量(L)不能为空")
    private BigDecimal plannedDieselConsumptionLiters;

    @Schema(description = "计划柴油消耗金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划柴油消耗金额（美元）不能为空")
    private BigDecimal plannedDieselCostUsd;

    @Schema(description = "实际发电柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际发电柴油量(L)不能为空")
    private BigDecimal actualPowerDieselConsumptionLiters;

    @Schema(description = "实际发电柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际发电柴油金额（美元）不能为空")
    private BigDecimal actualPowerDieselCostUsd;

    @Schema(description = "计划发电柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划发电柴油量(L)不能为空")
    private BigDecimal plannedPowerDieselConsumptionLiters;

    @Schema(description = "计划发电柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划发电柴油金额（美元）不能为空")
    private BigDecimal plannedPowerDieselCostUsd;

    @Schema(description = "实际机采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际机采柴油量(L)不能为空")
    private BigDecimal actualMechanicalDieselConsumptionLiters;

    @Schema(description = "实际机采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际机采柴油金额（美元）不能为空")
    private BigDecimal actualMechanicalDieselCostUsd;

    @Schema(description = "计划机采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划机采柴油量(L)不能为空")
    private BigDecimal plannedMechanicalDieselConsumptionLiters;

    @Schema(description = "计划机采柴油金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划机采柴油金额不能为空")
    private BigDecimal plannedMechanicalDieselCostUsd;

    @Schema(description = "实际水采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际水采柴油量(L)不能为空")
    private BigDecimal actualHydraulicDieselConsumptionLiters;

    @Schema(description = "实际水采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际水采柴油金额（美元）不能为空")
    private BigDecimal actualHydraulicDieselCostUsd;

    @Schema(description = "计划水采柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划水采柴油量(L)不能为空")
    private BigDecimal plannedHydraulicDieseConsumptionlLiters;

    @Schema(description = "计划水采柴油金额（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划水采柴油金额（美元）不能为空")
    private BigDecimal plannedHydraulicDieselCostUsd;

    @Schema(description = "实际其他消耗柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际其他消耗柴油量(L)不能为空")
    private BigDecimal actualOtherDieselConsumptionLiters;

    @Schema(description = "实际其他消耗柴油金额(美元)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际其他消耗柴油金额(美元)不能为空")
    private BigDecimal actualOtherDieselCostUsd;

    @Schema(description = "计划其他消耗柴油量(L)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划其他消耗柴油量(L)不能为空")
    private BigDecimal plannedOtherDieselConsumptionLiters;

    @Schema(description = "计划其他消耗柴油金额(美元)", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划其他消耗柴油金额(美元)不能为空")
    private BigDecimal plannedOtherDieselCostUsd;

}