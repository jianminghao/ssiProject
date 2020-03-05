
package myssiProject.com.hao.detp.action;

import org.apache.struts.actions.DispatchAction;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseDispatchAction extends DispatchAction {
    
	public Object getBean(String name) {
        ApplicationContext ctx = 
            WebApplicationContextUtils.getRequiredWebApplicationContext(servlet.getServletContext());
        return ctx.getBean(name);
    }
	
}