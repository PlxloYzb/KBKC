package cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.nickelproductioncostanalysis.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.nickelproductioncostanalysis.NickelProductionCostAnalysisDO;
import cn.iocoder.yudao.module.costanalysis.service.nickelproductioncostanalysis.NickelProductionCostAnalysisService;

@Tag(name = "管理后台 - 镍金属输送量成本分析")
@RestController
@RequestMapping("/costanalysis/nickel-production-cost-analysis")
@Validated
public class NickelProductionCostAnalysisController {

    @Resource
    private NickelProductionCostAnalysisService nickelProductionCostAnalysisService;

    @PostMapping("/create")
    @Operation(summary = "创建镍金属输送量成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:create')")
    public CommonResult<Long> createNickelProductionCostAnalysis(@Valid @RequestBody NickelProductionCostAnalysisSaveReqVO createReqVO) {
        return success(nickelProductionCostAnalysisService.createNickelProductionCostAnalysis(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新镍金属输送量成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:update')")
    public CommonResult<Boolean> updateNickelProductionCostAnalysis(@Valid @RequestBody NickelProductionCostAnalysisSaveReqVO updateReqVO) {
        nickelProductionCostAnalysisService.updateNickelProductionCostAnalysis(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除镍金属输送量成本分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:delete')")
    public CommonResult<Boolean> deleteNickelProductionCostAnalysis(@RequestParam("id") Long id) {
        nickelProductionCostAnalysisService.deleteNickelProductionCostAnalysis(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得镍金属输送量成本分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:query')")
    public CommonResult<NickelProductionCostAnalysisRespVO> getNickelProductionCostAnalysis(@RequestParam("id") Long id) {
        NickelProductionCostAnalysisDO nickelProductionCostAnalysis = nickelProductionCostAnalysisService.getNickelProductionCostAnalysis(id);
        return success(BeanUtils.toBean(nickelProductionCostAnalysis, NickelProductionCostAnalysisRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得镍金属输送量成本分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:query')")
    public CommonResult<PageResult<NickelProductionCostAnalysisRespVO>> getNickelProductionCostAnalysisPage(@Valid NickelProductionCostAnalysisPageReqVO pageReqVO) {
        PageResult<NickelProductionCostAnalysisDO> pageResult = nickelProductionCostAnalysisService.getNickelProductionCostAnalysisPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, NickelProductionCostAnalysisRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出镍金属输送量成本分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:nickel-production-cost-analysis:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportNickelProductionCostAnalysisExcel(@Valid NickelProductionCostAnalysisPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<NickelProductionCostAnalysisDO> list = nickelProductionCostAnalysisService.getNickelProductionCostAnalysisPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "镍金属输送量成本分析.xls", "数据", NickelProductionCostAnalysisRespVO.class,
                        BeanUtils.toBean(list, NickelProductionCostAnalysisRespVO.class));
    }

}