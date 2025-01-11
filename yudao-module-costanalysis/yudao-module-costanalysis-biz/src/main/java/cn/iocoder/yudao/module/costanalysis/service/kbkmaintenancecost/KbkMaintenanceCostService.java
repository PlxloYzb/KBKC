package cn.iocoder.yudao.module.costanalysis.service.kbkmaintenancecost;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbkmaintenancecost.KbkMaintenanceCostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 月度维检费成本分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface KbkMaintenanceCostService {

    /**
     * 创建月度维检费成本分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createKbkMaintenanceCost(@Valid KbkMaintenanceCostSaveReqVO createReqVO);

    /**
     * 更新月度维检费成本分析
     *
     * @param updateReqVO 更新信息
     */
    void updateKbkMaintenanceCost(@Valid KbkMaintenanceCostSaveReqVO updateReqVO);

    /**
     * 删除月度维检费成本分析
     *
     * @param id 编号
     */
    void deleteKbkMaintenanceCost(Long id);

    /**
     * 获得月度维检费成本分析
     *
     * @param id 编号
     * @return 月度维检费成本分析
     */
    KbkMaintenanceCostDO getKbkMaintenanceCost(Long id);

    /**
     * 获得月度维检费成本分析分页
     *
     * @param pageReqVO 分页查询
     * @return 月度维检费成本分析分页
     */
    PageResult<KbkMaintenanceCostDO> getKbkMaintenanceCostPage(KbkMaintenanceCostPageReqVO pageReqVO);

}