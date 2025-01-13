package cn.iocoder.yudao.module.costanalysis.service.excelfile;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.excelfile.ExcelFileDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.excelfile.ExcelFileMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 文件数据库 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class ExcelFileServiceImpl implements ExcelFileService {

    @Resource
    private ExcelFileMapper excelFileMapper;

    @Override
    public Long createExcelFile(ExcelFileSaveReqVO createReqVO) {
        // 插入
        ExcelFileDO excelFile = BeanUtils.toBean(createReqVO, ExcelFileDO.class);
        excelFileMapper.insert(excelFile);
        // 返回
        return excelFile.getId();
    }

    @Override
    public void updateExcelFile(ExcelFileSaveReqVO updateReqVO) {
        // 校验存在
        validateExcelFileExists(updateReqVO.getId());
        // 更新
        ExcelFileDO updateObj = BeanUtils.toBean(updateReqVO, ExcelFileDO.class);
        excelFileMapper.updateById(updateObj);
    }

    @Override
    public void deleteExcelFile(Long id) {
        // 校验存在
        validateExcelFileExists(id);
        // 删除
        excelFileMapper.deleteById(id);
    }

    private void validateExcelFileExists(Long id) {
        if (excelFileMapper.selectById(id) == null) {
            throw exception(EXCEL_FILE_NOT_EXISTS);
        }
    }

    @Override
    public ExcelFileDO getExcelFile(Long id) {
        return excelFileMapper.selectById(id);
    }

    @Override
    public PageResult<ExcelFileDO> getExcelFilePage(ExcelFilePageReqVO pageReqVO) {
        return excelFileMapper.selectPage(pageReqVO);
    }

}