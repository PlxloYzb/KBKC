package cn.iocoder.yudao.module.costanalysis.service.npowerplant;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.npowerplant.NpowerPlantDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 电厂发电成本分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface NpowerPlantService {

    /**
     * 创建电厂发电成本分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createNpowerPlant(@Valid NpowerPlantSaveReqVO createReqVO);

    /**
     * 更新电厂发电成本分析
     *
     * @param updateReqVO 更新信息
     */
    void updateNpowerPlant(@Valid NpowerPlantSaveReqVO updateReqVO);

    /**
     * 删除电厂发电成本分析
     *
     * @param id 编号
     */
    void deleteNpowerPlant(Long id);

    /**
     * 获得电厂发电成本分析
     *
     * @param id 编号
     * @return 电厂发电成本分析
     */
    NpowerPlantDO getNpowerPlant(Long id);

    /**
     * 获得电厂发电成本分析分页
     *
     * @param pageReqVO 分页查询
     * @return 电厂发电成本分析分页
     */
    PageResult<NpowerPlantDO> getNpowerPlantPage(NpowerPlantPageReqVO pageReqVO);

}