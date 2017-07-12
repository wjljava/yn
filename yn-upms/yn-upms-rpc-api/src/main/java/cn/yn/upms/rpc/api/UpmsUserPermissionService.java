package cn.yn.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import cn.yn.common.base.BaseService;
import cn.yn.upms.dao.model.UpmsUserPermission;
import cn.yn.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created by wangjianlong on 2017/3/20.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {

    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);

}