package cn.yn.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压ynAdmin-x.x.x.jar到resources目录
 * Created by wangjianlong on 2016/12/18.
 */
public class YnAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(YnAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("===== 开始解压yn-admin =====");
        String version = PropertiesFileUtil.getInstance("yn-admin-client").get("yn.admin.version");
        _log.info("yn-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/yn-admin-" + version + ".jar");
        _log.info("yn-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/yn-admin";
        _log.info("yn-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== 解压yn-admin完成 =====");
    }

}
