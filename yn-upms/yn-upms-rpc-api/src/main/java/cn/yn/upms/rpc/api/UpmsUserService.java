package cn.yn.upms.rpc.api;

import cn.yn.common.base.BaseService;
import cn.yn.upms.dao.model.UpmsUser;
import cn.yn.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by wangjianlong on 2017/3/20.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}