package cn.iocoder.yudao.module.costanalysis.dal.dataobject.fiveindicatorcost;

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
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 五项费用成本分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_five_indicator_cost")
@KeySequence("costanalysis_five_indicator_cost_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FiveIndicatorCostDO extends BaseDO {

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
     * 实际原辅材料（美元）
     */
    private BigDecimal actualRawMaterialsCostUsd;
    /**
     * 实际燃料动力费（美元）
     */
    private BigDecimal actualEnergyCostUsd;
    /**
     * 实际人工费用（美元）
     */
    private BigDecimal actualLaborCostUsd;
    /**
     * 实际备品备件及维检费（美元）
     */
    private BigDecimal actualMaintenanceCostUsd;
    /**
     * 实际其他直接费（美元）
     */
    private BigDecimal actualOtherDirectCostUsd;
    /**
     * 计划原辅材料（美元）
     */
    private BigDecimal plannedRawMaterialsCostUsd;
    /**
     * 计划燃料动力费（美元）
     */
    private BigDecimal plannedEnergyCostUsd;
    /**
     * 计划人工费用（美元）
     */
    private BigDecimal plannedLaborCostUsd;
    /**
     * 计划备品备件及维检费（美元）
     */
    private BigDecimal plannedMaintenanceCostUsd;
    /**
     * 计划其他直接费（美元）
     */
    private BigDecimal plannedOtherDirectCostUsd;
    /**
     * 实际输送镍金属量（吨）
     */
    private BigDecimal actualNickelTons;

}