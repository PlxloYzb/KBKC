package cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 镍金属输送量成本分析 Response VO")
@Data
@ExcelIgnoreUnannotated
public class NickelProductionCostAnalysisRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3672")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "数据日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("数据日期")
    private LocalDateTime date;

    @Schema(description = "实际镍产量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际镍产量")
    private BigDecimal actualNickelTons;

    @Schema(description = "计划镍产量", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划镍产量")
    private BigDecimal plannedNickelTons;

    @Schema(description = "实际成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("实际成本")
    private BigDecimal actualCostUsd;

    @Schema(description = "计划成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("计划成本")
    private BigDecimal plannedCostPerTonUsd;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}