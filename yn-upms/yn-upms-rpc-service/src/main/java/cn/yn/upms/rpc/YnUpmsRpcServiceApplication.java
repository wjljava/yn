package cn.yn.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by WangJianlong on 2017/2/3.
 */
public class YnUpmsRpcServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(YnUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> yn-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		_log.info(">>>>> yn-upms-rpc-service 启动完成 <<<<<");
	}

}
