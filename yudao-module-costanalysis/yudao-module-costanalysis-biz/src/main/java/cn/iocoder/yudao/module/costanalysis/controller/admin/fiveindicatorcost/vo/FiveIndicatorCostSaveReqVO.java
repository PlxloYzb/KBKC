package cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 五项费用成本分析新增/修改 Request VO")
@Data
public class FiveIndicatorCostSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "22577")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际原辅材料（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际原辅材料（美元）不能为空")
    private BigDecimal actualRawMaterialsCostUsd;

    @Schema(description = "实际燃料动力费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际燃料动力费（美元）不能为空")
    private BigDecimal actualEnergyCostUsd;

    @Schema(description = "实际人工费用（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际人工费用（美元）不能为空")
    private BigDecimal actualLaborCostUsd;

    @Schema(description = "实际备品备件及维检费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际备品备件及维检费（美元）不能为空")
    private BigDecimal actualMaintenanceCostUsd;

    @Schema(description = "实际其他直接费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际其他直接费（美元）不能为空")
    private BigDecimal actualOtherDirectCostUsd;

    @Schema(description = "计划原辅材料（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划原辅材料（美元）不能为空")
    private BigDecimal plannedRawMaterialsCostUsd;

    @Schema(description = "计划燃料动力费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划燃料动力费（美元）不能为空")
    private BigDecimal plannedEnergyCostUsd;

    @Schema(description = "计划人工费用（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划人工费用（美元）不能为空")
    private BigDecimal plannedLaborCostUsd;

    @Schema(description = "计划备品备件及维检费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划备品备件及维检费（美元）不能为空")
    private BigDecimal plannedMaintenanceCostUsd;

    @Schema(description = "计划其他直接费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划其他直接费（美元）不能为空")
    private BigDecimal plannedOtherDirectCostUsd;

    @Schema(description = "实际输送镍金属量（吨）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际输送镍金属量（吨）不能为空")
    private BigDecimal actualNickelTons;

}