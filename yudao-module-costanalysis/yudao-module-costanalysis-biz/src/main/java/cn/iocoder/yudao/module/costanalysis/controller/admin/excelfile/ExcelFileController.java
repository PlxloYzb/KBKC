package cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.constraints.*;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.excelfile.ExcelFileDO;
import cn.iocoder.yudao.module.costanalysis.service.excelfile.ExcelFileService;

@Tag(name = "管理后台 - 文件数据库")
@RestController
@RequestMapping("/costanalysis/excel-file")
@Validated
public class ExcelFileController {

    @Resource
    private ExcelFileService excelFileService;

    @PostMapping("/create")
    @Operation(summary = "创建文件数据库")
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:create')")
    public CommonResult<Long> createExcelFile(@Valid @RequestBody ExcelFileSaveReqVO createReqVO) {
        return success(excelFileService.createExcelFile(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新文件数据库")
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:update')")
    public CommonResult<Boolean> updateExcelFile(@Valid @RequestBody ExcelFileSaveReqVO updateReqVO) {
        excelFileService.updateExcelFile(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除文件数据库")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:delete')")
    public CommonResult<Boolean> deleteExcelFile(@RequestParam("id") Long id) {
        excelFileService.deleteExcelFile(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得文件数据库")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:query')")
    public CommonResult<ExcelFileRespVO> getExcelFile(@RequestParam("id") Long id) {
        ExcelFileDO excelFile = excelFileService.getExcelFile(id);
        return success(BeanUtils.toBean(excelFile, ExcelFileRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得文件数据库分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:query')")
    public CommonResult<PageResult<ExcelFileRespVO>> getExcelFilePage(@Valid ExcelFilePageReqVO pageReqVO) {
        PageResult<ExcelFileDO> pageResult = excelFileService.getExcelFilePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ExcelFileRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出文件数据库 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:excel-file:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportExcelFileExcel(@Valid ExcelFilePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ExcelFileDO> list = excelFileService.getExcelFilePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "文件数据库.xls", "数据", ExcelFileRespVO.class,
                        BeanUtils.toBean(list, ExcelFileRespVO.class));
    }

}