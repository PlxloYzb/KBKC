package cn.iocoder.yudao.module.division.controller.admin.template.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - Excel自动化新增/修改 Request VO")
@Data
public class TemplateSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "16171")
    private Long id;

    @Schema(description = "模板名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "模板名称不能为空")
    private String name;

    @Schema(description = "模板描述")
    private String description;

    @Schema(description = "映射规则配置(JSON格式)")
    private String rulesConfig;

}