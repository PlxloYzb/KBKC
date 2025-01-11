package cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.kbk34cost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.kbk34cost.Kbk34CostDO;
import cn.iocoder.yudao.module.costanalysis.service.kbk34cost.Kbk34CostService;

@Tag(name = "管理后台 - 矿山34项费用分析")
@RestController
@RequestMapping("/costanalysis/kbk34-cost")
@Validated
public class Kbk34CostController {

    @Resource
    private Kbk34CostService kbk34CostService;

    @PostMapping("/create")
    @Operation(summary = "创建矿山34项费用分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:create')")
    public CommonResult<Long> createKbk34Cost(@Valid @RequestBody Kbk34CostSaveReqVO createReqVO) {
        return success(kbk34CostService.createKbk34Cost(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新矿山34项费用分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:update')")
    public CommonResult<Boolean> updateKbk34Cost(@Valid @RequestBody Kbk34CostSaveReqVO updateReqVO) {
        kbk34CostService.updateKbk34Cost(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除矿山34项费用分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:delete')")
    public CommonResult<Boolean> deleteKbk34Cost(@RequestParam("id") Long id) {
        kbk34CostService.deleteKbk34Cost(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得矿山34项费用分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:query')")
    public CommonResult<Kbk34CostRespVO> getKbk34Cost(@RequestParam("id") Long id) {
        Kbk34CostDO kbk34Cost = kbk34CostService.getKbk34Cost(id);
        return success(BeanUtils.toBean(kbk34Cost, Kbk34CostRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得矿山34项费用分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:query')")
    public CommonResult<PageResult<Kbk34CostRespVO>> getKbk34CostPage(@Valid Kbk34CostPageReqVO pageReqVO) {
        PageResult<Kbk34CostDO> pageResult = kbk34CostService.getKbk34CostPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, Kbk34CostRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出矿山34项费用分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:kbk34-cost:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportKbk34CostExcel(@Valid Kbk34CostPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<Kbk34CostDO> list = kbk34CostService.getKbk34CostPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "矿山34项费用分析.xls", "数据", Kbk34CostRespVO.class,
                        BeanUtils.toBean(list, Kbk34CostRespVO.class));
    }

}