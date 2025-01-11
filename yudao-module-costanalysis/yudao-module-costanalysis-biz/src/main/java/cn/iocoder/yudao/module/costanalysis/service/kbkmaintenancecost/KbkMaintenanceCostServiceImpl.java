package cn.iocoder.yudao.module.costanalysis.service.kbkmaintenancecost;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbkmaintenancecost.KbkMaintenanceCostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.kbkmaintenancecost.KbkMaintenanceCostMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 月度维检费成本分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class KbkMaintenanceCostServiceImpl implements KbkMaintenanceCostService {

    @Resource
    private KbkMaintenanceCostMapper kbkMaintenanceCostMapper;

    @Override
    public Long createKbkMaintenanceCost(KbkMaintenanceCostSaveReqVO createReqVO) {
        // 插入
        KbkMaintenanceCostDO kbkMaintenanceCost = BeanUtils.toBean(createReqVO, KbkMaintenanceCostDO.class);
        kbkMaintenanceCostMapper.insert(kbkMaintenanceCost);
        // 返回
        return kbkMaintenanceCost.getId();
    }

    @Override
    public void updateKbkMaintenanceCost(KbkMaintenanceCostSaveReqVO updateReqVO) {
        // 校验存在
        validateKbkMaintenanceCostExists(updateReqVO.getId());
        // 更新
        KbkMaintenanceCostDO updateObj = BeanUtils.toBean(updateReqVO, KbkMaintenanceCostDO.class);
        kbkMaintenanceCostMapper.updateById(updateObj);
    }

    @Override
    public void deleteKbkMaintenanceCost(Long id) {
        // 校验存在
        validateKbkMaintenanceCostExists(id);
        // 删除
        kbkMaintenanceCostMapper.deleteById(id);
    }

    private void validateKbkMaintenanceCostExists(Long id) {
        if (kbkMaintenanceCostMapper.selectById(id) == null) {
            throw exception(KBK_MAINTENANCE_COST_NOT_EXISTS);
        }
    }

    @Override
    public KbkMaintenanceCostDO getKbkMaintenanceCost(Long id) {
        return kbkMaintenanceCostMapper.selectById(id);
    }

    @Override
    public PageResult<KbkMaintenanceCostDO> getKbkMaintenanceCostPage(KbkMaintenanceCostPageReqVO pageReqVO) {
        return kbkMaintenanceCostMapper.selectPage(pageReqVO);
    }

}