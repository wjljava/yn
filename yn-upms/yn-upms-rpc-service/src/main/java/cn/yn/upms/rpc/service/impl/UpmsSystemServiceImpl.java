package cn.yn.upms.rpc.service.impl;

import cn.yn.common.annotation.BaseService;
import cn.yn.common.base.BaseServiceImpl;
import cn.yn.upms.dao.mapper.UpmsSystemMapper;
import cn.yn.upms.dao.model.UpmsSystem;
import cn.yn.upms.dao.model.UpmsSystemExample;
import cn.yn.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by wangjianlong on 2017/3/20.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}