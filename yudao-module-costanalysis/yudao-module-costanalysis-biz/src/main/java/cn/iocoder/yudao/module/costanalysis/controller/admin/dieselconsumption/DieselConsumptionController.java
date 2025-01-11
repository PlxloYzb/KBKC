package cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.dieselconsumption.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.dieselconsumption.DieselConsumptionDO;
import cn.iocoder.yudao.module.costanalysis.service.dieselconsumption.DieselConsumptionService;

@Tag(name = "管理后台 - 柴油成本分析")
@RestController
@RequestMapping("/costanalysis/diesel-consumption")
@Validated
public class DieselConsumptionController {

    @Resource
    private DieselConsumptionService dieselConsumptionService;

    @PostMapping("/create")
    @Operation(summary = "创建柴油成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:create')")
    public CommonResult<Long> createDieselConsumption(@Valid @RequestBody DieselConsumptionSaveReqVO createReqVO) {
        return success(dieselConsumptionService.createDieselConsumption(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新柴油成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:update')")
    public CommonResult<Boolean> updateDieselConsumption(@Valid @RequestBody DieselConsumptionSaveReqVO updateReqVO) {
        dieselConsumptionService.updateDieselConsumption(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除柴油成本分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:delete')")
    public CommonResult<Boolean> deleteDieselConsumption(@RequestParam("id") Long id) {
        dieselConsumptionService.deleteDieselConsumption(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得柴油成本分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:query')")
    public CommonResult<DieselConsumptionRespVO> getDieselConsumption(@RequestParam("id") Long id) {
        DieselConsumptionDO dieselConsumption = dieselConsumptionService.getDieselConsumption(id);
        return success(BeanUtils.toBean(dieselConsumption, DieselConsumptionRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得柴油成本分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:query')")
    public CommonResult<PageResult<DieselConsumptionRespVO>> getDieselConsumptionPage(@Valid DieselConsumptionPageReqVO pageReqVO) {
        PageResult<DieselConsumptionDO> pageResult = dieselConsumptionService.getDieselConsumptionPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, DieselConsumptionRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出柴油成本分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:diesel-consumption:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportDieselConsumptionExcel(@Valid DieselConsumptionPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<DieselConsumptionDO> list = dieselConsumptionService.getDieselConsumptionPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "柴油成本分析.xls", "数据", DieselConsumptionRespVO.class,
                        BeanUtils.toBean(list, DieselConsumptionRespVO.class));
    }

}