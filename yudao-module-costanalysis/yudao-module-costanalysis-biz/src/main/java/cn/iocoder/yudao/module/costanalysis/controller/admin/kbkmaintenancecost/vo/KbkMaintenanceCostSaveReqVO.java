package cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 月度维检费成本分析新增/修改 Request VO")
@Data
public class KbkMaintenanceCostSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "22415")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际矿山采矿作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山采矿作业区维检费不能为空")
    private BigDecimal actualMiningMaintenanceCost;

    @Schema(description = "实际矿山开拓及复垦作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山开拓及复垦作业区维检费不能为空")
    private BigDecimal actualStrippingReclamationMaintenanceCost;

    @Schema(description = "实际矿山水采作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山水采作业区维检费不能为空")
    private BigDecimal actualHydraulicMiningMaintenanceCost;

    @Schema(description = "实际矿山供水洗矿作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山供水洗矿作业区维检费不能为空")
    private BigDecimal actualWashingMaintenanceCost;

    @Schema(description = "实际矿山选铬作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山选铬作业区维检费不能为空")
    private BigDecimal actualChromeSelectionMaintenanceCost;

    @Schema(description = "实际矿山固定设备维修作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山固定设备维修作业区维检费不能为空")
    private BigDecimal actualFixedEquipmentMaintenanceCost;

    @Schema(description = "实际矿山电仪作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山电仪作业区维检费不能为空")
    private BigDecimal actualElectricalMaintenanceCost;

    @Schema(description = "实际矿山移动设备维修作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山移动设备维修作业区维检费不能为空")
    private BigDecimal actualMobileEquipmentMaintenanceCost;

    @Schema(description = "实际矿山仓储作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山仓储作业区维检费不能为空")
    private BigDecimal actualStorageMaintenanceCost;

    @Schema(description = "实际矿山化验室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山化验室维检费不能为空")
    private BigDecimal actualLabMaintenanceCost;

    @Schema(description = "实际矿山HSE监察室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山HSE监察室维检费不能为空")
    private BigDecimal actualHseMaintenanceCost;

    @Schema(description = "实际矿山技术计划室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山技术计划室维检费不能为空")
    private BigDecimal actualTechnicalPlanningMaintenanceCost;

    @Schema(description = "实际矿山调度室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山调度室维检费不能为空")
    private BigDecimal actualDispatchMaintenanceCost;

    @Schema(description = "实际矿山后勤、办公室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山后勤、办公室维检费不能为空")
    private BigDecimal actualLogisticsOfficeMaintenanceCost;

    @Schema(description = "实际矿山地方关系室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山地方关系室维检费不能为空")
    private BigDecimal actualPublicRelationsMaintenanceCost;

    @Schema(description = "实际矿山设备室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际矿山设备室维检费不能为空")
    private BigDecimal actualEquipmentOfficeMaintenanceCost;

    @Schema(description = "计划矿山采矿作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山采矿作业区维检费不能为空")
    private BigDecimal plannedMiningMaintenanceCost;

    @Schema(description = "计划矿山开拓及复垦作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山开拓及复垦作业区维检费不能为空")
    private BigDecimal plannedStrippingReclamationMaintenanceCost;

    @Schema(description = "计划矿山水采作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山水采作业区维检费不能为空")
    private BigDecimal plannedHydraulicMiningMaintenanceCost;

    @Schema(description = "计划矿山供水洗矿作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山供水洗矿作业区维检费不能为空")
    private BigDecimal plannedWashingMaintenanceCost;

    @Schema(description = "计划矿山选铬作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山选铬作业区维检费不能为空")
    private BigDecimal plannedChromeSelectionMaintenanceCost;

    @Schema(description = "计划矿山固定设备维修作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山固定设备维修作业区维检费不能为空")
    private BigDecimal plannedFixedEquipmentMaintenanceCost;

    @Schema(description = "计划矿山电仪作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山电仪作业区维检费不能为空")
    private BigDecimal plannedElectricalMaintenanceCost;

    @Schema(description = "计划矿山移动设备维修作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山移动设备维修作业区维检费不能为空")
    private BigDecimal plannedMobileEquipmentMaintenanceCost;

    @Schema(description = "计划矿山仓储作业区维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山仓储作业区维检费不能为空")
    private BigDecimal plannedStorageMaintenanceCost;

    @Schema(description = "计划矿山化验室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山化验室维检费不能为空")
    private BigDecimal plannedLabMaintenanceCost;

    @Schema(description = "计划矿山HSE监察室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山HSE监察室维检费不能为空")
    private BigDecimal plannedHseMaintenanceCost;

    @Schema(description = "计划矿山技术计划室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山技术计划室维检费不能为空")
    private BigDecimal plannedTechnicalPlanningMaintenanceCost;

    @Schema(description = "计划矿山调度室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山调度室维检费不能为空")
    private BigDecimal plannedDispatchMaintenanceCost;

    @Schema(description = "计划矿山后勤、办公室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山后勤、办公室维检费不能为空")
    private BigDecimal plannedLogisticsOfficeMaintenanceCost;

    @Schema(description = "计划矿山地方关系室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山地方关系室维检费不能为空")
    private BigDecimal plannedPublicRelationsMaintenanceCost;

    @Schema(description = "计划矿山设备室维检费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划矿山设备室维检费不能为空")
    private BigDecimal plannedEquipmentOfficeMaintenanceCost;

}