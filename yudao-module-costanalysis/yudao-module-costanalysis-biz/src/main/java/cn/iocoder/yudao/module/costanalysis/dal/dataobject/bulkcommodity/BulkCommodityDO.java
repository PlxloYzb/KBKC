package cn.iocoder.yudao.module.costanalysis.dal.dataobject.bulkcommodity;

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
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 大宗物资细节对比分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_bulk_commodity")
@KeySequence("costanalysis_bulk_commodity_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkCommodityDO extends BaseDO {

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
     * 实际絮凝剂单耗
     */
    private BigDecimal actualFlocculantUnitConsumption;
    /**
     * 实际絮凝剂单价
     */
    private BigDecimal actualFlocculantUnitPriceUsdPerTon;
    /**
     * 实际絮凝剂金额
     */
    private BigDecimal actualFlocculantCostUsd;
    /**
     * 计划絮凝剂单耗
     */
    private BigDecimal plannedFlocculantUnitConsumption;
    /**
     * 计划絮凝剂单价
     */
    private BigDecimal plannedFlocculantUnitPriceUsdPerTon;
    /**
     * 计划絮凝剂金额
     */
    private BigDecimal plannedFlocculantCostUsd;
    /**
     * 实际钢球单耗
     */
    private BigDecimal actualSteelBallUnitConsumption;
    /**
     * 实际钢球单价
     */
    private BigDecimal actualSteelBallUnitPriceUsdPerTon;
    /**
     * 实际钢球金额
     */
    private BigDecimal actualSteelBallCostUsd;
    /**
     * 计划钢球钢球单耗
     */
    private BigDecimal plannedSteelBallUnitConsumption;
    /**
     * 计划钢球单价
     */
    private BigDecimal plannedSteelBallUnitPriceUsdPerTon;
    /**
     * 计划钢球金额
     */
    private BigDecimal plannedSteelBallCostUsd;
    /**
     * 实际轮胎单耗
     */
    private BigDecimal actualTireUnitConsumption;
    /**
     * 实际轮胎单价
     */
    private BigDecimal actualTireUnitPriceUsdPerTon;
    /**
     * 实际轮胎金额
     */
    private BigDecimal actualTireCostUsd;
    /**
     * 计划轮胎单耗
     */
    private BigDecimal plannedTireUnitConsumption;
    /**
     * 计划轮胎单价
     */
    private BigDecimal plannedTireUnitPriceUsdPerTon;
    /**
     * 计划轮胎金额
     */
    private BigDecimal plannedTireCostUsd;
    /**
     * 实际包装袋单耗
     */
    private BigDecimal actualPackagingUnitConsumption;
    /**
     * 实际包装袋单价
     */
    private BigDecimal actualPackagingUnitPriceUsdPerTon;
    /**
     * 实际包装袋金额
     */
    private BigDecimal actualPackagingCostUsd;
    /**
     * 计划包装袋单耗
     */
    private BigDecimal plannedPackagingUnitConsumption;
    /**
     * 计划包装袋单价
     */
    private BigDecimal plannedPackagingUnitPriceUsdPerTon;
    /**
     * 计划包装袋金额
     */
    private BigDecimal plannedPackagingCostUsd;

}