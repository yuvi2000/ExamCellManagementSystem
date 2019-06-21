/**
 * 
 */
package com.iet.ExamCell.Service;

/**
 * @author admin
 *
 */
import java.sql.ResultSet;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iet.ExamCell.Model.ComboDO;
import com.iet.ExamCell.Model.Login;
import com.iet.ExamCell.Model.NominalRole;
import com.iet.ExamCell.Model.Papers;
import com.iet.ExamCell.Model.Seating;

@Service
@Transactional
public interface HomeService {

	  void register(NominalRole student);

	  Login validateUser(Login login);
	  
	  void saveNominalRole(NominalRole student);
	  
	  NominalRole getNominalRoleById(int regno);
	  
	  List<NominalRole> getAllNominalRoles();
	  
	  List<Papers> getAllPapers();
	  
	  int update(NominalRole p);
	  int updatePaper(Papers p);
	  
	  List<ComboDO> getAllDegree();
	  List<ComboDO> getAllDept();
	  List<ComboDO> getAllYear();
	  List<ComboDO> getAllSection();
	  List<ComboDO> getAllSemester();
	  List<ComboDO> getAllPaper();

	void savePapers(Papers papers);

	List<Papers> getPapersById(int id);

	void updateseating(Seating seating);

	void saveSeating(Seating seating);

	List<Seating> getSeatingById(int id);
	  
	  
	  }
