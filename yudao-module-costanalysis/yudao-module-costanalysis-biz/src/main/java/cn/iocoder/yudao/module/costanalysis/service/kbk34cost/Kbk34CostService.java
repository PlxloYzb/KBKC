package cn.iocoder.yudao.module.costanalysis.service.kbk34cost;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbk34cost.Kbk34CostDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 矿山34项费用分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface Kbk34CostService {

    /**
     * 创建矿山34项费用分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createKbk34Cost(@Valid Kbk34CostSaveReqVO createReqVO);

    /**
     * 更新矿山34项费用分析
     *
     * @param updateReqVO 更新信息
     */
    void updateKbk34Cost(@Valid Kbk34CostSaveReqVO updateReqVO);

    /**
     * 删除矿山34项费用分析
     *
     * @param id 编号
     */
    void deleteKbk34Cost(Long id);

    /**
     * 获得矿山34项费用分析
     *
     * @param id 编号
     * @return 矿山34项费用分析
     */
    Kbk34CostDO getKbk34Cost(Long id);

    /**
     * 获得矿山34项费用分析分页
     *
     * @param pageReqVO 分页查询
     * @return 矿山34项费用分析分页
     */
    PageResult<Kbk34CostDO> getKbk34CostPage(Kbk34CostPageReqVO pageReqVO);

}