package cn.yn.upms.rpc.api;

import cn.yn.common.base.BaseServiceMock;
import cn.yn.upms.dao.mapper.UpmsSystemMapper;
import cn.yn.upms.dao.model.UpmsSystem;
import cn.yn.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by wangjianlong on 2017/3/20.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
