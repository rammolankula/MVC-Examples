package DATAviewmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DATAviewmvc.model.Mvcmodel;

@Controller
public class Homecontroller {
	
	
	/* HERE WE PASSING DATA FROM CONTROLLER TO UI
	 * +++++++++++++++++++++++++++++++++++++++++++++++
	 * 1. create a method in controller level
	 * 2. set the data by using "Model" 
	 * MODEL (model map for sharing the data)
	 * model is nothing but passing the data from CONTROLLER end to UI 
	 * and setting the data from controller method passed modelattribute
//	 * BELOW EXAMPLE*/
	@RequestMapping("/data")
	public String data(Model m) {

		m.addAttribute("sno",1);
		m.addAttribute("name","Ram");/*setting the data like this setting sending the data from controller to UI by Model*/
		m.addAttribute("office","olivecrypto");
		//System.out.println("One");
		return "one";
	}
	/*HERE WE PASSING THE DATA BY  CONTROLLER END TO UI BY USING OBJECT
	 * ===============================================================
	 * 1. BY USING OBJECT WE CREATED ONE MODEL CLASS
	 * pass the data in it in controller level 
	 * !)write the object in side the method and pass the data 
	 * ADD that passed data to ::::MODEL MAP:::: 
	 * EXAMPLE LIKE THIS 
	 * model.addAttribute("ob",mvc);
	 * same as this we need to give "ob" in dollar symbol
	 *  * BELOW EXAMPLE
	 * */
	
	@RequestMapping("/show")
	public String data1(Model model) {
	Mvcmodel mvc=new Mvcmodel(1,"Ramu","OLIVE CRYPTO SYSTEMS PVT LMTD");
	model.addAttribute("ob",mvc);
	return "two";
		
	}	
	
	
	
	/*PASSING THE DATA FROM UI TO CONTROLLER
	 * =====================================
	 * EXAMPLE:::1
	 * 1.create a method and give a pass the @Requestparam in it
	 * 2.Give in it "key" value and "datatype" and "local variable"
	 *              ("empname"),      (String)        (name)
	 * 3.key is nothing but an object with this object we need to pass the data then will comes to the browser
	 * http://localhost:8080/showdash?empname=RAMIt
	 * 
	 *              
	 *EXAMPLE:::2
	 *
	 *Take two HTMl's give a input box and (home.html)
	 *Whenever we pass the data in input box 
	 *then it will go to the showmvc.html
	 *http://localhost:8080/showdash?empname=RAMIt
	 *                                        |||             
	 *                                        (like this we need give the name then will come to browser)
	 *                                        (by using form action)
	 *              
	 *             
	 * */
	@RequestMapping(value="/data")
	public String showdashboard(){
		return "home";
	}
	@RequestMapping(value="/showdash")
	public String showsendeddata(@RequestParam("empname")String name,Model model) {
		model.addAttribute("empname",name);
		return "showmvc";
	}
	
	
	
}
