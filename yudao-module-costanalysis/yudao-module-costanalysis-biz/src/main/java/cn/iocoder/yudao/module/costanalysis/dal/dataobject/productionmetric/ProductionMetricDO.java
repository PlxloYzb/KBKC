package cn.iocoder.yudao.module.costanalysis.dal.dataobject.productionmetric;

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
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 生产指标分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_production_metric")
@KeySequence("costanalysis_production_metric_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductionMetricDO extends BaseDO {

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
     * 实际输送矿浆含镍量（T）
     */
    private BigDecimal actualSlurryNickelTons;
    /**
     * 实际输送干矿（T）
     */
    private BigDecimal actualDryOreTons;
    /**
     * 实际输送矿浆平均浓度（%）
     */
    private BigDecimal actualSlurryConcentrationPct;
    /**
     * 实际输出矿浆镍品位（%）
     */
    private BigDecimal actualOutputNickelGradePct;
    /**
     * 实际矿浆含钴金属量（T）
     */
    private BigDecimal actualSlurryCobaltTons;
    /**
     * 实际采剥总量（T）
     */
    private BigDecimal actualMiningTotalTons;
    /**
     * 实际铬精矿外运量（T）
     */
    private BigDecimal actualChromeExportTons;
    /**
     * 实际铬精矿干矿产量（T）
     */
    private BigDecimal actualChromeDryProductionTons;
    /**
     * 计划输送矿浆含镍量（T）
     */
    private BigDecimal plannedSlurryNickelTons;
    /**
     * 计划输送干矿（T）
     */
    private BigDecimal plannedDryOreTons;
    /**
     * 计划输送矿浆平均浓度（%）
     */
    private BigDecimal plannedSlurryConcentrationPct;
    /**
     * 计划输出矿浆镍品位（%）
     */
    private BigDecimal plannedOutputNickelGradePct;
    /**
     * 计划矿浆含钴金属量（T）
     */
    private BigDecimal plannedSlurryCobaltTons;
    /**
     * 计划采剥总量（T）
     */
    private BigDecimal plannedMiningTotalTons;
    /**
     * 计划铬精矿外运量（T）
     */
    private BigDecimal plannedChromeExportTons;
    /**
     * 计划铬精矿干矿产量（T）
     */
    private BigDecimal plannedChromeDryProductionTons;

}