package cn.iocoder.yudao.module.costanalysis.service.nickelproductioncostanalysis;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.nickelproductioncostanalysis.NickelProductionCostAnalysisDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 镍金属输送量成本分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface NickelProductionCostAnalysisService {

    /**
     * 创建镍金属输送量成本分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createNickelProductionCostAnalysis(@Valid NickelProductionCostAnalysisSaveReqVO createReqVO);

    /**
     * 更新镍金属输送量成本分析
     *
     * @param updateReqVO 更新信息
     */
    void updateNickelProductionCostAnalysis(@Valid NickelProductionCostAnalysisSaveReqVO updateReqVO);

    /**
     * 删除镍金属输送量成本分析
     *
     * @param id 编号
     */
    void deleteNickelProductionCostAnalysis(Long id);

    /**
     * 获得镍金属输送量成本分析
     *
     * @param id 编号
     * @return 镍金属输送量成本分析
     */
    NickelProductionCostAnalysisDO getNickelProductionCostAnalysis(Long id);

    /**
     * 获得镍金属输送量成本分析分页
     *
     * @param pageReqVO 分页查询
     * @return 镍金属输送量成本分析分页
     */
    PageResult<NickelProductionCostAnalysisDO> getNickelProductionCostAnalysisPage(NickelProductionCostAnalysisPageReqVO pageReqVO);

}