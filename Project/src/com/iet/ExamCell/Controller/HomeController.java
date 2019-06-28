/**
 * 
 */
package com.iet.ExamCell.Controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.iet.ExamCell.Model.ComboDO;
import com.iet.ExamCell.Model.Invigilation;
import com.iet.ExamCell.Model.Login;
import com.iet.ExamCell.Model.NominalRole;
import com.iet.ExamCell.Model.Papers;
import com.iet.ExamCell.Model.Seating;
import com.iet.ExamCell.Service.HomeService;

@Controller
public class HomeController {  
	
	@Autowired
	HomeService homeService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		Login login=new Login();
		model.addAttribute("login",login);
		return "Login";
	
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    Login user = homeService.validateUser(login);
	    if (null != user) {
	    mav = new ModelAndView("Dashboard");
	    mav.addObject("username", user.getUsername()); 
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	
	/*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/nominalRole")  
    public String showform(Map<String, Object> model){  
    	model.put("nominalRole", new NominalRole());
    	
    	/*NominalRole nominalRole=homeService.getNominalRoleById(id);  
        m.addAttribute("command",nominalRole);*/
        
        List<ComboDO> deptList = homeService.getAllDept();
        model.put("deptList", deptList);
        /*List<ComboDO> degreeList = homeService.getAllDegree();
        model.put("degreeList", degreeList);
        List<ComboDO> yearList = homeService.getAllYear();
        model.put("yearList", yearList);
        List<ComboDO> sectionList = homeService.getAllSection();
        model.put("sectionList", sectionList);*/
        
    	    	return "NominalRole"; 
    }  
    @RequestMapping(value = "degrees/{deptId}", method = RequestMethod.GET)
    @ResponseBody
    public List<ComboDO> getAllDegree(@PathVariable("deptId") int deptId) {
        return homeService.getAllDegree(deptId);
    }
    
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/saveNominalRole",method = RequestMethod.POST)  
    public String saveNominalRole(@ModelAttribute NominalRole nominalRole){  
    	if(nominalRole.getNominalRoleId()>0)
    	{
    		homeService.update(nominalRole);
    	}
    	else
    	{
    		homeService.saveNominalRole(nominalRole);  
    	}
        return "redirect:/viewNominalRole";//will redirect to viewNominalRole request mapping  
    }  
         
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/edit/{id}")  
    public String edit(@PathVariable int id, Model m){  
    	NominalRole nominalRole=homeService.getNominalRoleById(id);  
        m.addAttribute("command",nominalRole);
        return "NominalRole";  
    }  
    
    /* It updates Nominal Role by passing the model object NominallRole as parameter */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("nominalRole") NominalRole nominalRole){  
    	homeService.saveNominalRole(nominalRole);  
        return "redirect:/viewNominalRole";  
    }  
    
    /* It provides list of students through the model object - NominallRole */  
    @RequestMapping("/viewNominalRole")  
    public String viewNominalRole(Model m){  
        List<NominalRole> list=homeService.getAllNominalRoles();  
        m.addAttribute("list",list);
        return "ViewNominalRole"; 
        
    } 

@RequestMapping("/papers")  
public String showforms(Map<String, Object> model){  
	model.put("papers", new Papers());
	
	/*NominalRole nominalRole=homeService.getNominalRoleById(id);  
    m.addAttribute("command",nominalRole);*/
    
    /*List<ComboDO> degreeList = homeService.getAllDegree();
    model.put("degreeList", degreeList);*/
    List<ComboDO> deptList = homeService.getAllDept();
    model.put("deptList",deptList);
    List<ComboDO> yearList = homeService.getAllYear();
    model.put("yearList", yearList);
    List<ComboDO> semesterList = homeService.getAllSemester();
    model.put("semesterList", semesterList);
    List<ComboDO> paperList = homeService.getAllPaper();
    model.put("paperList", paperList);
    
    return "Papers"; 
    
}


/*It saves object into database. The @ModelAttribute puts request data 
 *  into model object. You need to mention RequestMethod.POST method  
 *  because default request is GET*/  
@RequestMapping(value="/savePapers",method = RequestMethod.POST)  
public String savePapers(@ModelAttribute Papers papers){
	
	if(papers.getPaperId()>0)
	{
		homeService.update1(papers);
	}
	else
	{
		homeService.savePapers(papers);  
	}
    return "redirect:/viewPapers";
}

/* It displays object data into form for the given id.  
 * The @PathVariable puts URL data into variable.*/  
@RequestMapping(value="/Edit/{id}")  
public String Edit(@PathVariable int id, Model m){  
	Papers papers=homeService.getPapersById(id);  
    m.addAttribute("command",papers);
    return "Papers";  
} 

/* It updates Nominal Role by passing the model object NominallRole as parameter */  
@RequestMapping(value="/Editsave",method = RequestMethod.POST)  
public String Editsave(@ModelAttribute("papers") Papers papers){  
	homeService.savePapers(papers);  
    return "redirect:/viewPapers";  
}  

/* It provides list of students through the model object - NominallRole */  
@RequestMapping("/viewPapers")  
public String viewPapers(Model m){  
    List<Papers> list=homeService.getAllPapers();  
    m.addAttribute("list",list);
    return "ViewPapers"; 
    
} 
@RequestMapping("/seating")  
public String showSeating(Map<String, Object> model){  
	model.put("seating", new Seating());
	
	/*NominalRole nominalRole=homeService.getNominalRoleById(id);  
    m.addAttribute("command",nominalRole);*/
    
	List<ComboDO> hallList = homeService.getAllHall();
    model.put("hallList", hallList);
    List<ComboDO> yearList = homeService.getAllYear();
    model.put("yearList", yearList);
   /* List<ComboDO> degreeList = homeService.getAllDegree();
    model.put("degreeList", degreeList);*/
    List<ComboDO> sectionList = homeService.getAllSection();
    model.put("sectionList", sectionList);
    List<ComboDO> regnoList = homeService.getAllRegno();
    model.put("regnoList", regnoList);
    
    
	    	return "Seating"; 
}  

/*It saves object into database. The @ModelAttribute puts request data 
 *  into model object. You need to mention RequestMethod.POST method  
 *  because default request is GET*/  
@RequestMapping(value="/saveSeating",method = RequestMethod.POST)  
public String saveSeating(@ModelAttribute Seating seating){  
	if(seating.getSeatingId()>0)
	{
		homeService.updateseating(seating);
	}
	else
	{
		homeService.saveSeating(seating);  
	}
    return "redirect:/viewSeating";//will redirect to viewNominalRole request mapping  
}  
     
/* It displays object data into form for the given id.  
 * The @PathVariable puts URL data into variable.*/  
@RequestMapping(value="/editSeating/{id}")  
public String editSeating(@PathVariable int id, Model m){  
	Seating seating=homeService.getSeatingById(id);  
    m.addAttribute("command",seating);
    return "Seating";  
}  

/* It updates Nominal Role by passing the model object NominallRole as parameter */  
@RequestMapping(value="/editsaveSeating",method = RequestMethod.POST)  
public String editsaveSeating(@ModelAttribute("seating") Seating seating){  
	homeService.saveSeating(seating);  
    return "redirect:/viewSeating";  
}  

/* It provides list of students through the model object - NominallRole */  
@RequestMapping("/viewSeating")  
public String viewSeating(Model m){  
    List<Seating> list=homeService.getAllSeating();  
    m.addAttribute("list",list);
    return "ViewSeating"; 
    
} 
@RequestMapping("/invigilation")  
public String showInvigilationform(Map<String, Object> model){  
	model.put("invigilation", new Invigilation());
    
    List<ComboDO> hallList = homeService.getAllHall();
    model.put("hallList", hallList);
    List<ComboDO> facultyList = homeService.getAllFaculty();
    model.put("facultyList", facultyList);
    List<ComboDO> deptList = homeService.getAllDept();
    model.put("deptList", deptList);
    return "Invigilation"; 
    
}


/*It saves object into database. The @ModelAttribute puts request data 
 *  into model object. You need to mention RequestMethod.POST method  
 *  because default request is GET*/  
@RequestMapping(value="/saveInvigilation",method = RequestMethod.POST)  
public String saveInvigilation(@ModelAttribute Invigilation invigilation){
	
	if(invigilation.getInvigilationId()>0)
	{
	homeService.updateInvigilation(invigilation);
	}
	else
	{
		homeService.saveInvigilation(invigilation);  
	}
    return "redirect:/viewInvigilation";
}

/* It displays object data into form for the given id.  
 * The @PathVariable puts URL data into variable.*/  
@RequestMapping(value="/EditInvigilation/{id}")  
public String EditInvigilation(@PathVariable int id, Model m){  
	Invigilation invigilation=homeService.getInvigilationById(id);  
    m.addAttribute("command",invigilation);
    return "Invigilation";  
} 

@RequestMapping(value="/EditsaveInvigilation",method = RequestMethod.POST)  
public String EditsaveInvigilation(@ModelAttribute("invigilation") Invigilation invigilation){  
	homeService.saveInvigilation(invigilation);  
    return "redirect:/viewInvigilation";  
}  

@RequestMapping("/viewInvigilation")  
public String viewInvigilation(Model m){  
    List<Invigilation> list=homeService.getAllInvigilation();  
    m.addAttribute("list",list);
    return "ViewInvigilation"; 
}

@RequestMapping("/attendance")  
public String showAttendanceform(Map<String, Object> model){  
	model.put("attendance", new Attendance());
    
    List<ComboDO> hallList = homeService.getAllHall();
    model.put("hallList", hallList);
    return "Attendance"; 
    
}


/*It saves object into database. The @ModelAttribute puts request data 
 *  into model object. You need to mention RequestMethod.POST method  
 *  because default request is GET*/  
/*@RequestMapping(value="/saveAttendance",method = RequestMethod.POST)  
public String saveAttendance(@ModelAttribute Attendance attendance){
	
	if(attendance.getAttendanceId()>0)
	{
	homeService.updateAttendance(attendance);
	}
	else
	{
		homeService.saveAttendance(attendance);  
	}
    return "redirect:/viewAttendance";
}

/* It displays object data into form for the given id.  
 * The @PathVariable puts URL data into variable.*/  
/*@RequestMapping(value="/EditAttendance/{id}")  
public String EditAttendance(@PathVariable int id, Model m){  
	Attendance attendance=homeService.getAttendanceById(id);  
    m.addAttribute("command",attendance);
    return "Attendance";  
} 

@RequestMapping(value="/EditsaveAttendance",method = RequestMethod.POST)  
public String EditsaveAttendance(@ModelAttribute("attendance") Attendance attendance){  
	homeService.saveAttendance(attendance);  
    return "redirect:/viewAttendance";  
}  

@RequestMapping("/viewAttendance")  
public String viewAttendance(Model m){  
    List<Attendance> list=homeService.getAllAttendance();  
    m.addAttribute("list",list);
    return "ViewAttendance"; 
}*/
}
