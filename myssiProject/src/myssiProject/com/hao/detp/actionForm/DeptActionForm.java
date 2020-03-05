package myssiProject.com.hao.detp.actionForm;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import myssiProject.com.hao.detp.vo.DeptInfo;

@SuppressWarnings("serial")
public class DeptActionForm extends ActionForm {

	private DeptInfo deptInfo = new DeptInfo();
	

	public DeptInfo getDeptInfo() {
		return deptInfo;
	}

	public void setDeptInfo(DeptInfo deptInfo) {
		this.deptInfo = deptInfo;
	}


	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		System.out.println("==========请求经过了验证方法============");
		
		return null;
	}
	
}
