package cn.yn.upms.rpc.service.impl;

import cn.yn.common.annotation.BaseService;
import cn.yn.common.base.BaseServiceImpl;
import cn.yn.upms.dao.mapper.UpmsLogMapper;
import cn.yn.upms.dao.model.UpmsLog;
import cn.yn.upms.dao.model.UpmsLogExample;
import cn.yn.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by wangjianlong on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}