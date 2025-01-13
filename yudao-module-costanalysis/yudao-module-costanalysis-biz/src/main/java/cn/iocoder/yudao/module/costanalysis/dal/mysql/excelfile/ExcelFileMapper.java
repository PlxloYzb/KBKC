package cn.iocoder.yudao.module.costanalysis.dal.mysql.excelfile;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.excelfile.ExcelFileDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.costanalysis.controller.admin.excelfile.vo.*;

/**
 * 文件数据库 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface ExcelFileMapper extends BaseMapperX<ExcelFileDO> {

    default PageResult<ExcelFileDO> selectPage(ExcelFilePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ExcelFileDO>()
                .likeIfPresent(ExcelFileDO::getFileName, reqVO.getFileName())
                .eqIfPresent(ExcelFileDO::getFileData, reqVO.getFileData())
                .betweenIfPresent(ExcelFileDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(ExcelFileDO::getId));
    }

}