package cn.iocoder.yudao.module.costanalysis.dal.dataobject.npowerplant;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 电厂发电成本分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_npower_plant")
@KeySequence("costanalysis_npower_plant_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NpowerPlantDO extends BaseDO {

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
     * 发电量
     */
    private BigDecimal powerGenerationKwh;
    /**
     * 实际电厂发电燃料动力费
     */
    private BigDecimal actualPowerPlantFuelCostUsd;
    /**
     * 实际电厂发电人工费用
     */
    private BigDecimal actualPowerPlantLaborCostUsd;
    /**
     * 实际电厂发电维检费
     */
    private BigDecimal actualPowerPlantMaintenanceCostUsd;
    /**
     * 实际电厂发电其他直接费用
     */
    private BigDecimal actualPowerPlantOtherDirectCostUsd;
    /**
     * 计划燃料单位成本
     */
    private BigDecimal plannedPowerPlantFuelCostUsdPerKwh;
    /**
     * 计划人工单位成本
     */
    private BigDecimal plannedPowerPlantLaborCostUsdPerKwh;
    /**
     * 计划维检费单位成本
     */
    private BigDecimal plannedPowerPlantMaintenanceCostUsdPerKwh;
    /**
     * 计划制造费用单位成本
     */
    private BigDecimal plannedPowerPlantOtherDirectCostUsdPerKwh;
    /**
     * 计划镍金属产量
     */
    private BigDecimal plannedNickelProductionTons;

}