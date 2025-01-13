package cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - 文件数据库新增/修改 Request VO")
@Data
public class ExcelFileSaveReqVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "2247")
    private Long id;

    @Schema(description = "文件名", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "文件名不能为空")
    private String fileName;

    @Schema(description = "文件数据", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "文件数据不能为空")
    private byte[] fileData;

}