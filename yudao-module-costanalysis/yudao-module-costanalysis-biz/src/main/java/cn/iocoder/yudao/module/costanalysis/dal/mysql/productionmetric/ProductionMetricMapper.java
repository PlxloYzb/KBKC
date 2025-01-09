package cn.iocoder.yudao.module.costanalysis.dal.mysql.productionmetric;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.productionmetric.ProductionMetricDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo.*;

/**
 * 生产指标分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface ProductionMetricMapper extends BaseMapperX<ProductionMetricDO> {

    default PageResult<ProductionMetricDO> selectPage(ProductionMetricPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ProductionMetricDO>()
                .betweenIfPresent(ProductionMetricDO::getDate, reqVO.getDate())
                .betweenIfPresent(ProductionMetricDO::getActualSlurryNickelTons, reqVO.getActualSlurryNickelTons())
                .betweenIfPresent(ProductionMetricDO::getActualDryOreTons, reqVO.getActualDryOreTons())
                .betweenIfPresent(ProductionMetricDO::getActualSlurryConcentrationPct, reqVO.getActualSlurryConcentrationPct())
                .betweenIfPresent(ProductionMetricDO::getActualOutputNickelGradePct, reqVO.getActualOutputNickelGradePct())
                .betweenIfPresent(ProductionMetricDO::getActualSlurryCobaltTons, reqVO.getActualSlurryCobaltTons())
                .betweenIfPresent(ProductionMetricDO::getActualMiningTotalTons, reqVO.getActualMiningTotalTons())
                .betweenIfPresent(ProductionMetricDO::getActualChromeExportTons, reqVO.getActualChromeExportTons())
                .betweenIfPresent(ProductionMetricDO::getActualChromeDryProductionTons, reqVO.getActualChromeDryProductionTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedSlurryNickelTons, reqVO.getPlannedSlurryNickelTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedDryOreTons, reqVO.getPlannedDryOreTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedSlurryConcentrationPct, reqVO.getPlannedSlurryConcentrationPct())
                .betweenIfPresent(ProductionMetricDO::getPlannedOutputNickelGradePct, reqVO.getPlannedOutputNickelGradePct())
                .betweenIfPresent(ProductionMetricDO::getPlannedSlurryCobaltTons, reqVO.getPlannedSlurryCobaltTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedMiningTotalTons, reqVO.getPlannedMiningTotalTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedChromeExportTons, reqVO.getPlannedChromeExportTons())
                .betweenIfPresent(ProductionMetricDO::getPlannedChromeDryProductionTons, reqVO.getPlannedChromeDryProductionTons())
                .betweenIfPresent(ProductionMetricDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ProductionMetricDO::getId));
    }

}