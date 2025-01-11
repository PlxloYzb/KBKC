package cn.iocoder.yudao.module.costanalysis.service.watersourceproductiondetails;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.watersourceproductiondetails.WaterSourceProductionDetailsDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.watersourceproductiondetails.WaterSourceProductionDetailsMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 水源地生产分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class WaterSourceProductionDetailsServiceImpl implements WaterSourceProductionDetailsService {

    @Resource
    private WaterSourceProductionDetailsMapper waterSourceProductionDetailsMapper;

    @Override
    public Long createWaterSourceProductionDetails(WaterSourceProductionDetailsSaveReqVO createReqVO) {
        // 插入
        WaterSourceProductionDetailsDO waterSourceProductionDetails = BeanUtils.toBean(createReqVO, WaterSourceProductionDetailsDO.class);
        waterSourceProductionDetailsMapper.insert(waterSourceProductionDetails);
        // 返回
        return waterSourceProductionDetails.getId();
    }

    @Override
    public void updateWaterSourceProductionDetails(WaterSourceProductionDetailsSaveReqVO updateReqVO) {
        // 校验存在
        validateWaterSourceProductionDetailsExists(updateReqVO.getId());
        // 更新
        WaterSourceProductionDetailsDO updateObj = BeanUtils.toBean(updateReqVO, WaterSourceProductionDetailsDO.class);
        waterSourceProductionDetailsMapper.updateById(updateObj);
    }

    @Override
    public void deleteWaterSourceProductionDetails(Long id) {
        // 校验存在
        validateWaterSourceProductionDetailsExists(id);
        // 删除
        waterSourceProductionDetailsMapper.deleteById(id);
    }

    private void validateWaterSourceProductionDetailsExists(Long id) {
        if (waterSourceProductionDetailsMapper.selectById(id) == null) {
            throw exception(WATER_SOURCE_PRODUCTION_DETAILS_NOT_EXISTS);
        }
    }

    @Override
    public WaterSourceProductionDetailsDO getWaterSourceProductionDetails(Long id) {
        return waterSourceProductionDetailsMapper.selectById(id);
    }

    @Override
    public PageResult<WaterSourceProductionDetailsDO> getWaterSourceProductionDetailsPage(WaterSourceProductionDetailsPageReqVO pageReqVO) {
        return waterSourceProductionDetailsMapper.selectPage(pageReqVO);
    }

}