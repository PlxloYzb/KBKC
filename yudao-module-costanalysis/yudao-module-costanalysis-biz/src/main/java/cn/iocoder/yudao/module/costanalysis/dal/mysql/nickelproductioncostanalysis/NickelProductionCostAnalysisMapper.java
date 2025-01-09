package cn.iocoder.yudao.module.costanalysis.dal.mysql.nickelproductioncostanalysis;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.nickelproductioncostanalysis.NickelProductionCostAnalysisDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo.*;

/**
 * 镍金属输送量成本分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface NickelProductionCostAnalysisMapper extends BaseMapperX<NickelProductionCostAnalysisDO> {

    default PageResult<NickelProductionCostAnalysisDO> selectPage(NickelProductionCostAnalysisPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<NickelProductionCostAnalysisDO>()
                .betweenIfPresent(NickelProductionCostAnalysisDO::getDate, reqVO.getDate())
                .betweenIfPresent(NickelProductionCostAnalysisDO::getActualNickelTons, reqVO.getActualNickelTons())
                .betweenIfPresent(NickelProductionCostAnalysisDO::getPlannedNickelTons, reqVO.getPlannedNickelTons())
                .betweenIfPresent(NickelProductionCostAnalysisDO::getActualCostUsd, reqVO.getActualCostUsd())
                .betweenIfPresent(NickelProductionCostAnalysisDO::getPlannedCostPerTonUsd, reqVO.getPlannedCostPerTonUsd())
                .betweenIfPresent(NickelProductionCostAnalysisDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(NickelProductionCostAnalysisDO::getId));
    }

}