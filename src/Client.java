import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustomerService;

public class Client {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		CustomerService as = appContext.getBean("AudiService", com.service.AudiService.class);
		System.out.println(as.findAllCars());
		
		CustomerService ss = appContext.getBean("SkodaService", com.service.SkodaService.class);
		System.out.println(ss.findAllCars());
		
		CustomerService ls = appContext.getBean("LamborghiniService", com.service.LamborghiniService.class);
		System.out.println(ls.findAllCars());
		
		//CustomerService hs = appContext.getBean("HondaService", com.service.HondaService.class);
		//System.out.println(hs.findAllCars());
	}

}
