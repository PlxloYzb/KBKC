package cn.iocoder.yudao.module.costanalysis.dal.mysql.watersourceproductiondetails;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.watersourceproductiondetails.WaterSourceProductionDetailsDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo.*;

/**
 * 水源地生产分析 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface WaterSourceProductionDetailsMapper extends BaseMapperX<WaterSourceProductionDetailsDO> {

    default PageResult<WaterSourceProductionDetailsDO> selectPage(WaterSourceProductionDetailsPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<WaterSourceProductionDetailsDO>()
                .betweenIfPresent(WaterSourceProductionDetailsDO::getDate, reqVO.getDate())
                .betweenIfPresent(WaterSourceProductionDetailsDO::getWaterSourceSupplyVolumePerM3, reqVO.getWaterSourceSupplyVolumePerM3())
                .betweenIfPresent(WaterSourceProductionDetailsDO::getWaterSourcePowerConsumptionKwh, reqVO.getWaterSourcePowerConsumptionKwh())
                .betweenIfPresent(WaterSourceProductionDetailsDO::getWaterSupplyPowerUnitConsumptionKwhPerM3, reqVO.getWaterSupplyPowerUnitConsumptionKwhPerM3())
                .betweenIfPresent(WaterSourceProductionDetailsDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(WaterSourceProductionDetailsDO::getId));
    }

}