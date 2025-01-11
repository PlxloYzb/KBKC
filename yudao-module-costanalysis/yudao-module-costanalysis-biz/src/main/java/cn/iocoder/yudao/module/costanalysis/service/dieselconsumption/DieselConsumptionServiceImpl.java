package cn.iocoder.yudao.module.costanalysis.service.dieselconsumption;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.dieselconsumption.DieselConsumptionDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.dieselconsumption.DieselConsumptionMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 柴油成本分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class DieselConsumptionServiceImpl implements DieselConsumptionService {

    @Resource
    private DieselConsumptionMapper dieselConsumptionMapper;

    @Override
    public Long createDieselConsumption(DieselConsumptionSaveReqVO createReqVO) {
        // 插入
        DieselConsumptionDO dieselConsumption = BeanUtils.toBean(createReqVO, DieselConsumptionDO.class);
        dieselConsumptionMapper.insert(dieselConsumption);
        // 返回
        return dieselConsumption.getId();
    }

    @Override
    public void updateDieselConsumption(DieselConsumptionSaveReqVO updateReqVO) {
        // 校验存在
        validateDieselConsumptionExists(updateReqVO.getId());
        // 更新
        DieselConsumptionDO updateObj = BeanUtils.toBean(updateReqVO, DieselConsumptionDO.class);
        dieselConsumptionMapper.updateById(updateObj);
    }

    @Override
    public void deleteDieselConsumption(Long id) {
        // 校验存在
        validateDieselConsumptionExists(id);
        // 删除
        dieselConsumptionMapper.deleteById(id);
    }

    private void validateDieselConsumptionExists(Long id) {
        if (dieselConsumptionMapper.selectById(id) == null) {
            throw exception(DIESEL_CONSUMPTION_NOT_EXISTS);
        }
    }

    @Override
    public DieselConsumptionDO getDieselConsumption(Long id) {
        return dieselConsumptionMapper.selectById(id);
    }

    @Override
    public PageResult<DieselConsumptionDO> getDieselConsumptionPage(DieselConsumptionPageReqVO pageReqVO) {
        return dieselConsumptionMapper.selectPage(pageReqVO);
    }

}