package cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.kbkmaintenancecost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbkmaintenancecost.KbkMaintenanceCostDO;
import cn.iocoder.yudao.module.costanalysis.service.kbkmaintenancecost.KbkMaintenanceCostService;

@Tag(name = "管理后台 - 月度维检费成本分析")
@RestController
@RequestMapping("/costanalysis/kbk-maintenance-cost")
@Validated
public class KbkMaintenanceCostController {

    @Resource
    private KbkMaintenanceCostService kbkMaintenanceCostService;

    @PostMapping("/create")
    @Operation(summary = "创建月度维检费成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:create')")
    public CommonResult<Long> createKbkMaintenanceCost(@Valid @RequestBody KbkMaintenanceCostSaveReqVO createReqVO) {
        return success(kbkMaintenanceCostService.createKbkMaintenanceCost(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新月度维检费成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:update')")
    public CommonResult<Boolean> updateKbkMaintenanceCost(@Valid @RequestBody KbkMaintenanceCostSaveReqVO updateReqVO) {
        kbkMaintenanceCostService.updateKbkMaintenanceCost(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除月度维检费成本分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:delete')")
    public CommonResult<Boolean> deleteKbkMaintenanceCost(@RequestParam("id") Long id) {
        kbkMaintenanceCostService.deleteKbkMaintenanceCost(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得月度维检费成本分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:query')")
    public CommonResult<KbkMaintenanceCostRespVO> getKbkMaintenanceCost(@RequestParam("id") Long id) {
        KbkMaintenanceCostDO kbkMaintenanceCost = kbkMaintenanceCostService.getKbkMaintenanceCost(id);
        return success(BeanUtils.toBean(kbkMaintenanceCost, KbkMaintenanceCostRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得月度维检费成本分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:query')")
    public CommonResult<PageResult<KbkMaintenanceCostRespVO>> getKbkMaintenanceCostPage(@Valid KbkMaintenanceCostPageReqVO pageReqVO) {
        PageResult<KbkMaintenanceCostDO> pageResult = kbkMaintenanceCostService.getKbkMaintenanceCostPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, KbkMaintenanceCostRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出月度维检费成本分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk-maintenance-cost:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportKbkMaintenanceCostExcel(@Valid KbkMaintenanceCostPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<KbkMaintenanceCostDO> list = kbkMaintenanceCostService.getKbkMaintenanceCostPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "月度维检费成本分析.xls", "数据", KbkMaintenanceCostRespVO.class,
                        BeanUtils.toBean(list, KbkMaintenanceCostRespVO.class));
    }

}