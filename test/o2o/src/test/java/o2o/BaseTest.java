package o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用來配置sprig和junit整合，
 * junit启动时加载springIOC容器
 * @author wangmeng
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件路径
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
