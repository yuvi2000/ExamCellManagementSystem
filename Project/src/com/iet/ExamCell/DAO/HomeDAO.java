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
	void addPaper(Papers subject);
	void seatingplan(Seating seats);
	NominalRole showStudents(NominalRole student);
	Papers showSubjects(Papers subject);
	Seating showSeats(Seating seat);
	
	int update(NominalRole p);
	int updatePaper(Papers p);
	int updateSeating(Seating p);
	int delete(int id);
	int deletePaper(int id);
	int deleteSeating(int id);
	
	NominalRole getNominalRoleById(int regno);
	 Seating getSeatingById(int id);
	
	List<NominalRole> getAllNominalRoles();
	List<Papers> getPapersById();
	List<Papers> getAllPapers();
	List<Seating> getSeatingById();
	// to load Department combobox values
	List<ComboDO> getAllDept();	
	List<ComboDO> getAllDegree();
	List<ComboDO> getAllYear();
	List<ComboDO> getAllSection();
	List<ComboDO> getAllSemester();
	List<ComboDO> getAllPaper();
	List<ComboDO> getAllHallno();
	/*List<ComboDO> getAllDept1();	
	List<ComboDO> getAllDegree1();
	List<ComboDO> getAllYear1();*/
	List<Seating> getAllSeating();
	
	
	
	
	
	
}
