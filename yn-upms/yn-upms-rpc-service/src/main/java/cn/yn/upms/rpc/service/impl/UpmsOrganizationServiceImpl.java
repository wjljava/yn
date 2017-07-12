package cn.yn.upms.rpc.service.impl;

import cn.yn.common.annotation.BaseService;
import cn.yn.common.base.BaseServiceImpl;
import cn.yn.upms.dao.mapper.UpmsOrganizationMapper;
import cn.yn.upms.dao.model.UpmsOrganization;
import cn.yn.upms.dao.model.UpmsOrganizationExample;
import cn.yn.upms.rpc.api.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* Created by wangjianlong on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}