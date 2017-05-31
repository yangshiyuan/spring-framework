package ysy;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import ysy.bean.MyBean;

/**
 * Created by shiyu on 2017/5/15.
 */
public class XmlBeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("ysy/XmlBeanFactory.xml"));
        MyBean bean = (MyBean) beanFactory.getBean("myBean");
        System.out.println(bean.getStr());
    }


}
