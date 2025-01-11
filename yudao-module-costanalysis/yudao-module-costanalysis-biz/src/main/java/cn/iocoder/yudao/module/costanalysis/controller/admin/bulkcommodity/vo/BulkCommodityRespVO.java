package cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 大宗物资细节对比分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class BulkCommodityRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "24559")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("日期")
    private LocalDateTime date;

    @Schema(description = "实际絮凝剂单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际絮凝剂单耗")
    private BigDecimal actualFlocculantUnitConsumption;

    @Schema(description = "实际絮凝剂单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际絮凝剂单价")
    private BigDecimal actualFlocculantUnitPriceUsdPerTon;

    @Schema(description = "实际絮凝剂金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际絮凝剂金额")
    private BigDecimal actualFlocculantCostUsd;

    @Schema(description = "计划絮凝剂单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划絮凝剂单耗")
    private BigDecimal plannedFlocculantUnitConsumption;

    @Schema(description = "计划絮凝剂单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划絮凝剂单价")
    private BigDecimal plannedFlocculantUnitPriceUsdPerTon;

    @Schema(description = "计划絮凝剂金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划絮凝剂金额")
    private BigDecimal plannedFlocculantCostUsd;

    @Schema(description = "实际钢球单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际钢球单耗")
    private BigDecimal actualSteelBallUnitConsumption;

    @Schema(description = "实际钢球单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际钢球单价")
    private BigDecimal actualSteelBallUnitPriceUsdPerTon;

    @Schema(description = "实际钢球金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际钢球金额")
    private BigDecimal actualSteelBallCostUsd;

    @Schema(description = "计划钢球钢球单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划钢球钢球单耗")
    private BigDecimal plannedSteelBallUnitConsumption;

    @Schema(description = "计划钢球单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划钢球单价")
    private BigDecimal plannedSteelBallUnitPriceUsdPerTon;

    @Schema(description = "计划钢球金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划钢球金额")
    private BigDecimal plannedSteelBallCostUsd;

    @Schema(description = "实际轮胎单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际轮胎单耗")
    private BigDecimal actualTireUnitConsumption;

    @Schema(description = "实际轮胎单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际轮胎单价")
    private BigDecimal actualTireUnitPriceUsdPerTon;

    @Schema(description = "实际轮胎金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际轮胎金额")
    private BigDecimal actualTireCostUsd;

    @Schema(description = "计划轮胎单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划轮胎单耗")
    private BigDecimal plannedTireUnitConsumption;

    @Schema(description = "计划轮胎单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划轮胎单价")
    private BigDecimal plannedTireUnitPriceUsdPerTon;

    @Schema(description = "计划轮胎金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划轮胎金额")
    private BigDecimal plannedTireCostUsd;

    @Schema(description = "实际包装袋单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际包装袋单耗")
    private BigDecimal actualPackagingUnitConsumption;

    @Schema(description = "实际包装袋单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际包装袋单价")
    private BigDecimal actualPackagingUnitPriceUsdPerTon;

    @Schema(description = "实际包装袋金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际包装袋金额")
    private BigDecimal actualPackagingCostUsd;

    @Schema(description = "计划包装袋单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划包装袋单耗")
    private BigDecimal plannedPackagingUnitConsumption;

    @Schema(description = "计划包装袋单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划包装袋单价")
    private BigDecimal plannedPackagingUnitPriceUsdPerTon;

    @Schema(description = "计划包装袋金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划包装袋金额")
    private BigDecimal plannedPackagingCostUsd;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}