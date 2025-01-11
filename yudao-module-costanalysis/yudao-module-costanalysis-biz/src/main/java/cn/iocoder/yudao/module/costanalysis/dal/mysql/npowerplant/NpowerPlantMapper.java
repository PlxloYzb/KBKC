package cn.iocoder.yudao.module.costanalysis.dal.mysql.npowerplant;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.npowerplant.NpowerPlantDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant.vo.*;

/**
 * 电厂发电成本分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface NpowerPlantMapper extends BaseMapperX<NpowerPlantDO> {

    default PageResult<NpowerPlantDO> selectPage(NpowerPlantPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<NpowerPlantDO>()
                .betweenIfPresent(NpowerPlantDO::getDate, reqVO.getDate())
                .betweenIfPresent(NpowerPlantDO::getPowerGenerationKwh, reqVO.getPowerGenerationKwh())
                .betweenIfPresent(NpowerPlantDO::getActualPowerPlantFuelCostUsd, reqVO.getActualPowerPlantFuelCostUsd())
                .betweenIfPresent(NpowerPlantDO::getActualPowerPlantLaborCostUsd, reqVO.getActualPowerPlantLaborCostUsd())
                .betweenIfPresent(NpowerPlantDO::getActualPowerPlantMaintenanceCostUsd, reqVO.getActualPowerPlantMaintenanceCostUsd())
                .betweenIfPresent(NpowerPlantDO::getActualPowerPlantOtherDirectCostUsd, reqVO.getActualPowerPlantOtherDirectCostUsd())
                .betweenIfPresent(NpowerPlantDO::getPlannedPowerPlantFuelCostUsdPerKwh, reqVO.getPlannedPowerPlantFuelCostUsdPerKwh())
                .betweenIfPresent(NpowerPlantDO::getPlannedPowerPlantLaborCostUsdPerKwh, reqVO.getPlannedPowerPlantLaborCostUsdPerKwh())
                .betweenIfPresent(NpowerPlantDO::getPlannedPowerPlantMaintenanceCostUsdPerKwh, reqVO.getPlannedPowerPlantMaintenanceCostUsdPerKwh())
                .betweenIfPresent(NpowerPlantDO::getPlannedPowerPlantOtherDirectCostUsdPerKwh, reqVO.getPlannedPowerPlantOtherDirectCostUsdPerKwh())
                .betweenIfPresent(NpowerPlantDO::getPlannedNickelProductionTons, reqVO.getPlannedNickelProductionTons())
                .betweenIfPresent(NpowerPlantDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(NpowerPlantDO::getId));
    }

}