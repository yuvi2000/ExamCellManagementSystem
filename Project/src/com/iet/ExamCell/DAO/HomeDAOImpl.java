
/**
 * 
 */
package com.iet.ExamCell.DAO;

/**
 * @author admin
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Date;
import java.util.Locale;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iet.ExamCell.Model.ComboDO;
import com.iet.ExamCell.Model.Invigilation;
import com.iet.ExamCell.Model.Login;
import com.iet.ExamCell.Model.NominalRole;
import com.iet.ExamCell.Model.Papers;
import com.iet.ExamCell.Model.Seating;

@Repository
@Transactional
public class HomeDAOImpl implements HomeDAO {

	  @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  public void setTemplate(JdbcTemplate template) {  
		    this.jdbcTemplate = template;  
	  }  
	  
	  public Login validateUser(Login login) {

		  String sql = "SELECT count(*) from TBL_MST_LOGIN_ACCESS WHERE vch_username = ? and VCH_PASSWORD = ?";
			int count = jdbcTemplate.queryForObject(sql, Integer.class, login.getUsername(), login.getPassword());
			if(count == 0) {
	    		        return null;
			} else {
				return login;
			}
	  }

	  public void register(NominalRole student){

	    String sql = "insert into tbl_mst_nominal_role (vch_reg_number, vch_name, dtt_year_of_joining, num_year_id, num_degree_id, num_dept_id, num_section_id, vch_email_id) "
	    		+ "values(?,?,?,?,?,?,?,?)";
		//String sql = "insert into tbl_mst_nominal_role (vch_reg_number, vch_name,num_degree_id, num_dept_id, num_year_id, num_section_id, vch_email_id) values(?,?,?,?,?,?,?)";
	    //jdbcTemplate.update(sql, new Object[] { student.getRegno(),student.getName(),student.getDegree(),student.getDept(),student.getYear(),student.getSection() student.getEmail()});
	  //}
	    /*if(student.getYoj() != null)
	    {
	    DateFormat formatDate1 = new SimpleDateFormat("dd/MM/yyyy");
	    Date formatedDate1 = null;
	    try {
	    formatedDate1 = formatDate1.parse(student.getYoj().toString());
	    } catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    }*/
	    
	    DateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyy");

	    /*try{
	        Date formattedDate;*/
			try {
				student.setYoj(dateFormat.parse(dateFormat.format(student.getYoj())));
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    /*}catch(ParseException parseEx){
	        parseEx.printStackTrace();
	    }*/
	    
	    jdbcTemplate.update(sql, new Object[] { student.getRegno(),
	    	student.getName(), student.getYoj(), student.getDegree(), student.getDept(), student.getSection(), student.getYear(), student.getEmail()});
	  }

	  public NominalRole showStudents(NominalRole student) {

	    String sql = "select num_nominal_role_id,"+ 
	    		"vch_reg_number, vch_name,"+ 
	    		"dtt_year_of_joining,"+ 
	    		"tbl_mst_year.num_year_id, tbl_mst_year.num_year,"+
	    		"tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
	    		"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
	    		"tbl_mst_section.num_section_id, tbl_mst_section.vch_section,"+ 
	    		"vch_email_id"+ 
	    		" from tbl_mst_nominal_role, tbl_mst_year, tbl_mst_degree, tbl_mst_dept, tbl_mst_section"+
	    		" where tbl_mst_nominal_role.num_year_id = tbl_mst_year.num_year_id"+
	    		" AND tbl_mst_nominal_role.num_degree_id = tbl_mst_degree.num_degree_id"+
	    		" AND tbl_mst_nominal_role.num_dept_id = tbl_mst_dept.num_dept_id"+
	    		" AND tbl_mst_nominal_role.num_section_id = tbl_mst_section.num_section_id"+
	            " order by num_nominal_role_id";
	    		List<NominalRole> students = jdbcTemplate.query(sql, new NominalRoleMapper());

	    return students.size() > 0 ? students.get(0) : null;
	  }
	  
	  public int update(NominalRole p){  
		    String sql="update tbl_mst_nominal_role set vch_reg_number='"+p.getRegno()+"', vch_name='"+p.getName()+"', dtt_year_of_joining='"+p.getYoj()+"', num_year_id="+p.getYear()+", num_degree_id="+p.getDegree()+", num_dept_id="+p.getDept()+", num_section_id="+p.getSection()+",vch_email_id='"+p.getEmail()+"'";
		    
		     return jdbcTemplate.update(sql);  
		}  
		public int delete(int id){  
		    String sql="delete from tbl_mst_nominal_role where num_nominal_role_id="+id+"";  
		    return jdbcTemplate.update(sql);  
		}  
		public NominalRole getNominalRoleById(int regno){  
		    String sql="select num_nominal_role_id,"+ 
		    		"vch_reg_number, vch_name,"+ 
		    		"dtt_year_of_joining,"+ 
		    		"tbl_mst_year.num_year_id, tbl_mst_year.num_year,"+
		    		"tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
		    		"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
		    		"tbl_mst_section.num_section_id, tbl_mst_section.vch_section,"+ 
		    		"vch_email_id"+ 
		    		" from tbl_mst_nominal_role, tbl_mst_year, tbl_mst_degree, tbl_mst_dept, tbl_mst_section"+
		    		" where num_nominal_role_id=?";  
		    return jdbcTemplate.queryForObject(sql, new Object[]{regno},new BeanPropertyRowMapper<NominalRole>(NominalRole.class));  
		}  
		public List<NominalRole> getAllNominalRoles(){  
		    return jdbcTemplate.query("select num_nominal_role_id,"+ 
	    		"vch_reg_number, vch_name,"+ 
	    		"dtt_year_of_joining,"+ 
	    		"tbl_mst_year.num_year_id, tbl_mst_year.num_year,"+
	    		"tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
	    		"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
	    		"tbl_mst_section.num_section_id, tbl_mst_section.vch_section,"+ 
	    		"vch_email_id"+ 
	    		" from tbl_mst_nominal_role, tbl_mst_year, tbl_mst_degree, tbl_mst_dept, tbl_mst_section"+
	    		" where tbl_mst_nominal_role.num_year_id = tbl_mst_year.num_year_id"+
	    		" AND tbl_mst_nominal_role.num_degree_id = tbl_mst_degree.num_degree_id"+
	    		" AND tbl_mst_nominal_role.num_dept_id = tbl_mst_dept.num_dept_id"+
	    		" AND tbl_mst_nominal_role.num_section_id = tbl_mst_section.num_section_id"+
	    		" order by num_nominal_role_id",new RowMapper<NominalRole>(){  
		        public NominalRole mapRow(ResultSet rs, int row) throws SQLException {  
		        	NominalRole e=new NominalRole();  
		            e.setNominalRoleId(rs.getInt(1));
		        	e.setRegno(rs.getString(2));  
		            e.setName(rs.getString(3)); 
		            e.setYoj(rs.getDate(4));
		            e.setDegree(rs.getInt(7));
		            e.setDegreeName(rs.getString(8));  
		            e.setDept(rs.getInt(9)); 
		            e.setDeptName(rs.getString(10)); 
		            e.setSection(rs.getInt(11));
		            e.setSectionName(rs.getString(12));  
		            e.setYear(rs.getInt(5));
		            e.setYearName(rs.getInt(6));  
		           
		            e.setEmail(rs.getString(13));
		            
		            
		            return e;  
		        }  
		    });  
		} 

		// to load Department combobox values
		public List<ComboDO> getAllDept(){  
		    return jdbcTemplate.query("select num_dept_id, vch_dept_name from tbl_mst_dept where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		public List<ComboDO> getAllDegree(int deptId){  
		    return jdbcTemplate.query("select num_degree_id, vch_degree_name from tbl_mst_degree where char_active_status='Y' and num_dept_id="+deptId,new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		public List<ComboDO> getAllYear(){  
		    return jdbcTemplate.query("select num_year_id, num_year from tbl_mst_year where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		public List<ComboDO> getAllSection(){  
		    return jdbcTemplate.query("select num_section_id, vch_section from tbl_mst_section where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		
		
		public void register1(Papers subject){

		    String sql = "insert into tbl_trn_papers (num_degree_id, num_dept_id, num_year_id, num_sem_id, num_paper_id) "
		    		+ "values(?,?,?,?,?)";
		    jdbcTemplate.update(sql, new Object[] { subject.getDegreeId(),
		    	subject.getDeptId(), subject.getYearId(), subject.getSemesterId(), subject.getPaper()});
		  }

		  public Papers showSubjects(Papers subject) {

		    String sql = "select tbl_trn_papers.num_trn_paper_id, "+
"tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
"tbl_mst_year.num_year_id, tbl_mst_year.num_year"+
"tbl_mst_semesters.num_sem_id, tbl_mst_semesters.vch_sem_name,"+ 
"tbl_mst_papers_list.num_paper_id, tbl_mst_papers_list.vch_paper_name from tbl_trn_papers, tbl_mst_degree, tbl_mst_dept, tbl_mst_year, tbl_mst_semesters, tbl_mst_papers_list"+
"where tbl_trn_papers.num_degree_id = tbl_mst_degree.num_degree_id"+
"AND tbl_trn_papers.num_dept_id = tbl_mst_dept.num_dept_id"+
"AND tbl_trn_papers.num_year_id = tbl_mst_year.num_year"+
"AND tbl_trn_papers.num_sem_id = tbl_mst_semesters.num_sem_id"+
"AND tbl_trn_papers.num_paper_id = tbl_mst_papers_list.num_paper_id"+
"order by tbl_trn_papers.num_trn_paper_id";
		  

		    List<Papers> subjects = jdbcTemplate.query(sql, new PapersMapper());
		    
		    return subjects.size() > 0 ? subjects.get(0) : null;
		  }
		  
		  public int update1(Papers p){  
			    String sql="update tbl_trn_papers set num_degree_id="+p.getDegreeId()+", num_dept_id="+p.getDeptId()+", num_year_id="+p.getYearId()+", num_sem_id="+p.getSemesterId()+", num_paper_id="+p.getPaper()+"";
			    
			     return jdbcTemplate.update(sql);  
			}  
			public int delete1(int id){  
			    String sql="delete from tbl_trn_papers where num_paper_id="+id+"";  
			    return jdbcTemplate.update(sql);  
			}  
		     public Papers getPapersById(int id){  
			    String sql="select tbl_trn_papers.num_trn_paper_id, tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
						"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
					    "tbl_mst_year.num_year_id, tbl_mst_year.num_year,"+
						"tbl_mst_semesters.num_sem_id, tbl_mst_semesters.vch_sem_name,"+
					    "tbl_mst_papers_list.num_paper_id, tbl_mst_papers_list.vch_paper_name from tbl_trn_papers where num_trn_paper_id=?";  
			    
			    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Papers>(Papers.class));  
			}  
				public List<Papers> getAllPapers() {
			    return jdbcTemplate.query("select tbl_trn_papers.num_trn_paper_id, tbl_mst_degree.num_degree_id, tbl_mst_degree.vch_degree_name,"+
				"tbl_mst_dept.num_dept_id, tbl_mst_dept.vch_dept_name,"+
			    "tbl_mst_year.num_year_id, tbl_mst_year.num_year,"+
				"tbl_mst_semesters.num_sem_id, tbl_mst_semesters.vch_sem_name,"+
			    "tbl_mst_papers_list.num_paper_id, tbl_mst_papers_list.vch_paper_name from tbl_trn_papers, tbl_mst_degree, tbl_mst_dept, tbl_mst_year, tbl_mst_semesters, tbl_mst_papers_list"+
				" where tbl_trn_papers.num_degree_id = tbl_mst_degree.num_degree_id"+
				" AND tbl_trn_papers.num_dept_id = tbl_mst_dept.num_dept_id"+
				" AND tbl_trn_papers.num_year_id = tbl_mst_year.num_year"+
				" AND tbl_trn_papers.num_sem_id = tbl_mst_semesters.num_sem_id"+
				" AND tbl_trn_papers.num_paper_id = tbl_mst_papers_list.num_paper_id"+
				" order by tbl_trn_papers.num_trn_paper_id",new RowMapper<Papers>(){  
			    
			    	public Papers mapRow(ResultSet rs, int row) throws SQLException {  
			        	Papers e=new Papers();  
			            e.setPaperId(rs.getInt(1));
			        	e.setDegreeId(rs.getInt(2)); 
			        	e.setDegreeName(rs.getString(3));
			            e.setDeptId(rs.getInt(4)); 
			        	e.setDeptName(rs.getString(5));
			            e.setYearId(rs.getInt(6));  
			        	e.setYearName(rs.getInt(7));
			            e.setSemesterId(rs.getInt(8)); 
			        	e.setSemesterName(rs.getString(9));
			        	e.setPaper(rs.getInt(10));
			            e.setPaperName(rs.getString(11));
			            
			           
			            
			            return e;  
			        }  
			    });  
			}
			
			
			// to load Department combobox values
			/*public List<ComboDO> getAllDept1(){  
			    return jdbcTemplate.query("select num_dept_id, vch_dept_name from tbl_mst_dept where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}
			public List<ComboDO> getAllDegree1(){  
			    return jdbcTemplate.query("select num_degree_id, vch_degree_name from tbl_mst_degree where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}
			public List<ComboDO> getAllYear1(){  
			    return jdbcTemplate.query("select num_year_id, num_year from tbl_mst_year where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}*/
			
			public List<ComboDO> getAllSemester(){  
			    return jdbcTemplate.query("select num_sem_id, vch_sem_name from tbl_mst_semesters where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}
			
			public List<ComboDO> getAllPaper(){  
			    return jdbcTemplate.query("select num_paper_id, vch_paper_name from tbl_mst_papers_list where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}
			
		
		public void seatingPlan(Seating seating){

	    String sql = "insert into tbl_trn_seating(num_seating_id, num_hall_id, num_year_id, num_degree_id, num_section_id, num_regno_from, num_regno_upto, num_total_no_of_students) "
	    		+ "values(?,?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { seating.getSeatingId(), seating.getHallnoId(),
	    		seating.getYearId(), seating.getDegreeId(), seating.getSectionId(), seating.getNominalRolefrom(),seating.getNominalRoleupto(), seating.getNoofstudents()});
	  }

	  public Seating showSeating(Seating seating) {

	    String sql = "select num_seating_id,"+
				 " tbl_mst_hall.num_hall_id, tbl_mst_hall.vch_hall_no,"+
				 " concat( tbl_mst_year.num_year,' ', tbl_mst_degree.vch_degree_name,'-',tbl_mst_section.vch_section) as vch_class,"+ 
				 " concat( num_regno_from.vch_reg_number,'-',num_regno_upto.vch_reg_number) as vch_reg_numbers,"+
				 " num_total_no_of_students"+ 
				 " from tbl_trn_seating, tbl_mst_hall, tbl_mst_year, tbl_mst_degree, tbl_mst_section, tbl_mst_nominal_role num_regno_from, tbl_mst_nominal_role num_regno_upto"+
				 " where tbl_trn_seating.num_hall_id = tbl_mst_hall.num_hall_id"+
				 " AND tbl_trn_seating.num_year_id = tbl_mst_year.num_year_id"+
				 " AND tbl_trn_seating.num_degree_id = tbl_mst_degree.num_degree_id"+
				 " AND tbl_trn_seating.num_section_id = tbl_mst_section.num_section_id"+
				 " AND tbl_trn_seating.num_regno_from = num_regno_from.num_nominal_role_id"+
				" AND tbl_trn_seating.num_regno_upto = num_regno_upto.num_nominal_role_id"+
				 " order by num_seating_id";
	    
	    List<Seating> seatings = jdbcTemplate.query(sql, new SeatingMapper());
	    
	    return seatings.size() > 0 ? seatings.get(0) : null;
	  }
	  
	  public int updateSeating(Seating p){  
		    String sql="update tbl_trn_seating set num_hall_id="+p.getHallnoId()+", num_year_id="+p.getYearId()+", num_degree_id="+p.getDegreeId()+", num_section_id="+p.getSectionId()+", vch_regno_from="+p.getNominalRolefrom()+", vch_regno_upto="+p.getNominalRoleupto()+", num_total_no_of_students="+p.getNoofstudents()+"";
		    
		     return jdbcTemplate.update(sql);  
		}  
		public int deleteSeating(int id){  
		    String sql="delete from tbl_trn_seating where num_seating_id="+id+"";  
		    return jdbcTemplate.update(sql);  
		}  
	     public Seating getSeatingById(int id){  
		    String sql=  "select num_seating_id,"+
					 " tbl_mst_hall.num_hall_id, tbl_mst_hall.vch_hall_no,"+
					 " concat( tbl_mst_year.num_year,' ', tbl_mst_degree.vch_degree_name,'-',tbl_mst_section.vch_section) as vch_class,"+ 
					 " concat( num_regno_from.vch_reg_number,'-',num_regno_upto.vch_reg_number) as vch_reg_numbers,"+
					 " num_total_no_of_students"+ 
					 " from tbl_trn_seating, tbl_mst_hall, tbl_mst_year, tbl_mst_degree, tbl_mst_section, tbl_mst_nominal_role num_regno_from, tbl_mst_nominal_role num_regno_upto"
					 + "where num_seating_id=?";  
			 
		    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Seating>(Seating.class));  
		}  
			public List<Seating> getAllSeating() {
				return jdbcTemplate.query("select num_seating_id,"+
						 " tbl_mst_hall.num_hall_id, tbl_mst_hall.vch_hall_no,"+
						 " concat( tbl_mst_year.num_year,' ', tbl_mst_degree.vch_degree_name,'-',tbl_mst_section.vch_section) as vch_class,"+ 
						 " concat( num_regno_from.vch_reg_number,'-',num_regno_upto.vch_reg_number) as vch_reg_numbers,"+
						 " num_total_no_of_students"+ 
						 " from tbl_trn_seating, tbl_mst_hall, tbl_mst_year, tbl_mst_degree, tbl_mst_section, tbl_mst_nominal_role num_regno_from, tbl_mst_nominal_role num_regno_upto"+
						 " where tbl_trn_seating.num_hall_id = tbl_mst_hall.num_hall_id"+
						 " AND tbl_trn_seating.num_year_id = tbl_mst_year.num_year_id"+
						 " AND tbl_trn_seating.num_degree_id = tbl_mst_degree.num_degree_id"+
						 " AND tbl_trn_seating.num_section_id = tbl_mst_section.num_section_id"+
						 " AND tbl_trn_seating.num_regno_from = num_regno_from.num_nominal_role_id"+
						" AND tbl_trn_seating.num_regno_upto = num_regno_upto.num_nominal_role_id order by num_seating_id",new RowMapper<Seating>(){
				/*if(seating_id > 0)
				strSql = strSql+" and tbl_trn_seating.num_seating_id = "+seating_id;
				
				strSql = strSql+" order by num_seating_id";
				String strSql="select num_seating_id,"+
						" tbl_mst_hall.num_hall_id, tbl_mst_hall.vch_hall_no,"+
						" concat( tbl_mst_year.num_year,' ', tbl_mst_degree.vch_degree_name,'-',tbl_mst_section.vch_section) as vch_class,"+ 
						" concat( tbl_mst_nominal_role.vch_reg_number,'-',tbl_mst_nominal_role.vch_reg_number) as vch_reg_numbers,"+
  						" num_total_no_of_students"+  
						" from tbl_trn_seating, tbl_mst_hall, tbl_mst_year, tbl_mst_degree, tbl_mst_section, tbl_mst_nominal_role"+
						" where tbl_trn_seating.num_hall_id = tbl_mst_hall.num_hall_id"+
						 " AND tbl_trn_seating.num_year_id = tbl_mst_year.num_year_id"+
						 " AND tbl_trn_seating.num_degree_id = tbl_mst_degree.num_degree_id"+
						" AND tbl_trn_seating.num_section_id = tbl_mst_section.num_section_id"+
						 " AND tbl_trn_seating.num_regno_from = tbl_mst_nominal_role.num_nominal_role_id"+
						" AND tbl_trn_seating.num_regno_upto = tbl_mst_nominal_role.num_nominal_role_id";*/
			        public Seating mapRow(ResultSet rs, int row) throws SQLException {  
			        	Seating e=new Seating();  
			            e.setSeatingId(rs.getInt(1));
			        	e.setHallnoId(rs.getInt(2));
			        	e.setHallName(rs.getString(3));
			        	//e.setYearId(rs.getInt(3));
			        	//e.setYearName(rs.getInt(3));
			        	//e.setDegreeId(rs.getInt(4));
			        	//e.setDegreeName(rs.getString(3));
			        	//e.setSectionId(rs.getInt(5));
			        	//e.setSectionName(rs.getString(3));
			        	e.setClassName(rs.getString(4));
                        e.setRegnumbers(rs.getString(5));
			            //e.setNominalRolefrom(rs.getString(6));
			            //e.setNominalRoleupto(rs.getString(7));
			            e.setNoofstudents(rs.getInt(6));
			           
			            return e;  
			        }  
			    });  
			} 
		
		// to load Department combobox values
			public List<ComboDO> getAllHall(){  
			    return jdbcTemplate.query("select num_hall_id, vch_hall_no from tbl_mst_hall where char_active_status='Y'",new RowMapper<ComboDO>(){  
			        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
			        	ComboDO e=new ComboDO();  
			            e.setId(rs.getInt(1));
			        	e.setValue(rs.getString(2));		            
			            return e;  
			        }  
			    });  
			}
			
		/*public List<ComboDO> getYear(){  
		    return jdbcTemplate.query("select num_year_id, num_year from tbl_mst_year where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		/*public List<ComboDO> getAllDegree(){  
		    return jdbcTemplate.query("select num_degree_id, vch_degree_name from tbl_mst_degree where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}*/
		/*public List<ComboDO> getSection(){  
		    return jdbcTemplate.query("select num_section_id, vch_section_name from tbl_mst_section where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}
		*/
		
		public List<ComboDO> getAllRegno(){  
		    return jdbcTemplate.query("select num_nominal_role_id, vch_reg_number from tbl_mst_nominal_role where char_active_status='Y'",new RowMapper<ComboDO>(){  
		        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
		        	ComboDO e=new ComboDO();  
		            e.setId(rs.getInt(1));
		        	e.setValue(rs.getString(2));		            
		            return e;  
		        }  
		    });  
		}

class NominalRoleMapper implements RowMapper<NominalRole> {

	  public NominalRole mapRow(ResultSet rs, int arg1) throws SQLException {
		  NominalRole student = new NominalRole();
		  student.setNominalRoleId(rs.getInt("num_nominal_role_id"));
		  student.setRegno(rs.getString("vch_regno"));
		  student.setName(rs.getString("vch_name"));
		  student.setYoj(rs.getDate("dtt_year_of_joining"));
		  student.setYear(rs.getInt("num_year_id"));
		  student.setDegree(rs.getInt("num_degree_id"));
		  student.setDept(rs.getInt("num_dept_id"));
		  student.setSection(rs.getInt("num_section_id"));
		  student.setEmail(rs.getString("vch_email_id"));
		  
	    return student;
	  }
	}


	class PapersMapper implements RowMapper<Papers> {

	  public Papers mapRow(ResultSet rs, int arg1) throws SQLException {
		  Papers subject = new Papers();
		  subject.setPaperId(rs.getInt("num_trn_paper_id"));
		  subject.setDegreeId(rs.getInt("num_degree_id"));
		  subject.setDegreeName(rs.getString("vch_degree_name"));
		  subject.setDeptId(rs.getInt("num_dept_id"));
		  subject.setDeptName(rs.getString("vch_dept_name"));
		  subject.setYearId(rs.getInt("num_year_id"));
		  subject.setYearName(rs.getInt("num_year"));
		  subject.setSemesterId(rs.getInt("num_sem_id"));
		  subject.setSemesterName(rs.getString("vch_sem_name"));
		  subject.setPaper(rs.getInt("num_paper_id"));
		  subject.setPaperName(rs.getString("vch_paper_name"));

		  
	    return subject;
	  }
	}

	
class SeatingMapper implements RowMapper<Seating> {

	  public Seating mapRow(ResultSet rs, int arg1) throws SQLException {
		  Seating seating = new Seating();
		  seating.setSectionId(rs.getInt("num_seating_id"));
		  seating.setHallnoId(rs.getInt("num_hall_id"));
		  seating.setHallName(rs.getString("vch_hall_no"));
		  //seating.setYearId(rs.getInt("num_year_id"));
		  //seating.setYearName(rs.getInt("num_year"));
		  //seating.setDegreeId(rs.getInt("num_degree_id"));
		  //seating.setDegreeName(rs.getString("vch_degree_name"));
		  //seating.setSectionId(rs.getInt("num_section_id"));
		  //seating.setSectionName(rs.getString("vch_section"));
		  seating.setClassName(rs.getString("vch_class"));
		  //seating.setNominalRoleId(rs.getInt("num_nominal_role_id"));
		  //seating.setNominalRolefrom(rs.getString("vch_regno_from"));
		  //seating.setNominalRoleupto(rs.getString("vch_reg_upto"));
		  seating.setRegnumbers(rs.getString("vch_reg_numbers"));
		  seating.setNoofstudents(rs.getInt("num_total_no_of_students"));
		  
	    return seating;
	  }
}
public void registerInvigilation(Invigilation faculty){

    String sql = "insert into tbl_trn_invigilation (num_invigilation_id, dtt_date, vch_session, num_hall_id, num_faculty_id, num_dept_id) "
    		+ "values(?,?,?,?,?,?)";
	
    
    jdbcTemplate.update(sql, new Object[] { faculty.getInvigilationId(),
    	faculty.getDate(), faculty.getSession(), faculty.getHallnoId(), faculty.getFacultyId(), faculty.getDeptId()});
  }

public Invigilation showInvigilation(Invigilation faculty) {

    String sql = "select num_invigilation_id, dtt_date, vch_session, num_faculty_id, num_dept_id, num_year_id, num_degree_id, num_dept_id,num_section_id from tbl_mst_invigilation";// where num_Student_Id=" + student.getStudentId() ;//" and vch_student_fname='" + student.getFirstname() + "'";

    List<Invigilation> faculties = jdbcTemplate.query(sql, new InvigilationMapper());

    return faculties.size() > 0 ? faculties.get(0) : null;
  }
  
  public int updateInvigilation(Invigilation p){  
	    String sql="update tbl_trn_invigilation set dtt_date='"+p.getDate()+"', vch_session='"+p.getSession()+"', num_hall_id='"+p.getHallnoId()+"', num_faculty_id="+p.getFacultyId()+", num_dept_id="+p.getDeptId()+"'";
	    
	     return jdbcTemplate.update(sql);  
	}  
	public int deleteInvigilation(int id){  
	    String sql="delete from tbl_trn_invigilation where num_invigilation_id="+id+"";  
	    return jdbcTemplate.update(sql);  
	}  
	public Invigilation getInvigilationById(int id){  
	    String sql="select num_invigilation_id, dtt_date, vch_session, num_hall_id, num_faculty_id, num_dept_id, from tbl_trn_invigilation where num_invigilation_id=?";  
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Invigilation>(Invigilation.class));  
	}  
	
	public List<Invigilation> getAllInvigilation() {

	    return jdbcTemplate.query("select num_invigilation_id, dtt_date, vch_session, num_hall_id, num_faculty_id, num_dept_id, from tbl_trn_invigilation",new RowMapper<Invigilation>(){  
	        public Invigilation mapRow(ResultSet rs, int row) throws SQLException {  
	        	Invigilation e=new Invigilation();  
	            e.setInvigilationId(rs.getInt(1));
	        	e.setDate(rs.getDate(2));  
	            e.setSession(rs.getString(3));  
	            e.setHallnoId(rs.getInt(4));  
	            e.setFacultyId(rs.getInt(5));  
	            e.setDeptId(rs.getInt(6));
	            
	            return e;  
	        }  
	    });  
	} 

	// to load Department combobox values
	/*public List<ComboDO> getDept(){  
	    return jdbcTemplate.query("select num_dept_id, vch_dept_name from tbl_mst_dept where char_active_status='Y'",new RowMapper<ComboDO>(){  
	        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
	        	ComboDO e=new ComboDO();  
	            e.setId(rs.getInt(1));
	        	e.setValue(rs.getString(2));		            
	            return e;  
	        }  
	    });  
	}*/
	
	public List<ComboDO> getAllFaculty(){  
	    return jdbcTemplate.query("select num_faculty_id, vch_faculty_name from tbl_mst_faculty where char_active_status='Y'",new RowMapper<ComboDO>(){  
	        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
	        	ComboDO e=new ComboDO();  
	            e.setId(rs.getInt(1));
	        	e.setValue(rs.getString(2));		            
	            return e;  
	        }  
	    });  
	}
	/*public List<ComboDO> getAllHallId(){  
	    return jdbcTemplate.query("select num_section_id, vch_section from tbl_mst_section where char_active_status='Y'",new RowMapper<ComboDO>(){  
	        public ComboDO mapRow(ResultSet rs, int row) throws SQLException {  
	        	ComboDO e=new ComboDO();  
	            e.setId(rs.getInt(1));
	        	e.setValue(rs.getString(2));		            
	            return e;  
	        }  
	    });  
	}*/
	
	
	class InvigilationMapper implements RowMapper<Invigilation> {

		  public Invigilation mapRow(ResultSet rs, int arg1) throws SQLException {
			  Invigilation faculty = new Invigilation();
			  faculty.setInvigilationId(rs.getInt("num_nominal_role_id"));
			  faculty.setHallnoId(rs.getInt("num_hall_id"));
			  faculty.setDate(rs.getDate("dtt_date"));
			  faculty.setSession(rs.getString("vch_session"));
			  faculty.setFacultyId(rs.getInt("num_faculty_id"));
			  faculty.setDeptId(rs.getInt("num_dept_id"));
			  
		    return  faculty;
		  }
		
	}
}
	