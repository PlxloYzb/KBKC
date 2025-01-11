package cn.iocoder.yudao.module.costanalysis.dal.dataobject.dieselconsumption;

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
 * 柴油成本分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_diesel_consumption")
@KeySequence("costanalysis_diesel_consumption_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DieselConsumptionDO extends BaseDO {

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
     * 实际柴油消耗量(L)
     */
    private BigDecimal actualDieselConsumptionLiters;
    /**
     * 实际柴油消耗金额（美元）
     */
    private BigDecimal actualDieselCostUsd;
    /**
     * 计划柴油消耗量(L)
     */
    private BigDecimal plannedDieselConsumptionLiters;
    /**
     * 计划柴油消耗金额（美元）
     */
    private BigDecimal plannedDieselCostUsd;
    /**
     * 实际发电柴油量(L)
     */
    private BigDecimal actualPowerDieselConsumptionLiters;
    /**
     * 实际发电柴油金额（美元）
     */
    private BigDecimal actualPowerDieselCostUsd;
    /**
     * 计划发电柴油量(L)
     */
    private BigDecimal plannedPowerDieselConsumptionLiters;
    /**
     * 计划发电柴油金额（美元）
     */
    private BigDecimal plannedPowerDieselCostUsd;
    /**
     * 实际机采柴油量(L)
     */
    private BigDecimal actualMechanicalDieselConsumptionLiters;
    /**
     * 实际机采柴油金额（美元）
     */
    private BigDecimal actualMechanicalDieselCostUsd;
    /**
     * 计划机采柴油量(L)
     */
    private BigDecimal plannedMechanicalDieselConsumptionLiters;
    /**
     * 计划机采柴油金额
     */
    private BigDecimal plannedMechanicalDieselCostUsd;
    /**
     * 实际水采柴油量(L)
     */
    private BigDecimal actualHydraulicDieselConsumptionLiters;
    /**
     * 实际水采柴油金额（美元）
     */
    private BigDecimal actualHydraulicDieselCostUsd;
    /**
     * 计划水采柴油量(L)
     */
    private BigDecimal plannedHydraulicDieseConsumptionlLiters;
    /**
     * 计划水采柴油金额（美元）
     */
    private BigDecimal plannedHydraulicDieselCostUsd;
    /**
     * 实际其他消耗柴油量(L)
     */
    private BigDecimal actualOtherDieselConsumptionLiters;
    /**
     * 实际其他消耗柴油金额(美元)
     */
    private BigDecimal actualOtherDieselCostUsd;
    /**
     * 计划其他消耗柴油量(L)
     */
    private BigDecimal plannedOtherDieselConsumptionLiters;
    /**
     * 计划其他消耗柴油金额(美元)
     */
    private BigDecimal plannedOtherDieselCostUsd;

}