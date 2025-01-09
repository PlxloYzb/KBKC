
package cn.iocoder.yudao.module.costanalysis.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {

    ErrorCode NICKEL_PRODUCTION_COST_ANALYSIS_NOT_EXISTS = new ErrorCode(1_001_000_001, "镍金属输送量成本分析不存在");

    ErrorCode PRODUCTION_METRIC_NOT_EXISTS = new ErrorCode(1_001_000_002, "生产指标分析不存在");
}
