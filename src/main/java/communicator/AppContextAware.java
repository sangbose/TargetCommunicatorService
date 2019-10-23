package main.java.communicator;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppContextAware implements ApplicationContextAware {

	private static ApplicationContext ctx;
	
	public static ApplicationContext getApplicationContext() {
        return ctx;
    }
     
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {

		this.ctx=arg0;
	}

}
