package cn.iocoder.yudao.module.costanalysis.dal.mysql.bulkcommodity;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.bulkcommodity.BulkCommodityDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo.*;

/**
 * 大宗物资细节对比分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface BulkCommodityMapper extends BaseMapperX<BulkCommodityDO> {

    default PageResult<BulkCommodityDO> selectPage(BulkCommodityPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BulkCommodityDO>()
                .betweenIfPresent(BulkCommodityDO::getDate, reqVO.getDate())
                .betweenIfPresent(BulkCommodityDO::getActualFlocculantUnitConsumption, reqVO.getActualFlocculantUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getActualFlocculantUnitPriceUsdPerTon, reqVO.getActualFlocculantUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getActualFlocculantCostUsd, reqVO.getActualFlocculantCostUsd())
                .betweenIfPresent(BulkCommodityDO::getPlannedFlocculantUnitConsumption, reqVO.getPlannedFlocculantUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getPlannedFlocculantUnitPriceUsdPerTon, reqVO.getPlannedFlocculantUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getPlannedFlocculantCostUsd, reqVO.getPlannedFlocculantCostUsd())
                .betweenIfPresent(BulkCommodityDO::getActualSteelBallUnitConsumption, reqVO.getActualSteelBallUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getActualSteelBallUnitPriceUsdPerTon, reqVO.getActualSteelBallUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getActualSteelBallCostUsd, reqVO.getActualSteelBallCostUsd())
                .betweenIfPresent(BulkCommodityDO::getPlannedSteelBallUnitConsumption, reqVO.getPlannedSteelBallUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getPlannedSteelBallUnitPriceUsdPerTon, reqVO.getPlannedSteelBallUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getPlannedSteelBallCostUsd, reqVO.getPlannedSteelBallCostUsd())
                .betweenIfPresent(BulkCommodityDO::getActualTireUnitConsumption, reqVO.getActualTireUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getActualTireUnitPriceUsdPerTon, reqVO.getActualTireUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getActualTireCostUsd, reqVO.getActualTireCostUsd())
                .betweenIfPresent(BulkCommodityDO::getPlannedTireUnitConsumption, reqVO.getPlannedTireUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getPlannedTireUnitPriceUsdPerTon, reqVO.getPlannedTireUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getPlannedTireCostUsd, reqVO.getPlannedTireCostUsd())
                .betweenIfPresent(BulkCommodityDO::getActualPackagingUnitConsumption, reqVO.getActualPackagingUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getActualPackagingUnitPriceUsdPerTon, reqVO.getActualPackagingUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getActualPackagingCostUsd, reqVO.getActualPackagingCostUsd())
                .betweenIfPresent(BulkCommodityDO::getPlannedPackagingUnitConsumption, reqVO.getPlannedPackagingUnitConsumption())
                .betweenIfPresent(BulkCommodityDO::getPlannedPackagingUnitPriceUsdPerTon, reqVO.getPlannedPackagingUnitPriceUsdPerTon())
                .betweenIfPresent(BulkCommodityDO::getPlannedPackagingCostUsd, reqVO.getPlannedPackagingCostUsd())
                .betweenIfPresent(BulkCommodityDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BulkCommodityDO::getId));
    }

}