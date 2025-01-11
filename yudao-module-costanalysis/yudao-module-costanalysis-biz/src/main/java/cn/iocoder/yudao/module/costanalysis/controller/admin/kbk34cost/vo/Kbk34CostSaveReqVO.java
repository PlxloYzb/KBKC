package cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 矿山34项费用分析新增/修改 Request VO")
@Data
public class Kbk34CostSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "2540")
    private Long id;

    @Schema(description = "日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际办公费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际办公费不能为空")
    private BigDecimal actualOfficeCost;

    @Schema(description = "实际业务招待物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际业务招待物资不能为空")
    private BigDecimal actualBusinessHospitalityCost;

    @Schema(description = "实际车辆年检注册保险", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际车辆年检注册保险不能为空")
    private BigDecimal actualVehicleInspectionInsuranceCost;

    @Schema(description = "实际办公车辆柴油", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际办公车辆柴油不能为空")
    private BigDecimal actualOfficeVehicleDieselCost;

    @Schema(description = "实际CS液化气", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际CS液化气不能为空")
    private BigDecimal actualCsLpgCost;

    @Schema(description = "实际机物料消耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际机物料消耗不能为空")
    private BigDecimal actualMaterialConsumptionCost;

    @Schema(description = "实际差旅探亲交通费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际差旅探亲交通费不能为空")
    private BigDecimal actualTravelTransportationCost;

    @Schema(description = "实际手机卡通讯费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际手机卡通讯费不能为空")
    private BigDecimal actualMobileCommunicationCost;

    @Schema(description = "实际集团号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际集团号不能为空")
    private BigDecimal actualGroupNumberCost;

    @Schema(description = "实际卫星设备及租赁费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际卫星设备及租赁费不能为空")
    private BigDecimal actualSatelliteEquipmentRentalCost;

    @Schema(description = "实际日常生活物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际日常生活物资不能为空")
    private BigDecimal actualDailySuppliesCost;

    @Schema(description = "实际家具生活物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际家具生活物资不能为空")
    private BigDecimal actualFurnitureSuppliesCost;

    @Schema(description = "实际班中餐补", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际班中餐补不能为空")
    private BigDecimal actualMealAllowanceCost;

    @Schema(description = "实际保安费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际保安费不能为空")
    private BigDecimal actualSecurityCost;

    @Schema(description = "实际营地给养", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际营地给养不能为空")
    private BigDecimal actualCampProvisionsCost;

    @Schema(description = "实际低值易耗品", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际低值易耗品不能为空")
    private BigDecimal actualConsumablesCost;

    @Schema(description = "实际劳动保护费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际劳动保护费不能为空")
    private BigDecimal actualLaborProtectionCost;

    @Schema(description = "实际安全咨询费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际安全咨询费不能为空")
    private BigDecimal actualSafetyConsultingCost;

    @Schema(description = "实际药品及医疗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际药品及医疗不能为空")
    private BigDecimal actualMedicalSuppliesCost;

    @Schema(description = "实际安全生产费（公共支出）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际安全生产费（公共支出）不能为空")
    private BigDecimal actualPublicSafetyProductionCost;

    @Schema(description = "实际安全环境", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际安全环境不能为空")
    private BigDecimal actualSafetyEnvironmentCost;

    @Schema(description = "实际安全监察", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际安全监察不能为空")
    private BigDecimal actualSafetySupervisionCost;

    @Schema(description = "实际移民搬迁费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际移民搬迁费用不能为空")
    private BigDecimal actualRelocationCost;

    @Schema(description = "实际土地、环境等补偿费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际土地、环境等补偿费用不能为空")
    private BigDecimal actualLandEnvironmentCompensationCost;

    @Schema(description = "实际农业帮扶开发", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际农业帮扶开发不能为空")
    private BigDecimal actualAgricultureSupportCost;

    @Schema(description = "实际教育援助", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际教育援助不能为空")
    private BigDecimal actualEducationAidCost;

    @Schema(description = "实际社区关系费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际社区关系费用不能为空")
    private BigDecimal actualCommunityRelationsCost;

    @Schema(description = "实际商业机会", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际商业机会不能为空")
    private BigDecimal actualBusinessOpportunityCost;

    @Schema(description = "实际财产保险费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际财产保险费不能为空")
    private BigDecimal actualPropertyInsuranceCost;

    @Schema(description = "实际社会保险", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际社会保险不能为空")
    private BigDecimal actualSocialInsuranceCost;

    @Schema(description = "实际福利费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际福利费不能为空")
    private BigDecimal actualWelfareCost;

    @Schema(description = "实际护照签证费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际护照签证费不能为空")
    private BigDecimal actualPassportVisaCost;

    @Schema(description = "实际培训费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际培训费不能为空")
    private BigDecimal actualTrainingCost;

    @Schema(description = "实际勘探费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际勘探费用不能为空")
    private BigDecimal actualExplorationCost;

    @Schema(description = "计划办公费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划办公费不能为空")
    private BigDecimal plannedOfficeCost;

    @Schema(description = "计划业务招待物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划业务招待物资不能为空")
    private BigDecimal plannedBusinessHospitalityCost;

    @Schema(description = "计划车辆年检注册保险", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划车辆年检注册保险不能为空")
    private BigDecimal plannedVehicleInspectionInsuranceCost;

    @Schema(description = "计划办公车辆柴油", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划办公车辆柴油不能为空")
    private BigDecimal plannedOfficeVehicleDieselCost;

    @Schema(description = "计划CS液化气", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划CS液化气不能为空")
    private BigDecimal plannedCsLpgCost;

    @Schema(description = "计划机物料消耗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划机物料消耗不能为空")
    private BigDecimal plannedMaterialConsumptionCost;

    @Schema(description = "计划差旅探亲交通费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划差旅探亲交通费不能为空")
    private BigDecimal plannedTravelTransportationCost;

    @Schema(description = "计划手机卡通讯费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划手机卡通讯费不能为空")
    private BigDecimal plannedMobileCommunicationCost;

    @Schema(description = "计划集团号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划集团号不能为空")
    private BigDecimal plannedGroupNumberCost;

    @Schema(description = "计划卫星设备及租赁费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划卫星设备及租赁费不能为空")
    private BigDecimal plannedSatelliteEquipmentRentalCost;

    @Schema(description = "计划日常生活物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划日常生活物资不能为空")
    private BigDecimal plannedDailySuppliesCost;

    @Schema(description = "计划家具生活物资", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划家具生活物资不能为空")
    private BigDecimal plannedFurnitureSuppliesCost;

    @Schema(description = "计划班中餐补", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划班中餐补不能为空")
    private BigDecimal plannedMealAllowanceCost;

    @Schema(description = "计划保安费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划保安费不能为空")
    private BigDecimal plannedSecurityCost;

    @Schema(description = "计划营地给养", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划营地给养不能为空")
    private BigDecimal plannedCampProvisionsCost;

    @Schema(description = "计划低值易耗品", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划低值易耗品不能为空")
    private BigDecimal plannedConsumablesCost;

    @Schema(description = "计划劳动保护费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划劳动保护费不能为空")
    private BigDecimal plannedLaborProtectionCost;

    @Schema(description = "计划安全咨询费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划安全咨询费不能为空")
    private BigDecimal plannedSafetyConsultingCost;

    @Schema(description = "计划药品及医疗", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划药品及医疗不能为空")
    private BigDecimal plannedMedicalSuppliesCost;

    @Schema(description = "计划安全生产费（公共支出）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划安全生产费（公共支出）不能为空")
    private BigDecimal plannedPublicSafetyProductionCost;

    @Schema(description = "计划安全环境", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划安全环境不能为空")
    private BigDecimal plannedSafetyEnvironmentCost;

    @Schema(description = "计划安全监察", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划安全监察不能为空")
    private BigDecimal plannedSafetySupervisionCost;

    @Schema(description = "计划移民搬迁费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划移民搬迁费用不能为空")
    private BigDecimal plannedRelocationCost;

    @Schema(description = "计划土地、环境等补偿费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划土地、环境等补偿费用不能为空")
    private BigDecimal plannedLandEnvironmentCompensationCost;

    @Schema(description = "计划农业帮扶开发", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划农业帮扶开发不能为空")
    private BigDecimal plannedAgricultureSupportCost;

    @Schema(description = "计划教育援助", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划教育援助不能为空")
    private BigDecimal plannedEducationAidCost;

    @Schema(description = "计划社区关系费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划社区关系费用不能为空")
    private BigDecimal plannedCommunityRelationsCost;

    @Schema(description = "计划商业机会", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划商业机会不能为空")
    private BigDecimal plannedBusinessOpportunityCost;

    @Schema(description = "计划财产保险费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划财产保险费不能为空")
    private BigDecimal plannedPropertyInsuranceCost;

    @Schema(description = "计划社会保险", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划社会保险不能为空")
    private BigDecimal plannedSocialInsuranceCost;

    @Schema(description = "计划福利费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划福利费不能为空")
    private BigDecimal plannedWelfareCost;

    @Schema(description = "计划护照签证费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划护照签证费不能为空")
    private BigDecimal plannedPassportVisaCost;

    @Schema(description = "计划培训费", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划培训费不能为空")
    private BigDecimal plannedTrainingCost;

    @Schema(description = "计划勘探费用", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划勘探费用不能为空")
    private BigDecimal plannedExplorationCost;

}