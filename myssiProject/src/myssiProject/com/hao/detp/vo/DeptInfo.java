package myssiProject.com.hao.detp.vo;

import java.io.Serializable;

public class DeptInfo implements Serializable {

	
	private Integer deptNo;
	
	private String dName;
	
	private String loc;

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptInfo [deptNo=" + deptNo + ", dName=" + dName + ", loc=" + loc + "]";
	}
	
}
