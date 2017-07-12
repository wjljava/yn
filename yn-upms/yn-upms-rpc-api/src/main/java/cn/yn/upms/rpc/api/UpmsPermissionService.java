package cn.yn.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import cn.yn.common.base.BaseService;
import cn.yn.upms.dao.model.UpmsPermission;
import cn.yn.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by wangjianlong on 2017/3/20.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {

    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}