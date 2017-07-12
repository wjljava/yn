package cn.yn.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import cn.yn.common.base.BaseServiceMock;
import cn.yn.upms.dao.mapper.UpmsRolePermissionMapper;
import cn.yn.upms.dao.model.UpmsRolePermission;
import cn.yn.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* Created by wangjianlong on 2017/3/20.
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        _log.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }

}
