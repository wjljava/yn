package cn.yn.upms.rpc.api;

import cn.yn.common.base.BaseService;
import cn.yn.upms.dao.model.UpmsUserRole;
import cn.yn.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by wangjianlong on 2017/3/20.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {

    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}