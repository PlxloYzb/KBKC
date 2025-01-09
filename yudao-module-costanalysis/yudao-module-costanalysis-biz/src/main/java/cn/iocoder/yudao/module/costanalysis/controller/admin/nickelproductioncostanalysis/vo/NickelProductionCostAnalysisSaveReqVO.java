package cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 镍金属输送量成本分析新增/修改 Request VO")
@Data
public class NickelProductionCostAnalysisSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "3672")
    private Long id;

    @Schema(description = "数据日期", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "数据日期不能为空")
    private LocalDateTime date;

    @Schema(description = "实际镍产量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际镍产量不能为空")
    private BigDecimal actualNickelTons;

    @Schema(description = "计划镍产量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划镍产量不能为空")
    private BigDecimal plannedNickelTons;

    @Schema(description = "实际成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "实际成本不能为空")
    private BigDecimal actualCostUsd;

    @Schema(description = "计划成本", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "计划成本不能为空")
    private BigDecimal plannedCostPerTonUsd;

}