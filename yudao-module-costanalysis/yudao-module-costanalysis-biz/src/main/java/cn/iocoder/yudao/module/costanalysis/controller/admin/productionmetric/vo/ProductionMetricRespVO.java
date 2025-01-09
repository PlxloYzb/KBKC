package cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 生产指标分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ProductionMetricRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14482")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "实际输送矿浆含镍量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际输送矿浆含镍量（T）")
    private BigDecimal actualSlurryNickelTons;

    @Schema(description = "实际输送干矿（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际输送干矿（T）")
    private BigDecimal actualDryOreTons;

    @Schema(description = "实际输送矿浆平均浓度（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际输送矿浆平均浓度（%）")
    private BigDecimal actualSlurryConcentrationPct;

    @Schema(description = "实际输出矿浆镍品位（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际输出矿浆镍品位（%）")
    private BigDecimal actualOutputNickelGradePct;

    @Schema(description = "实际矿浆含钴金属量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际矿浆含钴金属量（T）")
    private BigDecimal actualSlurryCobaltTons;

    @Schema(description = "实际采剥总量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际采剥总量（T）")
    private BigDecimal actualMiningTotalTons;

    @Schema(description = "实际铬精矿外运量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际铬精矿外运量（T）")
    private BigDecimal actualChromeExportTons;

    @Schema(description = "实际铬精矿干矿产量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际铬精矿干矿产量（T）")
    private BigDecimal actualChromeDryProductionTons;

    @Schema(description = "计划输送矿浆含镍量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划输送矿浆含镍量（T）")
    private BigDecimal plannedSlurryNickelTons;

    @Schema(description = "计划输送干矿（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划输送干矿（T）")
    private BigDecimal plannedDryOreTons;

    @Schema(description = "计划输送矿浆平均浓度（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划输送矿浆平均浓度（%）")
    private BigDecimal plannedSlurryConcentrationPct;

    @Schema(description = "计划输出矿浆镍品位（%）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划输出矿浆镍品位（%）")
    private BigDecimal plannedOutputNickelGradePct;

    @Schema(description = "计划矿浆含钴金属量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划矿浆含钴金属量（T）")
    private BigDecimal plannedSlurryCobaltTons;

    @Schema(description = "计划采剥总量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划采剥总量（T）")
    private BigDecimal plannedMiningTotalTons;

    @Schema(description = "计划铬精矿外运量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划铬精矿外运量（T）")
    private BigDecimal plannedChromeExportTons;

    @Schema(description = "计划铬精矿干矿产量（T）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划铬精矿干矿产量（T）")
    private BigDecimal plannedChromeDryProductionTons;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}