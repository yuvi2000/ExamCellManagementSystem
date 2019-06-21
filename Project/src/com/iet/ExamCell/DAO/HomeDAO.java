/**
 * 
 */
package com.iet.ExamCell.DAO;

/**
 * @author admin
 *
 */
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.iet.ExamCell.Model.ComboDO;
import com.iet.ExamCell.Model.Login;
import com.iet.ExamCell.Model.NominalRole;
import com.iet.ExamCell.Model.Papers;
public interface HomeDAO {
	void setTemplate(JdbcTemplate template);
	Login validateUser(Login login);
	void register(NominalRole user);
	void register1(Papers subject);
	NominalRole showStudents(NominalRole student);
	Papers showSubjects(Papers subject);
	int update(NominalRole p);
	int updatePaper(Papers p);
	int delete(int id);
	int delete1(int id);
	NominalRole getNominalRoleById(int regno);
	
	List<NominalRole> getAllNominalRoles();
	List<Papers> getPapersById();
	List<Papers> getAllPapers();
	// to load Department combobox values
	List<ComboDO> getAllDept();	
	List<ComboDO> getAllDegree();
	List<ComboDO> getAllYear();
	List<ComboDO> getAllSection();
	List<ComboDO> getAllSemester();
	List<ComboDO> getAllPaper();
	List<ComboDO> getAllDept1();	
	List<ComboDO> getAllDegree1();
	List<ComboDO> getAllYear1();
	
	
	
	
	
	
}
