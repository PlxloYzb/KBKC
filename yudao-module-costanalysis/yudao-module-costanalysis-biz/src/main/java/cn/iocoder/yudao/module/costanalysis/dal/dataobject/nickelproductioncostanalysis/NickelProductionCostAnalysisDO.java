package cn.iocoder.yudao.module.costanalysis.dal.dataobject.nickelproductioncostanalysis;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 镍金属输送量成本分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_nickel_production_cost_analysis")
@KeySequence("costanalysis_nickel_production_cost_analysis_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NickelProductionCostAnalysisDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 数据日期
     */
    private LocalDateTime date;
    /**
     * 实际镍产量
     */
    private BigDecimal actualNickelTons;
    /**
     * 计划镍产量
     */
    private BigDecimal plannedNickelTons;
    /**
     * 实际成本
     */
    private BigDecimal actualCostUsd;
    /**
     * 计划成本
     */
    private BigDecimal plannedCostPerTonUsd;

}