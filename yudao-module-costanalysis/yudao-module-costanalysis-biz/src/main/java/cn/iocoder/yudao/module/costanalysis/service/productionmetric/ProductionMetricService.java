package cn.iocoder.yudao.module.costanalysis.service.productionmetric;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.productionmetric.ProductionMetricDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 生产指标分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface ProductionMetricService {

    /**
     * 创建生产指标分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createProductionMetric(@Valid ProductionMetricSaveReqVO createReqVO);

    /**
     * 更新生产指标分析
     *
     * @param updateReqVO 更新信息
     */
    void updateProductionMetric(@Valid ProductionMetricSaveReqVO updateReqVO);

    /**
     * 删除生产指标分析
     *
     * @param id 编号
     */
    void deleteProductionMetric(Long id);

    /**
     * 获得生产指标分析
     *
     * @param id 编号
     * @return 生产指标分析
     */
    ProductionMetricDO getProductionMetric(Long id);

    /**
     * 获得生产指标分析分页
     *
     * @param pageReqVO 分页查询
     * @return 生产指标分析分页
     */
    PageResult<ProductionMetricDO> getProductionMetricPage(ProductionMetricPageReqVO pageReqVO);

}