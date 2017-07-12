package cn.yn.upms.rpc.api;

import cn.yn.common.base.BaseServiceMock;
import cn.yn.upms.dao.mapper.UpmsLogMapper;
import cn.yn.upms.dao.model.UpmsLog;
import cn.yn.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by wangjianlong on 2017/3/20.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
