import org.apache.camel.CamelContext;
import org.apache.camel.component.log.LogComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;

import com.test.TcpRouter;


public class App {

	public static void main(String[] args) throws Exception {
		 SimpleRegistry registry = new SimpleRegistry();
	        CamelContext context = new DefaultCamelContext(registry);
	        context.addComponent("mylogger", new LogComponent());
	        context.addRoutes(new TcpRouter());
	        context.start();
	}

}
