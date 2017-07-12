package cn.yn.upms.rpc.service.impl;

import cn.yn.common.annotation.BaseService;
import cn.yn.common.base.BaseServiceImpl;
import cn.yn.upms.dao.mapper.UpmsRoleMapper;
import cn.yn.upms.dao.model.UpmsRole;
import cn.yn.upms.dao.model.UpmsRoleExample;
import cn.yn.upms.rpc.api.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRoleService实现
* Created by wangjianlong on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}