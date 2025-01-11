package cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 大宗物资细节对比分析分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BulkCommodityPageReqVO extends PageParam {

    @Schema(description = "日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] date;

    @Schema(description = "实际絮凝剂单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualFlocculantUnitConsumption;

    @Schema(description = "实际絮凝剂单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualFlocculantUnitPriceUsdPerTon;

    @Schema(description = "实际絮凝剂金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualFlocculantCostUsd;

    @Schema(description = "计划絮凝剂单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedFlocculantUnitConsumption;

    @Schema(description = "计划絮凝剂单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedFlocculantUnitPriceUsdPerTon;

    @Schema(description = "计划絮凝剂金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedFlocculantCostUsd;

    @Schema(description = "实际钢球单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualSteelBallUnitConsumption;

    @Schema(description = "实际钢球单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualSteelBallUnitPriceUsdPerTon;

    @Schema(description = "实际钢球金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualSteelBallCostUsd;

    @Schema(description = "计划钢球钢球单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedSteelBallUnitConsumption;

    @Schema(description = "计划钢球单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedSteelBallUnitPriceUsdPerTon;

    @Schema(description = "计划钢球金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedSteelBallCostUsd;

    @Schema(description = "实际轮胎单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualTireUnitConsumption;

    @Schema(description = "实际轮胎单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualTireUnitPriceUsdPerTon;

    @Schema(description = "实际轮胎金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualTireCostUsd;

    @Schema(description = "计划轮胎单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedTireUnitConsumption;

    @Schema(description = "计划轮胎单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedTireUnitPriceUsdPerTon;

    @Schema(description = "计划轮胎金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedTireCostUsd;

    @Schema(description = "实际包装袋单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualPackagingUnitConsumption;

    @Schema(description = "实际包装袋单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualPackagingUnitPriceUsdPerTon;

    @Schema(description = "实际包装袋金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualPackagingCostUsd;

    @Schema(description = "计划包装袋单耗")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedPackagingUnitConsumption;

    @Schema(description = "计划包装袋单价")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedPackagingUnitPriceUsdPerTon;

    @Schema(description = "计划包装袋金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedPackagingCostUsd;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}