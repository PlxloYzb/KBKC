package cn.iocoder.yudao.module.costanalysis.service.bulkcommodity;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.bulkcommodity.BulkCommodityDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 大宗物资细节对比分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface BulkCommodityService {

    /**
     * 创建大宗物资细节对比分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createBulkCommodity(@Valid BulkCommoditySaveReqVO createReqVO);

    /**
     * 更新大宗物资细节对比分析
     *
     * @param updateReqVO 更新信息
     */
    void updateBulkCommodity(@Valid BulkCommoditySaveReqVO updateReqVO);

    /**
     * 删除大宗物资细节对比分析
     *
     * @param id 编号
     */
    void deleteBulkCommodity(Long id);

    /**
     * 获得大宗物资细节对比分析
     *
     * @param id 编号
     * @return 大宗物资细节对比分析
     */
    BulkCommodityDO getBulkCommodity(Long id);

    /**
     * 获得大宗物资细节对比分析分页
     *
     * @param pageReqVO 分页查询
     * @return 大宗物资细节对比分析分页
     */
    PageResult<BulkCommodityDO> getBulkCommodityPage(BulkCommodityPageReqVO pageReqVO);

}