package cn.iocoder.yudao.module.costanalysis.service.watersourceproductiondetails;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.watersourceproductiondetails.WaterSourceProductionDetailsDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 水源地生产分析 Service 接口
 *
 * @author PlxloYzb
 */
public interface WaterSourceProductionDetailsService {

    /**
     * 创建水源地生产分析
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createWaterSourceProductionDetails(@Valid WaterSourceProductionDetailsSaveReqVO createReqVO);

    /**
     * 更新水源地生产分析
     *
     * @param updateReqVO 更新信息
     */
    void updateWaterSourceProductionDetails(@Valid WaterSourceProductionDetailsSaveReqVO updateReqVO);

    /**
     * 删除水源地生产分析
     *
     * @param id 编号
     */
    void deleteWaterSourceProductionDetails(Long id);

    /**
     * 获得水源地生产分析
     *
     * @param id 编号
     * @return 水源地生产分析
     */
    WaterSourceProductionDetailsDO getWaterSourceProductionDetails(Long id);

    /**
     * 获得水源地生产分析分页
     *
     * @param pageReqVO 分页查询
     * @return 水源地生产分析分页
     */
    PageResult<WaterSourceProductionDetailsDO> getWaterSourceProductionDetailsPage(WaterSourceProductionDetailsPageReqVO pageReqVO);

}