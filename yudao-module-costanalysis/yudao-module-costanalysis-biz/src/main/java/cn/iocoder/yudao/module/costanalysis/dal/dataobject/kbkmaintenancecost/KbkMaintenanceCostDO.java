package cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbkmaintenancecost;

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
 * 月度维检费成本分析 DO
 *
 * @author PlxloYzb
 */
@TableName("costanalysis_kbk_maintenance_cost")
@KeySequence("costanalysis_kbk_maintenance_cost_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KbkMaintenanceCostDO extends BaseDO {

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
     * 实际矿山采矿作业区维检费
     */
    private BigDecimal actualMiningMaintenanceCost;
    /**
     * 实际矿山开拓及复垦作业区维检费
     */
    private BigDecimal actualStrippingReclamationMaintenanceCost;
    /**
     * 实际矿山水采作业区维检费
     */
    private BigDecimal actualHydraulicMiningMaintenanceCost;
    /**
     * 实际矿山供水洗矿作业区维检费
     */
    private BigDecimal actualWashingMaintenanceCost;
    /**
     * 实际矿山选铬作业区维检费
     */
    private BigDecimal actualChromeSelectionMaintenanceCost;
    /**
     * 实际矿山固定设备维修作业区维检费
     */
    private BigDecimal actualFixedEquipmentMaintenanceCost;
    /**
     * 实际矿山电仪作业区维检费
     */
    private BigDecimal actualElectricalMaintenanceCost;
    /**
     * 实际矿山移动设备维修作业区维检费
     */
    private BigDecimal actualMobileEquipmentMaintenanceCost;
    /**
     * 实际矿山仓储作业区维检费
     */
    private BigDecimal actualStorageMaintenanceCost;
    /**
     * 实际矿山化验室维检费
     */
    private BigDecimal actualLabMaintenanceCost;
    /**
     * 实际矿山HSE监察室维检费
     */
    private BigDecimal actualHseMaintenanceCost;
    /**
     * 实际矿山技术计划室维检费
     */
    private BigDecimal actualTechnicalPlanningMaintenanceCost;
    /**
     * 实际矿山调度室维检费
     */
    private BigDecimal actualDispatchMaintenanceCost;
    /**
     * 实际矿山后勤、办公室维检费
     */
    private BigDecimal actualLogisticsOfficeMaintenanceCost;
    /**
     * 实际矿山地方关系室维检费
     */
    private BigDecimal actualPublicRelationsMaintenanceCost;
    /**
     * 实际矿山设备室维检费
     */
    private BigDecimal actualEquipmentOfficeMaintenanceCost;
    /**
     * 计划矿山采矿作业区维检费
     */
    private BigDecimal plannedMiningMaintenanceCost;
    /**
     * 计划矿山开拓及复垦作业区维检费
     */
    private BigDecimal plannedStrippingReclamationMaintenanceCost;
    /**
     * 计划矿山水采作业区维检费
     */
    private BigDecimal plannedHydraulicMiningMaintenanceCost;
    /**
     * 计划矿山供水洗矿作业区维检费
     */
    private BigDecimal plannedWashingMaintenanceCost;
    /**
     * 计划矿山选铬作业区维检费
     */
    private BigDecimal plannedChromeSelectionMaintenanceCost;
    /**
     * 计划矿山固定设备维修作业区维检费
     */
    private BigDecimal plannedFixedEquipmentMaintenanceCost;
    /**
     * 计划矿山电仪作业区维检费
     */
    private BigDecimal plannedElectricalMaintenanceCost;
    /**
     * 计划矿山移动设备维修作业区维检费
     */
    private BigDecimal plannedMobileEquipmentMaintenanceCost;
    /**
     * 计划矿山仓储作业区维检费
     */
    private BigDecimal plannedStorageMaintenanceCost;
    /**
     * 计划矿山化验室维检费
     */
    private BigDecimal plannedLabMaintenanceCost;
    /**
     * 计划矿山HSE监察室维检费
     */
    private BigDecimal plannedHseMaintenanceCost;
    /**
     * 计划矿山技术计划室维检费
     */
    private BigDecimal plannedTechnicalPlanningMaintenanceCost;
    /**
     * 计划矿山调度室维检费
     */
    private BigDecimal plannedDispatchMaintenanceCost;
    /**
     * 计划矿山后勤、办公室维检费
     */
    private BigDecimal plannedLogisticsOfficeMaintenanceCost;
    /**
     * 计划矿山地方关系室维检费
     */
    private BigDecimal plannedPublicRelationsMaintenanceCost;
    /**
     * 计划矿山设备室维检费
     */
    private BigDecimal plannedEquipmentOfficeMaintenanceCost;

}