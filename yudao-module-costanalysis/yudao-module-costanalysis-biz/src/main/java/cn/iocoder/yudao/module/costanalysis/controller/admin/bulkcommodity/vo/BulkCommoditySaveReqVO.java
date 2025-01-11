package cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 大宗物资细节对比分析新增/修改 Request VO")
@Data
public class BulkCommoditySaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "24559")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际絮凝剂单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际絮凝剂单耗不能为空")
    private BigDecimal actualFlocculantUnitConsumption;

    @Schema(description = "实际絮凝剂单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际絮凝剂单价不能为空")
    private BigDecimal actualFlocculantUnitPriceUsdPerTon;

    @Schema(description = "实际絮凝剂金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际絮凝剂金额不能为空")
    private BigDecimal actualFlocculantCostUsd;

    @Schema(description = "计划絮凝剂单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划絮凝剂单耗不能为空")
    private BigDecimal plannedFlocculantUnitConsumption;

    @Schema(description = "计划絮凝剂单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划絮凝剂单价不能为空")
    private BigDecimal plannedFlocculantUnitPriceUsdPerTon;

    @Schema(description = "计划絮凝剂金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划絮凝剂金额不能为空")
    private BigDecimal plannedFlocculantCostUsd;

    @Schema(description = "实际钢球单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际钢球单耗不能为空")
    private BigDecimal actualSteelBallUnitConsumption;

    @Schema(description = "实际钢球单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际钢球单价不能为空")
    private BigDecimal actualSteelBallUnitPriceUsdPerTon;

    @Schema(description = "实际钢球金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际钢球金额不能为空")
    private BigDecimal actualSteelBallCostUsd;

    @Schema(description = "计划钢球钢球单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划钢球钢球单耗不能为空")
    private BigDecimal plannedSteelBallUnitConsumption;

    @Schema(description = "计划钢球单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划钢球单价不能为空")
    private BigDecimal plannedSteelBallUnitPriceUsdPerTon;

    @Schema(description = "计划钢球金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划钢球金额不能为空")
    private BigDecimal plannedSteelBallCostUsd;

    @Schema(description = "实际轮胎单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际轮胎单耗不能为空")
    private BigDecimal actualTireUnitConsumption;

    @Schema(description = "实际轮胎单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际轮胎单价不能为空")
    private BigDecimal actualTireUnitPriceUsdPerTon;

    @Schema(description = "实际轮胎金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际轮胎金额不能为空")
    private BigDecimal actualTireCostUsd;

    @Schema(description = "计划轮胎单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划轮胎单耗不能为空")
    private BigDecimal plannedTireUnitConsumption;

    @Schema(description = "计划轮胎单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划轮胎单价不能为空")
    private BigDecimal plannedTireUnitPriceUsdPerTon;

    @Schema(description = "计划轮胎金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划轮胎金额不能为空")
    private BigDecimal plannedTireCostUsd;

    @Schema(description = "实际包装袋单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际包装袋单耗不能为空")
    private BigDecimal actualPackagingUnitConsumption;

    @Schema(description = "实际包装袋单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际包装袋单价不能为空")
    private BigDecimal actualPackagingUnitPriceUsdPerTon;

    @Schema(description = "实际包装袋金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际包装袋金额不能为空")
    private BigDecimal actualPackagingCostUsd;

    @Schema(description = "计划包装袋单耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划包装袋单耗不能为空")
    private BigDecimal plannedPackagingUnitConsumption;

    @Schema(description = "计划包装袋单价", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划包装袋单价不能为空")
    private BigDecimal plannedPackagingUnitPriceUsdPerTon;

    @Schema(description = "计划包装袋金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划包装袋金额不能为空")
    private BigDecimal plannedPackagingCostUsd;

}