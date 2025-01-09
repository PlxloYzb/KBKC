package cn.iocoder.yudao.module.division.dal.mysql.template;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.module.division.dal.dataobject.template.TemplateDO;
import org.apache.ibatis.annotations.Mapper;
import cn.iocoder.yudao.module.division.controller.admin.template.vo.*;

/**
 * Excel自动化 Mapper
 *
 * @author PlxloYzb
 */
@Mapper
public interface TemplateMapper extends BaseMapperX<TemplateDO> {

    default PageResult<TemplateDO> selectPage(TemplatePageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<TemplateDO>()
                .likeIfPresent(TemplateDO::getName, reqVO.getName())
                .eqIfPresent(TemplateDO::getDescription, reqVO.getDescription())
                .eqIfPresent(TemplateDO::getRulesConfig, reqVO.getRulesConfig())
                .betweenIfPresent(TemplateDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(TemplateDO::getId));
    }

}