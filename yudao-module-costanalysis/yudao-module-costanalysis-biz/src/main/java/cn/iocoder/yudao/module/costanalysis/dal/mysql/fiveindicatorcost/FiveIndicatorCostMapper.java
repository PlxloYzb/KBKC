package cn.iocoder.yudao.module.costanalysis.dal.mysql.fiveindicatorcost;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.fiveindicatorcost.FiveIndicatorCostDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo.*;

/**
 * 五项费用成本分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface FiveIndicatorCostMapper extends BaseMapperX<FiveIndicatorCostDO> {

    default PageResult<FiveIndicatorCostDO> selectPage(FiveIndicatorCostPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<FiveIndicatorCostDO>()
                .betweenIfPresent(FiveIndicatorCostDO::getDate, reqVO.getDate())
                .betweenIfPresent(FiveIndicatorCostDO::getActualRawMaterialsCostUsd, reqVO.getActualRawMaterialsCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getActualEnergyCostUsd, reqVO.getActualEnergyCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getActualLaborCostUsd, reqVO.getActualLaborCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getActualMaintenanceCostUsd, reqVO.getActualMaintenanceCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getActualOtherDirectCostUsd, reqVO.getActualOtherDirectCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getPlannedRawMaterialsCostUsd, reqVO.getPlannedRawMaterialsCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getPlannedEnergyCostUsd, reqVO.getPlannedEnergyCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getPlannedLaborCostUsd, reqVO.getPlannedLaborCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getPlannedMaintenanceCostUsd, reqVO.getPlannedMaintenanceCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getPlannedOtherDirectCostUsd, reqVO.getPlannedOtherDirectCostUsd())
                .betweenIfPresent(FiveIndicatorCostDO::getActualNickelTons, reqVO.getActualNickelTons())
                .betweenIfPresent(FiveIndicatorCostDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(FiveIndicatorCostDO::getId));
    }

}