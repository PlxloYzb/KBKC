package cn.iocoder.yudao.module.costanalysis.service.fiveindicatorcost;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.fiveindicatorcost.FiveIndicatorCostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 五项费用成本分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface FiveIndicatorCostService {

    /**
     * 创建五项费用成本分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createFiveIndicatorCost(@Valid FiveIndicatorCostSaveReqVO createReqVO);

    /**
     * 更新五项费用成本分析
     *
     * @param updateReqVO 更新信息
     */
    void updateFiveIndicatorCost(@Valid FiveIndicatorCostSaveReqVO updateReqVO);

    /**
     * 删除五项费用成本分析
     *
     * @param id 编号
     */
    void deleteFiveIndicatorCost(Long id);

    /**
     * 获得五项费用成本分析
     *
     * @param id 编号
     * @return 五项费用成本分析
     */
    FiveIndicatorCostDO getFiveIndicatorCost(Long id);

    /**
     * 获得五项费用成本分析分页
     *
     * @param pageReqVO 分页查询
     * @return 五项费用成本分析分页
     */
    PageResult<FiveIndicatorCostDO> getFiveIndicatorCostPage(FiveIndicatorCostPageReqVO pageReqVO);

}