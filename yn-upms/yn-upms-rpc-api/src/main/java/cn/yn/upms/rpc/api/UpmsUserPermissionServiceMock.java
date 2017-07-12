package cn.yn.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import cn.yn.common.base.BaseServiceMock;
import cn.yn.upms.dao.mapper.UpmsUserPermissionMapper;
import cn.yn.upms.dao.model.UpmsUserPermission;
import cn.yn.upms.dao.model.UpmsUserPermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserPermissionService接口
* Created by wangjianlong on 2017/3/20.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);

    @Override
    public int permission(JSONArray datas, int id) {
        _log.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }

}
