
package cn.iocoder.yudao.module.costanalysis.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {

    ErrorCode NICKEL_PRODUCTION_COST_ANALYSIS_NOT_EXISTS = new ErrorCode(1_001_000_001, "镍金属输送量成本分析不存在");

    ErrorCode PRODUCTION_METRIC_NOT_EXISTS = new ErrorCode(1_001_000_002, "生产指标分析不存在");

    ErrorCode FIVE_INDICATOR_COST_NOT_EXISTS = new ErrorCode(1_001_000_003, "五项费用成本分析不存在");

    ErrorCode BULK_COMMODITY_NOT_EXISTS = new ErrorCode(1_001_000_004, "大宗物资细节对比分析不存在");

    ErrorCode DIESEL_CONSUMPTION_NOT_EXISTS = new ErrorCode(1_001_000_005, "柴油成本分析不存在");

    ErrorCode KBK_MAINTENANCE_COST_NOT_EXISTS = new ErrorCode(1_001_000_006, "月度维检费成本分析不存在");

    ErrorCode KBK34_COST_NOT_EXISTS = new ErrorCode(1_001_000_007, "矿山34项费用分析不存在");

    ErrorCode WATER_SOURCE_PRODUCTION_DETAILS_NOT_EXISTS = new ErrorCode(1_001_000_008, "水源地生产分析不存在");

    ErrorCode NPOWER_PLANT_NOT_EXISTS = new ErrorCode(1_001_000_009, "电厂发电成本分析不存在");

    ErrorCode EXCEL_FILE_NOT_EXISTS = new ErrorCode(1_002_000_001, "文件数据库不存在");
}
