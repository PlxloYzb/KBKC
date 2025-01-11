package cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.npowerplant.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.npowerplant.NpowerPlantDO;
import cn.iocoder.yudao.module.costanalysis.service.npowerplant.NpowerPlantService;

@Tag(name = "管理后台 - 电厂发电成本分析")
@RestController
@RequestMapping("/costanalysis/npower-plant")
@Validated
public class NpowerPlantController {

    @Resource
    private NpowerPlantService npowerPlantService;

    @PostMapping("/create")
    @Operation(summary = "创建电厂发电成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:create')")
    public CommonResult<Long> createNpowerPlant(@Valid @RequestBody NpowerPlantSaveReqVO createReqVO) {
        return success(npowerPlantService.createNpowerPlant(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新电厂发电成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:update')")
    public CommonResult<Boolean> updateNpowerPlant(@Valid @RequestBody NpowerPlantSaveReqVO updateReqVO) {
        npowerPlantService.updateNpowerPlant(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除电厂发电成本分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:delete')")
    public CommonResult<Boolean> deleteNpowerPlant(@RequestParam("id") Long id) {
        npowerPlantService.deleteNpowerPlant(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得电厂发电成本分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:query')")
    public CommonResult<NpowerPlantRespVO> getNpowerPlant(@RequestParam("id") Long id) {
        NpowerPlantDO npowerPlant = npowerPlantService.getNpowerPlant(id);
        return success(BeanUtils.toBean(npowerPlant, NpowerPlantRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得电厂发电成本分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:query')")
    public CommonResult<PageResult<NpowerPlantRespVO>> getNpowerPlantPage(@Valid NpowerPlantPageReqVO pageReqVO) {
        PageResult<NpowerPlantDO> pageResult = npowerPlantService.getNpowerPlantPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, NpowerPlantRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出电厂发电成本分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:npower-plant:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportNpowerPlantExcel(@Valid NpowerPlantPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<NpowerPlantDO> list = npowerPlantService.getNpowerPlantPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "电厂发电成本分析.xls", "数据", NpowerPlantRespVO.class,
                        BeanUtils.toBean(list, NpowerPlantRespVO.class));
    }

}