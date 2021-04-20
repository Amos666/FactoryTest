

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test1.StrategyAliasConfig;
import com.test1.StrategyFactory;


@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Autowired
    private ApplicationContext context;
    
    @Before
    public void setUp() throws Exception
    {
        //��ʼ��Spring�����������Ķ���
    	context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        //��ȡBean����
    }


    @Test
    public void test() {
    	System.out.println(context.getBean(StrategyAliasConfig.class).getAliasMap());
        context.getBean(StrategyFactory.class).getBy("strategyA").TES_VS_DWG();
        context.getBean(StrategyFactory.class).getBy("strategyB").TES_VS_DWG();
    }

}

