package cn.iocoder.yudao.module.costanalysis.service.bulkcommodity;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.costanalysis.controller.admin.bulkcommodity.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.bulkcommodity.BulkCommodityDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.costanalysis.dal.mysql.bulkcommodity.BulkCommodityMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.costanalysis.enums.ErrorCodeConstants.*;

/**
 * 大宗物资细节对比分析 Service 实现类
 *
 * @author PlxloYzb
 */
@Service
@Validated
public class BulkCommodityServiceImpl implements BulkCommodityService {

    @Resource
    private BulkCommodityMapper bulkCommodityMapper;

    @Override
    public Long createBulkCommodity(BulkCommoditySaveReqVO createReqVO) {
        // 插入
        BulkCommodityDO bulkCommodity = BeanUtils.toBean(createReqVO, BulkCommodityDO.class);
        bulkCommodityMapper.insert(bulkCommodity);
        // 返回
        return bulkCommodity.getId();
    }

    @Override
    public void updateBulkCommodity(BulkCommoditySaveReqVO updateReqVO) {
        // 校验存在
        validateBulkCommodityExists(updateReqVO.getId());
        // 更新
        BulkCommodityDO updateObj = BeanUtils.toBean(updateReqVO, BulkCommodityDO.class);
        bulkCommodityMapper.updateById(updateObj);
    }

    @Override
    public void deleteBulkCommodity(Long id) {
        // 校验存在
        validateBulkCommodityExists(id);
        // 删除
        bulkCommodityMapper.deleteById(id);
    }

    private void validateBulkCommodityExists(Long id) {
        if (bulkCommodityMapper.selectById(id) == null) {
            throw exception(BULK_COMMODITY_NOT_EXISTS);
        }
    }

    @Override
    public BulkCommodityDO getBulkCommodity(Long id) {
        return bulkCommodityMapper.selectById(id);
    }

    @Override
    public PageResult<BulkCommodityDO> getBulkCommodityPage(BulkCommodityPageReqVO pageReqVO) {
        return bulkCommodityMapper.selectPage(pageReqVO);
    }

}