package cn.iocoder.yudao.module.costanalysis.service.npowerplant;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.npowerplant.NpowerPlantDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.npowerplant.NpowerPlantMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 电厂发电成本分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class NpowerPlantServiceImpl implements NpowerPlantService {

    @Resource
    private NpowerPlantMapper npowerPlantMapper;

    @Override
    public Long createNpowerPlant(NpowerPlantSaveReqVO createReqVO) {
        // 插入
        NpowerPlantDO npowerPlant = BeanUtils.toBean(createReqVO, NpowerPlantDO.class);
        npowerPlantMapper.insert(npowerPlant);
        // 返回
        return npowerPlant.getId();
    }

    @Override
    public void updateNpowerPlant(NpowerPlantSaveReqVO updateReqVO) {
        // 校验存在
        validateNpowerPlantExists(updateReqVO.getId());
        // 更新
        NpowerPlantDO updateObj = BeanUtils.toBean(updateReqVO, NpowerPlantDO.class);
        npowerPlantMapper.updateById(updateObj);
    }

    @Override
    public void deleteNpowerPlant(Long id) {
        // 校验存在
        validateNpowerPlantExists(id);
        // 删除
        npowerPlantMapper.deleteById(id);
    }

    private void validateNpowerPlantExists(Long id) {
        if (npowerPlantMapper.selectById(id) == null) {
            throw exception(NPOWER_PLANT_NOT_EXISTS);
        }
    }

    @Override
    public NpowerPlantDO getNpowerPlant(Long id) {
        return npowerPlantMapper.selectById(id);
    }

    @Override
    public PageResult<NpowerPlantDO> getNpowerPlantPage(NpowerPlantPageReqVO pageReqVO) {
        return npowerPlantMapper.selectPage(pageReqVO);
    }

}