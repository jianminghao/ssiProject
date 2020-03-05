package myssiProject.com.hao.detp.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import myssiProject.com.hao.detp.dao.DeptDao;
import myssiProject.com.hao.detp.vo.DeptInfo;

public class DeptDaoImpl extends SqlMapClientDaoSupport implements DeptDao {

	@Override
	public void insertDeptInfo(DeptInfo deptInfo) {
		getSqlMapClientTemplate().insert("deptSQL.insertDeptInfo", deptInfo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DeptInfo> queryAll() {
		List<DeptInfo> deptInfoList = getSqlMapClientTemplate().queryForList("deptSQL.queryAll");
		return deptInfoList;
	}

	@Override
	public int updateByDeptNo(DeptInfo deptInfo) {
		int i = getSqlMapClientTemplate().update("deptSQL.updateByDeptNo", deptInfo);
		return i;
	}

	@Override
	public int deleteByByDeptNo(Integer deptNo) {
		int i = getSqlMapClientTemplate().delete("deptSQL.deleteByDeptNo", deptNo);
		return i;
	}

}
