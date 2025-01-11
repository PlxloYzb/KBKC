package cn.iocoder.yudao.module.costanalysis.dal.mysql.kbkmaintenancecost;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbkmaintenancecost.KbkMaintenanceCostDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo.*;

/**
 * 月度维检费成本分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface KbkMaintenanceCostMapper extends BaseMapperX<KbkMaintenanceCostDO> {

    default PageResult<KbkMaintenanceCostDO> selectPage(KbkMaintenanceCostPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<KbkMaintenanceCostDO>()
                .betweenIfPresent(KbkMaintenanceCostDO::getDate, reqVO.getDate())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualMiningMaintenanceCost, reqVO.getActualMiningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualStrippingReclamationMaintenanceCost, reqVO.getActualStrippingReclamationMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualHydraulicMiningMaintenanceCost, reqVO.getActualHydraulicMiningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualWashingMaintenanceCost, reqVO.getActualWashingMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualChromeSelectionMaintenanceCost, reqVO.getActualChromeSelectionMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualFixedEquipmentMaintenanceCost, reqVO.getActualFixedEquipmentMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualElectricalMaintenanceCost, reqVO.getActualElectricalMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualMobileEquipmentMaintenanceCost, reqVO.getActualMobileEquipmentMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualStorageMaintenanceCost, reqVO.getActualStorageMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualLabMaintenanceCost, reqVO.getActualLabMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualHseMaintenanceCost, reqVO.getActualHseMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualTechnicalPlanningMaintenanceCost, reqVO.getActualTechnicalPlanningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualDispatchMaintenanceCost, reqVO.getActualDispatchMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualLogisticsOfficeMaintenanceCost, reqVO.getActualLogisticsOfficeMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualPublicRelationsMaintenanceCost, reqVO.getActualPublicRelationsMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getActualEquipmentOfficeMaintenanceCost, reqVO.getActualEquipmentOfficeMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedMiningMaintenanceCost, reqVO.getPlannedMiningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedStrippingReclamationMaintenanceCost, reqVO.getPlannedStrippingReclamationMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedHydraulicMiningMaintenanceCost, reqVO.getPlannedHydraulicMiningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedWashingMaintenanceCost, reqVO.getPlannedWashingMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedChromeSelectionMaintenanceCost, reqVO.getPlannedChromeSelectionMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedFixedEquipmentMaintenanceCost, reqVO.getPlannedFixedEquipmentMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedElectricalMaintenanceCost, reqVO.getPlannedElectricalMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedMobileEquipmentMaintenanceCost, reqVO.getPlannedMobileEquipmentMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedStorageMaintenanceCost, reqVO.getPlannedStorageMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedLabMaintenanceCost, reqVO.getPlannedLabMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedHseMaintenanceCost, reqVO.getPlannedHseMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedTechnicalPlanningMaintenanceCost, reqVO.getPlannedTechnicalPlanningMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedDispatchMaintenanceCost, reqVO.getPlannedDispatchMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedLogisticsOfficeMaintenanceCost, reqVO.getPlannedLogisticsOfficeMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedPublicRelationsMaintenanceCost, reqVO.getPlannedPublicRelationsMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getPlannedEquipmentOfficeMaintenanceCost, reqVO.getPlannedEquipmentOfficeMaintenanceCost())
                .betweenIfPresent(KbkMaintenanceCostDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(KbkMaintenanceCostDO::getId));
    }

}