package cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 文件数据库 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ExcelFileRespVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "2247")
    @ExcelProperty("主键ID")
    private Long id;

    @Schema(description = "文件名", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("文件名")
    private String fileName;

    @Schema(description = "文件数据", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("文件数据")
    private byte[] fileData;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}