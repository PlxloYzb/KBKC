package cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 月度维检费成本分析分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class KbkMaintenanceCostPageReqVO extends PageParam {

    @Schema(description = "日期")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] date;

    @Schema(description = "实际矿山采矿作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualMiningMaintenanceCost;

    @Schema(description = "实际矿山开拓及复垦作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualStrippingReclamationMaintenanceCost;

    @Schema(description = "实际矿山水采作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualHydraulicMiningMaintenanceCost;

    @Schema(description = "实际矿山供水洗矿作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualWashingMaintenanceCost;

    @Schema(description = "实际矿山选铬作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualChromeSelectionMaintenanceCost;

    @Schema(description = "实际矿山固定设备维修作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualFixedEquipmentMaintenanceCost;

    @Schema(description = "实际矿山电仪作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualElectricalMaintenanceCost;

    @Schema(description = "实际矿山移动设备维修作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualMobileEquipmentMaintenanceCost;

    @Schema(description = "实际矿山仓储作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualStorageMaintenanceCost;

    @Schema(description = "实际矿山化验室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualLabMaintenanceCost;

    @Schema(description = "实际矿山HSE监察室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualHseMaintenanceCost;

    @Schema(description = "实际矿山技术计划室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualTechnicalPlanningMaintenanceCost;

    @Schema(description = "实际矿山调度室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualDispatchMaintenanceCost;

    @Schema(description = "实际矿山后勤、办公室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualLogisticsOfficeMaintenanceCost;

    @Schema(description = "实际矿山地方关系室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualPublicRelationsMaintenanceCost;

    @Schema(description = "实际矿山设备室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] actualEquipmentOfficeMaintenanceCost;

    @Schema(description = "计划矿山采矿作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedMiningMaintenanceCost;

    @Schema(description = "计划矿山开拓及复垦作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedStrippingReclamationMaintenanceCost;

    @Schema(description = "计划矿山水采作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedHydraulicMiningMaintenanceCost;

    @Schema(description = "计划矿山供水洗矿作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedWashingMaintenanceCost;

    @Schema(description = "计划矿山选铬作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedChromeSelectionMaintenanceCost;

    @Schema(description = "计划矿山固定设备维修作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedFixedEquipmentMaintenanceCost;

    @Schema(description = "计划矿山电仪作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedElectricalMaintenanceCost;

    @Schema(description = "计划矿山移动设备维修作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedMobileEquipmentMaintenanceCost;

    @Schema(description = "计划矿山仓储作业区维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedStorageMaintenanceCost;

    @Schema(description = "计划矿山化验室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedLabMaintenanceCost;

    @Schema(description = "计划矿山HSE监察室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedHseMaintenanceCost;

    @Schema(description = "计划矿山技术计划室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedTechnicalPlanningMaintenanceCost;

    @Schema(description = "计划矿山调度室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedDispatchMaintenanceCost;

    @Schema(description = "计划矿山后勤、办公室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedLogisticsOfficeMaintenanceCost;

    @Schema(description = "计划矿山地方关系室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedPublicRelationsMaintenanceCost;

    @Schema(description = "计划矿山设备室维检费")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] plannedEquipmentOfficeMaintenanceCost;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}