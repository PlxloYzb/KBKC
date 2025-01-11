package cn.iocoder.yudao.module.costanalysis.service.fiveindicatorcost;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.fiveindicatorcost.FiveIndicatorCostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.fiveindicatorcost.FiveIndicatorCostMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 五项费用成本分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class FiveIndicatorCostServiceImpl implements FiveIndicatorCostService {

    @Resource
    private FiveIndicatorCostMapper fiveIndicatorCostMapper;

    @Override
    public Long createFiveIndicatorCost(FiveIndicatorCostSaveReqVO createReqVO) {
        // 插入
        FiveIndicatorCostDO fiveIndicatorCost = BeanUtils.toBean(createReqVO, FiveIndicatorCostDO.class);
        fiveIndicatorCostMapper.insert(fiveIndicatorCost);
        // 返回
        return fiveIndicatorCost.getId();
    }

    @Override
    public void updateFiveIndicatorCost(FiveIndicatorCostSaveReqVO updateReqVO) {
        // 校验存在
        validateFiveIndicatorCostExists(updateReqVO.getId());
        // 更新
        FiveIndicatorCostDO updateObj = BeanUtils.toBean(updateReqVO, FiveIndicatorCostDO.class);
        fiveIndicatorCostMapper.updateById(updateObj);
    }

    @Override
    public void deleteFiveIndicatorCost(Long id) {
        // 校验存在
        validateFiveIndicatorCostExists(id);
        // 删除
        fiveIndicatorCostMapper.deleteById(id);
    }

    private void validateFiveIndicatorCostExists(Long id) {
        if (fiveIndicatorCostMapper.selectById(id) == null) {
            throw exception(FIVE_INDICATOR_COST_NOT_EXISTS);
        }
    }

    @Override
    public FiveIndicatorCostDO getFiveIndicatorCost(Long id) {
        return fiveIndicatorCostMapper.selectById(id);
    }

    @Override
    public PageResult<FiveIndicatorCostDO> getFiveIndicatorCostPage(FiveIndicatorCostPageReqVO pageReqVO) {
        return fiveIndicatorCostMapper.selectPage(pageReqVO);
    }

}