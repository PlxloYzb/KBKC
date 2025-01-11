package cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbk34cost;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 矿山34项费用分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_kbk_34_cost")
@KeySequence("costanalysis_kbk_34_cost_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Kbk34CostDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 日期
     */
    private LocalDateTime date;
    /**
     * 实际办公费
     */
    private BigDecimal actualOfficeCost;
    /**
     * 实际业务招待物资
     */
    private BigDecimal actualBusinessHospitalityCost;
    /**
     * 实际车辆年检注册保险
     */
    private BigDecimal actualVehicleInspectionInsuranceCost;
    /**
     * 实际办公车辆柴油
     */
    private BigDecimal actualOfficeVehicleDieselCost;
    /**
     * 实际CS液化气
     */
    private BigDecimal actualCsLpgCost;
    /**
     * 实际机物料消耗
     */
    private BigDecimal actualMaterialConsumptionCost;
    /**
     * 实际差旅探亲交通费
     */
    private BigDecimal actualTravelTransportationCost;
    /**
     * 实际手机卡通讯费
     */
    private BigDecimal actualMobileCommunicationCost;
    /**
     * 实际集团号
     */
    private BigDecimal actualGroupNumberCost;
    /**
     * 实际卫星设备及租赁费
     */
    private BigDecimal actualSatelliteEquipmentRentalCost;
    /**
     * 实际日常生活物资
     */
    private BigDecimal actualDailySuppliesCost;
    /**
     * 实际家具生活物资
     */
    private BigDecimal actualFurnitureSuppliesCost;
    /**
     * 实际班中餐补
     */
    private BigDecimal actualMealAllowanceCost;
    /**
     * 实际保安费
     */
    private BigDecimal actualSecurityCost;
    /**
     * 实际营地给养
     */
    private BigDecimal actualCampProvisionsCost;
    /**
     * 实际低值易耗品
     */
    private BigDecimal actualConsumablesCost;
    /**
     * 实际劳动保护费
     */
    private BigDecimal actualLaborProtectionCost;
    /**
     * 实际安全咨询费
     */
    private BigDecimal actualSafetyConsultingCost;
    /**
     * 实际药品及医疗
     */
    private BigDecimal actualMedicalSuppliesCost;
    /**
     * 实际安全生产费（公共支出）
     */
    private BigDecimal actualPublicSafetyProductionCost;
    /**
     * 实际安全环境
     */
    private BigDecimal actualSafetyEnvironmentCost;
    /**
     * 实际安全监察
     */
    private BigDecimal actualSafetySupervisionCost;
    /**
     * 实际移民搬迁费用
     */
    private BigDecimal actualRelocationCost;
    /**
     * 实际土地、环境等补偿费用
     */
    private BigDecimal actualLandEnvironmentCompensationCost;
    /**
     * 实际农业帮扶开发
     */
    private BigDecimal actualAgricultureSupportCost;
    /**
     * 实际教育援助
     */
    private BigDecimal actualEducationAidCost;
    /**
     * 实际社区关系费用
     */
    private BigDecimal actualCommunityRelationsCost;
    /**
     * 实际商业机会
     */
    private BigDecimal actualBusinessOpportunityCost;
    /**
     * 实际财产保险费
     */
    private BigDecimal actualPropertyInsuranceCost;
    /**
     * 实际社会保险
     */
    private BigDecimal actualSocialInsuranceCost;
    /**
     * 实际福利费
     */
    private BigDecimal actualWelfareCost;
    /**
     * 实际护照签证费
     */
    private BigDecimal actualPassportVisaCost;
    /**
     * 实际培训费
     */
    private BigDecimal actualTrainingCost;
    /**
     * 实际勘探费用
     */
    private BigDecimal actualExplorationCost;
    /**
     * 计划办公费
     */
    private BigDecimal plannedOfficeCost;
    /**
     * 计划业务招待物资
     */
    private BigDecimal plannedBusinessHospitalityCost;
    /**
     * 计划车辆年检注册保险
     */
    private BigDecimal plannedVehicleInspectionInsuranceCost;
    /**
     * 计划办公车辆柴油
     */
    private BigDecimal plannedOfficeVehicleDieselCost;
    /**
     * 计划CS液化气
     */
    private BigDecimal plannedCsLpgCost;
    /**
     * 计划机物料消耗
     */
    private BigDecimal plannedMaterialConsumptionCost;
    /**
     * 计划差旅探亲交通费
     */
    private BigDecimal plannedTravelTransportationCost;
    /**
     * 计划手机卡通讯费
     */
    private BigDecimal plannedMobileCommunicationCost;
    /**
     * 计划集团号
     */
    private BigDecimal plannedGroupNumberCost;
    /**
     * 计划卫星设备及租赁费
     */
    private BigDecimal plannedSatelliteEquipmentRentalCost;
    /**
     * 计划日常生活物资
     */
    private BigDecimal plannedDailySuppliesCost;
    /**
     * 计划家具生活物资
     */
    private BigDecimal plannedFurnitureSuppliesCost;
    /**
     * 计划班中餐补
     */
    private BigDecimal plannedMealAllowanceCost;
    /**
     * 计划保安费
     */
    private BigDecimal plannedSecurityCost;
    /**
     * 计划营地给养
     */
    private BigDecimal plannedCampProvisionsCost;
    /**
     * 计划低值易耗品
     */
    private BigDecimal plannedConsumablesCost;
    /**
     * 计划劳动保护费
     */
    private BigDecimal plannedLaborProtectionCost;
    /**
     * 计划安全咨询费
     */
    private BigDecimal plannedSafetyConsultingCost;
    /**
     * 计划药品及医疗
     */
    private BigDecimal plannedMedicalSuppliesCost;
    /**
     * 计划安全生产费（公共支出）
     */
    private BigDecimal plannedPublicSafetyProductionCost;
    /**
     * 计划安全环境
     */
    private BigDecimal plannedSafetyEnvironmentCost;
    /**
     * 计划安全监察
     */
    private BigDecimal plannedSafetySupervisionCost;
    /**
     * 计划移民搬迁费用
     */
    private BigDecimal plannedRelocationCost;
    /**
     * 计划土地、环境等补偿费用
     */
    private BigDecimal plannedLandEnvironmentCompensationCost;
    /**
     * 计划农业帮扶开发
     */
    private BigDecimal plannedAgricultureSupportCost;
    /**
     * 计划教育援助
     */
    private BigDecimal plannedEducationAidCost;
    /**
     * 计划社区关系费用
     */
    private BigDecimal plannedCommunityRelationsCost;
    /**
     * 计划商业机会
     */
    private BigDecimal plannedBusinessOpportunityCost;
    /**
     * 计划财产保险费
     */
    private BigDecimal plannedPropertyInsuranceCost;
    /**
     * 计划社会保险
     */
    private BigDecimal plannedSocialInsuranceCost;
    /**
     * 计划福利费
     */
    private BigDecimal plannedWelfareCost;
    /**
     * 计划护照签证费
     */
    private BigDecimal plannedPassportVisaCost;
    /**
     * 计划培训费
     */
    private BigDecimal plannedTrainingCost;
    /**
     * 计划勘探费用
     */
    private BigDecimal plannedExplorationCost;

}