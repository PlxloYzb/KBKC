package cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 生产指标分析新增/修改 Request VO")
@Data
public class ProductionMetricSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14482")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际输送矿浆含镍量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际输送矿浆含镍量（T）不能为空")
    private BigDecimal actualSlurryNickelTons;

    @Schema(description = "实际输送干矿（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际输送干矿（T）不能为空")
    private BigDecimal actualDryOreTons;

    @Schema(description = "实际输送矿浆平均浓度（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际输送矿浆平均浓度（%）不能为空")
    private BigDecimal actualSlurryConcentrationPct;

    @Schema(description = "实际输出矿浆镍品位（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际输出矿浆镍品位（%）不能为空")
    private BigDecimal actualOutputNickelGradePct;

    @Schema(description = "实际矿浆含钴金属量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿浆含钴金属量（T）不能为空")
    private BigDecimal actualSlurryCobaltTons;

    @Schema(description = "实际采剥总量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际采剥总量（T）不能为空")
    private BigDecimal actualMiningTotalTons;

    @Schema(description = "实际铬精矿外运量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际铬精矿外运量（T）不能为空")
    private BigDecimal actualChromeExportTons;

    @Schema(description = "实际铬精矿干矿产量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际铬精矿干矿产量（T）不能为空")
    private BigDecimal actualChromeDryProductionTons;

    @Schema(description = "计划输送矿浆含镍量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划输送矿浆含镍量（T）不能为空")
    private BigDecimal plannedSlurryNickelTons;

    @Schema(description = "计划输送干矿（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划输送干矿（T）不能为空")
    private BigDecimal plannedDryOreTons;

    @Schema(description = "计划输送矿浆平均浓度（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划输送矿浆平均浓度（%）不能为空")
    private BigDecimal plannedSlurryConcentrationPct;

    @Schema(description = "计划输出矿浆镍品位（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划输出矿浆镍品位（%）不能为空")
    private BigDecimal plannedOutputNickelGradePct;

    @Schema(description = "计划矿浆含钴金属量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿浆含钴金属量（T）不能为空")
    private BigDecimal plannedSlurryCobaltTons;

    @Schema(description = "计划采剥总量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划采剥总量（T）不能为空")
    private BigDecimal plannedMiningTotalTons;

    @Schema(description = "计划铬精矿外运量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划铬精矿外运量（T）不能为空")
    private BigDecimal plannedChromeExportTons;

    @Schema(description = "计划铬精矿干矿产量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划铬精矿干矿产量（T）不能为空")
    private BigDecimal plannedChromeDryProductionTons;

}