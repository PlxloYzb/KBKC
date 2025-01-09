package cn.iocoder.yudao.module.division.service.template;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.division.controller.admin.template.vo.*;
import cn.iocoder.yudao.module.division.dal.dataobject.template.TemplateDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * Excel自动化 Service 接口
 *
 * @author PlxloYzb
 */
public interface TemplateService {

    /**
     * 创建Excel自动化
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createTemplate(@Valid TemplateSaveReqVO createReqVO);

    /**
     * 更新Excel自动化
     *
     * @param updateReqVO 更新信息
     */
    void updateTemplate(@Valid TemplateSaveReqVO updateReqVO);

    /**
     * 删除Excel自动化
     *
     * @param id 编号
     */
    void deleteTemplate(Long id);

    /**
     * 获得Excel自动化
     *
     * @param id 编号
     * @return Excel自动化
     */
    TemplateDO getTemplate(Long id);

    /**
     * 获得Excel自动化分页
     *
     * @param pageReqVO 分页查询
     * @return Excel自动化分页
     */
    PageResult<TemplateDO> getTemplatePage(TemplatePageReqVO pageReqVO);

}