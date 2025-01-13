package cn.iocoder.yudao.module.costanalysis.service.excelfile;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.excelfile.ExcelFileDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 文件数据库 Service 接口
 *
 * @author PlxloYzb
 */
public interface ExcelFileService {

    /**
     * 创建文件数据库
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createExcelFile(@Valid ExcelFileSaveReqVO createReqVO);

    /**
     * 更新文件数据库
     *
     * @param updateReqVO 更新信息
     */
    void updateExcelFile(@Valid ExcelFileSaveReqVO updateReqVO);

    /**
     * 删除文件数据库
     *
     * @param id 编号
     */
    void deleteExcelFile(Long id);

    /**
     * 获得文件数据库
     *
     * @param id 编号
     * @return 文件数据库
     */
    ExcelFileDO getExcelFile(Long id);

    /**
     * 获得文件数据库分页
     *
     * @param pageReqVO 分页查询
     * @return 文件数据库分页
     */
    PageResult<ExcelFileDO> getExcelFilePage(ExcelFilePageReqVO pageReqVO);

}