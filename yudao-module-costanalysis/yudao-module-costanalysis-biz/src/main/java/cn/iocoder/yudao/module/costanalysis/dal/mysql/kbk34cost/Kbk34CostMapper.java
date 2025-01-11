package cn.iocoder.yudao.module.costanalysis.dal.mysql.kbk34cost;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbk34cost.Kbk34CostDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost.vo.*;

/**
 * 矿山34项费用分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface Kbk34CostMapper extends BaseMapperX<Kbk34CostDO> {

    default PageResult<Kbk34CostDO> selectPage(Kbk34CostPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<Kbk34CostDO>()
                .betweenIfPresent(Kbk34CostDO::getDate, reqVO.getDate())
                .betweenIfPresent(Kbk34CostDO::getActualOfficeCost, reqVO.getActualOfficeCost())
                .betweenIfPresent(Kbk34CostDO::getActualBusinessHospitalityCost, reqVO.getActualBusinessHospitalityCost())
                .betweenIfPresent(Kbk34CostDO::getActualVehicleInspectionInsuranceCost, reqVO.getActualVehicleInspectionInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getActualOfficeVehicleDieselCost, reqVO.getActualOfficeVehicleDieselCost())
                .betweenIfPresent(Kbk34CostDO::getActualCsLpgCost, reqVO.getActualCsLpgCost())
                .betweenIfPresent(Kbk34CostDO::getActualMaterialConsumptionCost, reqVO.getActualMaterialConsumptionCost())
                .betweenIfPresent(Kbk34CostDO::getActualTravelTransportationCost, reqVO.getActualTravelTransportationCost())
                .betweenIfPresent(Kbk34CostDO::getActualMobileCommunicationCost, reqVO.getActualMobileCommunicationCost())
                .betweenIfPresent(Kbk34CostDO::getActualGroupNumberCost, reqVO.getActualGroupNumberCost())
                .betweenIfPresent(Kbk34CostDO::getActualSatelliteEquipmentRentalCost, reqVO.getActualSatelliteEquipmentRentalCost())
                .betweenIfPresent(Kbk34CostDO::getActualDailySuppliesCost, reqVO.getActualDailySuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getActualFurnitureSuppliesCost, reqVO.getActualFurnitureSuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getActualMealAllowanceCost, reqVO.getActualMealAllowanceCost())
                .betweenIfPresent(Kbk34CostDO::getActualSecurityCost, reqVO.getActualSecurityCost())
                .betweenIfPresent(Kbk34CostDO::getActualCampProvisionsCost, reqVO.getActualCampProvisionsCost())
                .betweenIfPresent(Kbk34CostDO::getActualConsumablesCost, reqVO.getActualConsumablesCost())
                .betweenIfPresent(Kbk34CostDO::getActualLaborProtectionCost, reqVO.getActualLaborProtectionCost())
                .betweenIfPresent(Kbk34CostDO::getActualSafetyConsultingCost, reqVO.getActualSafetyConsultingCost())
                .betweenIfPresent(Kbk34CostDO::getActualMedicalSuppliesCost, reqVO.getActualMedicalSuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getActualPublicSafetyProductionCost, reqVO.getActualPublicSafetyProductionCost())
                .betweenIfPresent(Kbk34CostDO::getActualSafetyEnvironmentCost, reqVO.getActualSafetyEnvironmentCost())
                .betweenIfPresent(Kbk34CostDO::getActualSafetySupervisionCost, reqVO.getActualSafetySupervisionCost())
                .betweenIfPresent(Kbk34CostDO::getActualRelocationCost, reqVO.getActualRelocationCost())
                .betweenIfPresent(Kbk34CostDO::getActualLandEnvironmentCompensationCost, reqVO.getActualLandEnvironmentCompensationCost())
                .betweenIfPresent(Kbk34CostDO::getActualAgricultureSupportCost, reqVO.getActualAgricultureSupportCost())
                .betweenIfPresent(Kbk34CostDO::getActualEducationAidCost, reqVO.getActualEducationAidCost())
                .betweenIfPresent(Kbk34CostDO::getActualCommunityRelationsCost, reqVO.getActualCommunityRelationsCost())
                .betweenIfPresent(Kbk34CostDO::getActualBusinessOpportunityCost, reqVO.getActualBusinessOpportunityCost())
                .betweenIfPresent(Kbk34CostDO::getActualPropertyInsuranceCost, reqVO.getActualPropertyInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getActualSocialInsuranceCost, reqVO.getActualSocialInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getActualWelfareCost, reqVO.getActualWelfareCost())
                .betweenIfPresent(Kbk34CostDO::getActualPassportVisaCost, reqVO.getActualPassportVisaCost())
                .betweenIfPresent(Kbk34CostDO::getActualTrainingCost, reqVO.getActualTrainingCost())
                .betweenIfPresent(Kbk34CostDO::getActualExplorationCost, reqVO.getActualExplorationCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedOfficeCost, reqVO.getPlannedOfficeCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedBusinessHospitalityCost, reqVO.getPlannedBusinessHospitalityCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedVehicleInspectionInsuranceCost, reqVO.getPlannedVehicleInspectionInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedOfficeVehicleDieselCost, reqVO.getPlannedOfficeVehicleDieselCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedCsLpgCost, reqVO.getPlannedCsLpgCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedMaterialConsumptionCost, reqVO.getPlannedMaterialConsumptionCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedTravelTransportationCost, reqVO.getPlannedTravelTransportationCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedMobileCommunicationCost, reqVO.getPlannedMobileCommunicationCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedGroupNumberCost, reqVO.getPlannedGroupNumberCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSatelliteEquipmentRentalCost, reqVO.getPlannedSatelliteEquipmentRentalCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedDailySuppliesCost, reqVO.getPlannedDailySuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedFurnitureSuppliesCost, reqVO.getPlannedFurnitureSuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedMealAllowanceCost, reqVO.getPlannedMealAllowanceCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSecurityCost, reqVO.getPlannedSecurityCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedCampProvisionsCost, reqVO.getPlannedCampProvisionsCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedConsumablesCost, reqVO.getPlannedConsumablesCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedLaborProtectionCost, reqVO.getPlannedLaborProtectionCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSafetyConsultingCost, reqVO.getPlannedSafetyConsultingCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedMedicalSuppliesCost, reqVO.getPlannedMedicalSuppliesCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedPublicSafetyProductionCost, reqVO.getPlannedPublicSafetyProductionCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSafetyEnvironmentCost, reqVO.getPlannedSafetyEnvironmentCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSafetySupervisionCost, reqVO.getPlannedSafetySupervisionCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedRelocationCost, reqVO.getPlannedRelocationCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedLandEnvironmentCompensationCost, reqVO.getPlannedLandEnvironmentCompensationCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedAgricultureSupportCost, reqVO.getPlannedAgricultureSupportCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedEducationAidCost, reqVO.getPlannedEducationAidCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedCommunityRelationsCost, reqVO.getPlannedCommunityRelationsCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedBusinessOpportunityCost, reqVO.getPlannedBusinessOpportunityCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedPropertyInsuranceCost, reqVO.getPlannedPropertyInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedSocialInsuranceCost, reqVO.getPlannedSocialInsuranceCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedWelfareCost, reqVO.getPlannedWelfareCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedPassportVisaCost, reqVO.getPlannedPassportVisaCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedTrainingCost, reqVO.getPlannedTrainingCost())
                .betweenIfPresent(Kbk34CostDO::getPlannedExplorationCost, reqVO.getPlannedExplorationCost())
                .betweenIfPresent(Kbk34CostDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(Kbk34CostDO::getId));
    }

}