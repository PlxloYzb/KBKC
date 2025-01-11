package cn.iocoder.yudao.module.costanalysis.dal.dataobject.watersourceproductiondetails;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 水源地生产分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_water_source_production_details")
@KeySequence("costanalysis_water_source_production_details_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WaterSourceProductionDetailsDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 日期
     */
    private LocalDateTime date;
    /**
     * 水源地供水量
     */
    private BigDecimal waterSourceSupplyVolumePerM3;
    /**
     * 水源地耗电量
     */
    private BigDecimal waterSourcePowerConsumptionKwh;
    /**
     * 供水单耗
     */
    private BigDecimal waterSupplyPowerUnitConsumptionKwhPerM3;

}