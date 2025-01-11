package cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 五项费用成本分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class FiveIndicatorCostRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "22577")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "实际原辅材料（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际原辅材料（美元）")
    private BigDecimal actualRawMaterialsCostUsd;

    @Schema(description = "实际燃料动力费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际燃料动力费（美元）")
    private BigDecimal actualEnergyCostUsd;

    @Schema(description = "实际人工费用（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际人工费用（美元）")
    private BigDecimal actualLaborCostUsd;

    @Schema(description = "实际备品备件及维检费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际备品备件及维检费（美元）")
    private BigDecimal actualMaintenanceCostUsd;

    @Schema(description = "实际其他直接费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际其他直接费（美元）")
    private BigDecimal actualOtherDirectCostUsd;

    @Schema(description = "计划原辅材料（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划原辅材料（美元）")
    private BigDecimal plannedRawMaterialsCostUsd;

    @Schema(description = "计划燃料动力费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划燃料动力费（美元）")
    private BigDecimal plannedEnergyCostUsd;

    @Schema(description = "计划人工费用（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划人工费用（美元）")
    private BigDecimal plannedLaborCostUsd;

    @Schema(description = "计划备品备件及维检费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划备品备件及维检费（美元）")
    private BigDecimal plannedMaintenanceCostUsd;

    @Schema(description = "计划其他直接费（美元）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划其他直接费（美元）")
    private BigDecimal plannedOtherDirectCostUsd;

    @Schema(description = "实际输送镍金属量（吨）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际输送镍金属量（吨）")
    private BigDecimal actualNickelTons;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}