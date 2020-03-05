package myssiProject.com.hao.detp.service;

import java.util.List;

import myssiProject.com.hao.detp.vo.DeptInfo;

public interface DeptManager {

	public void insertDeptInfo(DeptInfo deptInFo);
	
	List<DeptInfo> queryAll();
	
	int updateByDeptNo(DeptInfo deptInFo);
	
	int deleteByDeptNo(Integer deptNo);
	
}
