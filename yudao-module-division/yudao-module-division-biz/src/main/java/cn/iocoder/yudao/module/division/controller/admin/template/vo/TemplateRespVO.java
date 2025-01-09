package cn.iocoder.yudao.module.division.controller.admin.template.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - Excel自动化 Response VO")
@Data
@ExcelIgnoreUnannotated
public class TemplateRespVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "16171")
    @ExcelProperty("编号")
    private Long id;

    @Schema(description = "模板名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("模板名称")
    private String name;

    @Schema(description = "模板描述")
    @ExcelProperty("模板描述")
    private String description;

    @Schema(description = "映射规则配置(JSON格式)")
    @ExcelProperty("映射规则配置(JSON格式)")
    private String rulesConfig;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}