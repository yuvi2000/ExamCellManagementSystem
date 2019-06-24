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
import com.iet.ExamCell.Model.Seating;
public interface HomeDAO {
	void setTemplate(JdbcTemplate template);
	Login validateUser(Login login);
	void register(NominalRole user);
	void register1(Papers subject);
	void seatingPlan(Seating seating);
	NominalRole showStudents(NominalRole student);
	Papers showSubjects(Papers subject);
	Seating showSeating(Seating seating);

	int update(NominalRole p);
	int update1(Papers p);
	int updateSeating(Seating p);
	int delete(int id);
	int delete1(int id);
	NominalRole getNominalRoleById(int regno);
	Papers getPapersById(int semester);
	List<NominalRole> getAllNominalRoles();
	List<Papers> getAllPapers();
	// to load Department combobox values
	List<ComboDO> getAllDept();	
	List<ComboDO> getAllDegree();
	List<ComboDO> getDegree();
	List<ComboDO> getYear();
	List<ComboDO> getAllYear();
	List<ComboDO> getAllSection();
	List<ComboDO> getSection();
    List<ComboDO> getAllSemester();
	List<ComboDO> getAllPaper();
	List<ComboDO> getAllDept1();	
	List<ComboDO> getAllDegree1();
	List<ComboDO> getAllYear1();
	List<ComboDO> getAllRegno();
	List<ComboDO> getAllHall();
	Seating getSeatingById(int id);
	List<Seating> getAllSeating();
	
	
	
	
	
	
}
