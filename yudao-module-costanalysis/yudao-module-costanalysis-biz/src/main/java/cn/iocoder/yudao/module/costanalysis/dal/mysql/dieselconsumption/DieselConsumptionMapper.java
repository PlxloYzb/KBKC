package cn.iocoder.yudao.module.costanalysis.dal.mysql.dieselconsumption;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.dieselconsumption.DieselConsumptionDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo.*;

/**
 * 柴油成本分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface DieselConsumptionMapper extends BaseMapperX<DieselConsumptionDO> {

    default PageResult<DieselConsumptionDO> selectPage(DieselConsumptionPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<DieselConsumptionDO>()
                .betweenIfPresent(DieselConsumptionDO::getDate, reqVO.getDate())
                .betweenIfPresent(DieselConsumptionDO::getActualDieselConsumptionLiters, reqVO.getActualDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getActualDieselCostUsd, reqVO.getActualDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getPlannedDieselConsumptionLiters, reqVO.getPlannedDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getPlannedDieselCostUsd, reqVO.getPlannedDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getActualPowerDieselConsumptionLiters, reqVO.getActualPowerDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getActualPowerDieselCostUsd, reqVO.getActualPowerDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getPlannedPowerDieselConsumptionLiters, reqVO.getPlannedPowerDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getPlannedPowerDieselCostUsd, reqVO.getPlannedPowerDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getActualMechanicalDieselConsumptionLiters, reqVO.getActualMechanicalDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getActualMechanicalDieselCostUsd, reqVO.getActualMechanicalDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getPlannedMechanicalDieselConsumptionLiters, reqVO.getPlannedMechanicalDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getPlannedMechanicalDieselCostUsd, reqVO.getPlannedMechanicalDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getActualHydraulicDieselConsumptionLiters, reqVO.getActualHydraulicDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getActualHydraulicDieselCostUsd, reqVO.getActualHydraulicDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getPlannedHydraulicDieseConsumptionlLiters, reqVO.getPlannedHydraulicDieseConsumptionlLiters())
                .betweenIfPresent(DieselConsumptionDO::getPlannedHydraulicDieselCostUsd, reqVO.getPlannedHydraulicDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getActualOtherDieselConsumptionLiters, reqVO.getActualOtherDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getActualOtherDieselCostUsd, reqVO.getActualOtherDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getPlannedOtherDieselConsumptionLiters, reqVO.getPlannedOtherDieselConsumptionLiters())
                .betweenIfPresent(DieselConsumptionDO::getPlannedOtherDieselCostUsd, reqVO.getPlannedOtherDieselCostUsd())
                .betweenIfPresent(DieselConsumptionDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(DieselConsumptionDO::getId));
    }

}