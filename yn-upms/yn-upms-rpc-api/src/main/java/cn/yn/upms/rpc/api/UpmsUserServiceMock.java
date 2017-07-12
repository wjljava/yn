package cn.yn.upms.rpc.api;

import cn.yn.common.base.BaseServiceMock;
import cn.yn.upms.dao.mapper.UpmsUserMapper;
import cn.yn.upms.dao.model.UpmsUser;
import cn.yn.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by wangjianlong on 2017/3/20.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
