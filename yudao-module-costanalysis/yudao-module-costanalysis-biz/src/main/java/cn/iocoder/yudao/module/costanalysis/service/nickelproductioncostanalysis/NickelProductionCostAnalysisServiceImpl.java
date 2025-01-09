package cn.iocoder.yudao.module.costanalysis.service.nickelproductioncostanalysis;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.nickelproductioncostanalysis.NickelProductionCostAnalysisDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.nickelproductioncostanalysis.NickelProductionCostAnalysisMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 镍金属输送量成本分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class NickelProductionCostAnalysisServiceImpl implements NickelProductionCostAnalysisService {

    @Resource
    private NickelProductionCostAnalysisMapper nickelProductionCostAnalysisMapper;

    @Override
    public Long createNickelProductionCostAnalysis(NickelProductionCostAnalysisSaveReqVO createReqVO) {
        // 插入
        NickelProductionCostAnalysisDO nickelProductionCostAnalysis = BeanUtils.toBean(createReqVO, NickelProductionCostAnalysisDO.class);
        nickelProductionCostAnalysisMapper.insert(nickelProductionCostAnalysis);
        // 返回
        return nickelProductionCostAnalysis.getId();
    }

    @Override
    public void updateNickelProductionCostAnalysis(NickelProductionCostAnalysisSaveReqVO updateReqVO) {
        // 校验存在
        validateNickelProductionCostAnalysisExists(updateReqVO.getId());
        // 更新
        NickelProductionCostAnalysisDO updateObj = BeanUtils.toBean(updateReqVO, NickelProductionCostAnalysisDO.class);
        nickelProductionCostAnalysisMapper.updateById(updateObj);
    }

    @Override
    public void deleteNickelProductionCostAnalysis(Long id) {
        // 校验存在
        validateNickelProductionCostAnalysisExists(id);
        // 删除
        nickelProductionCostAnalysisMapper.deleteById(id);
    }

    private void validateNickelProductionCostAnalysisExists(Long id) {
        if (nickelProductionCostAnalysisMapper.selectById(id) == null) {
            throw exception(NICKEL_PRODUCTION_COST_ANALYSIS_NOT_EXISTS);
        }
    }

    @Override
    public NickelProductionCostAnalysisDO getNickelProductionCostAnalysis(Long id) {
        return nickelProductionCostAnalysisMapper.selectById(id);
    }

    @Override
    public PageResult<NickelProductionCostAnalysisDO> getNickelProductionCostAnalysisPage(NickelProductionCostAnalysisPageReqVO pageReqVO) {
        return nickelProductionCostAnalysisMapper.selectPage(pageReqVO);
    }

}