package cn.iocoder.yudao.module.costanalysis.service.dieselconsumption;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.dieselconsumption.DieselConsumptionDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 柴油成本分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface DieselConsumptionService {

    /**
     * 创建柴油成本分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDieselConsumption(@Valid DieselConsumptionSaveReqVO createReqVO);

    /**
     * 更新柴油成本分析
     *
     * @param updateReqVO 更新信息
     */
    void updateDieselConsumption(@Valid DieselConsumptionSaveReqVO updateReqVO);

    /**
     * 删除柴油成本分析
     *
     * @param id 编号
     */
    void deleteDieselConsumption(Long id);

    /**
     * 获得柴油成本分析
     *
     * @param id 编号
     * @return 柴油成本分析
     */
    DieselConsumptionDO getDieselConsumption(Long id);

    /**
     * 获得柴油成本分析分页
     *
     * @param pageReqVO 分页查询
     * @return 柴油成本分析分页
     */
    PageResult<DieselConsumptionDO> getDieselConsumptionPage(DieselConsumptionPageReqVO pageReqVO);

}