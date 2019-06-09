package lsm.com;

import com.lsm.controller.impl.AccountController;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testAnno(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
       AccountController accountController = (AccountController) ac.getBean("accountController");
        accountController.saveAccount();
    }
}
