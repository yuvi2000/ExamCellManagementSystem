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
import com.iet.ExamCell.Model.Invigilation;
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

	  public void register1(Papers subject) {
		    homeDao.register1(subject);
		  }
	  
	  public void seatingPlan(Seating seating){
		  homeDao.seatingPlan(seating);
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
	  public void saveSeating(Seating seating) {
		    homeDao.seatingPlan(seating);
		  }
	  
	  public NominalRole getNominalRoleById(int regno) {
		    return homeDao.getNominalRoleById(regno);
		  }
	  
	  public Papers getPapersById(int id) {
		    return homeDao.getPapersById(id);
		  }
	  
	  public Seating getSeatingById(int id){
		  return homeDao.getSeatingById(id);
	  }

	  
	  
	  
	  public List<NominalRole> getAllNominalRoles(){
		  return homeDao.getAllNominalRoles();
	  }
	  
	  public List<Papers> getAllPapers(){
		  return homeDao.getAllPapers();
	  }
	  
	  public List<Seating> getAllSeating() {
			return homeDao.getAllSeating();
		}

	  
	  public int update(NominalRole p){
		  return homeDao.update(p);
	  }
	  public int update1(Papers p){
		  return homeDao.update1(p);
	  }

		public int updateseating(Seating p){
			return homeDao.updateSeating(p);
		}
		

	  // to load Department combobox values
	  public List<ComboDO> getAllDept(){
		  return homeDao.getAllDept(); 
	  }
	  
	  public List<ComboDO> getAllDegree(){
		  return homeDao.getAllDegree(); 
	  }
	  
	  public List<ComboDO> getDegree(){
		  return homeDao.getAllDegree(); 
	  }
	  public List<ComboDO> getAllYear(){
		  return homeDao.getAllYear(); 
	  }
	  public List<ComboDO> getYear(){
		  return homeDao.getAllYear(); 
	  }
	  public List<ComboDO> getSection(){
		  return homeDao.getSection(); 
	  }
	  public List<ComboDO> getAllHall(){
		  return homeDao.getAllHall();  
	  }
	  public List<ComboDO> getAllRegno(){
		  return homeDao.getAllRegno();  
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
	public void saveInvigilation(Invigilation invigilation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Invigilation getInvigilationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invigilation> getAllInvigilation() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
