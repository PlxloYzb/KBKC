package cn.iocoder.yudao.module.costanalysis.service.productionmetric;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.productionmetric.ProductionMetricDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.productionmetric.ProductionMetricMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 生产指标分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class ProductionMetricServiceImpl implements ProductionMetricService {

    @Resource
    private ProductionMetricMapper productionMetricMapper;

    @Override
    public Long createProductionMetric(ProductionMetricSaveReqVO createReqVO) {
        // 插入
        ProductionMetricDO productionMetric = BeanUtils.toBean(createReqVO, ProductionMetricDO.class);
        productionMetricMapper.insert(productionMetric);
        // 返回
        return productionMetric.getId();
    }

    @Override
    public void updateProductionMetric(ProductionMetricSaveReqVO updateReqVO) {
        // 校验存在
        validateProductionMetricExists(updateReqVO.getId());
        // 更新
        ProductionMetricDO updateObj = BeanUtils.toBean(updateReqVO, ProductionMetricDO.class);
        productionMetricMapper.updateById(updateObj);
    }

    @Override
    public void deleteProductionMetric(Long id) {
        // 校验存在
        validateProductionMetricExists(id);
        // 删除
        productionMetricMapper.deleteById(id);
    }

    private void validateProductionMetricExists(Long id) {
        if (productionMetricMapper.selectById(id) == null) {
            throw exception(PRODUCTION_METRIC_NOT_EXISTS);
        }
    }

    @Override
    public ProductionMetricDO getProductionMetric(Long id) {
        return productionMetricMapper.selectById(id);
    }

    @Override
    public PageResult<ProductionMetricDO> getProductionMetricPage(ProductionMetricPageReqVO pageReqVO) {
        return productionMetricMapper.selectPage(pageReqVO);
    }

}