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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iet.ExamCell.DAO.HomeDAO;
import com.iet.ExamCell.Model.ComboDO;
import com.iet.ExamCell.Model.Login;
import com.iet.ExamCell.Model.NominalRole;
import com.iet.ExamCell.Model.Papers;
import com.iet.ExamCell.Model.Seating;

@Service
public class HomeServiceImpl implements HomeService {

	  @Autowired
	  public HomeDAO homeDao;

	  public void register(NominalRole student) {
	    homeDao.register(student);
	  }

	  public void registerPaper(Papers subject) {
		    homeDao.registerPaper(subject);
		  }

	  public Login validateUser(Login login) {
	    return homeDao.validateUser(login);
	  } 
	  public void saveNominalRole(NominalRole student) {
		    homeDao.register(student);
		  }
	  public void savePapers(Papers subject) {
		    homeDao.register1(subject);
		  }
	  
	  public NominalRole getNominalRoleById(int regno) {
		    return homeDao.getNominalRoleById(regno);
		  }
	  
	  public List<Papers> getPapersById(int id) {
		    return homeDao.getPapersById();
		  }
	  
	  public List<NominalRole> getAllNominalRoles(){
		  return homeDao.getAllNominalRoles();
	  }
	  
	  public List<Papers> getAllPapers(){
		  return homeDao.getAllPapers();
	  }
	  
	  public int update(NominalRole p){
		  return homeDao.update(p);
	  }
	  public int updatePaper(Papers p){
		  return homeDao.updatePaper(p);
	  }


	  // to load Department combobox values
	  public List<ComboDO> getAllDept(){
		  return homeDao.getAllDept(); 
	  }
	  
	  public List<ComboDO> getAllDegree(){
		  return homeDao.getAllDegree(); 
	  }
	  
	  public List<ComboDO> getAllYear(){
		  return homeDao.getAllYear(); 
	  }
	  
	  public List<ComboDO> getAllSection(){
		  return homeDao.getAllSection(); 
	  }
	  public List<ComboDO> getAllSemester(){
		  return homeDao.getAllSemester(); 
	  }
	  public List<ComboDO> getAllPaper(){
		  return homeDao.getAllPaper(); 
	  }

	@Override
	public void updateseating(Seating seating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveSeating(Seating seating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seating> getSeatingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	  
}
