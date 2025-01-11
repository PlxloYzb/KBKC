package cn.iocoder.yudao.module.costanalysis.service.kbk34cost;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbk34cost.Kbk34CostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.kbk34cost.Kbk34CostMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 矿山34项费用分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class Kbk34CostServiceImpl implements Kbk34CostService {

    @Resource
    private Kbk34CostMapper kbk34CostMapper;

    @Override
    public Long createKbk34Cost(Kbk34CostSaveReqVO createReqVO) {
        // 插入
        Kbk34CostDO kbk34Cost = BeanUtils.toBean(createReqVO, Kbk34CostDO.class);
        kbk34CostMapper.insert(kbk34Cost);
        // 返回
        return kbk34Cost.getId();
    }

    @Override
    public void updateKbk34Cost(Kbk34CostSaveReqVO updateReqVO) {
        // 校验存在
        validateKbk34CostExists(updateReqVO.getId());
        // 更新
        Kbk34CostDO updateObj = BeanUtils.toBean(updateReqVO, Kbk34CostDO.class);
        kbk34CostMapper.updateById(updateObj);
    }

    @Override
    public void deleteKbk34Cost(Long id) {
        // 校验存在
        validateKbk34CostExists(id);
        // 删除
        kbk34CostMapper.deleteById(id);
    }

    private void validateKbk34CostExists(Long id) {
        if (kbk34CostMapper.selectById(id) == null) {
            throw exception(KBK34_COST_NOT_EXISTS);
        }
    }

    @Override
    public Kbk34CostDO getKbk34Cost(Long id) {
        return kbk34CostMapper.selectById(id);
    }

    @Override
    public PageResult<Kbk34CostDO> getKbk34CostPage(Kbk34CostPageReqVO pageReqVO) {
        return kbk34CostMapper.selectPage(pageReqVO);
    }

}