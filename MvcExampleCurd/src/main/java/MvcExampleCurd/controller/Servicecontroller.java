package MvcExampleCurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import MvcExampleCurd.Iservice.Istudentservice;
import MvcExampleCurd.model.Student;

@Controller
public class Servicecontroller {
	
	@Autowired
	Istudentservice service;
	/*For getting the page of student registration*/
	@GetMapping("/get")
	public String getPage() {
		return "Student";
	}
    /*for saving*/
	@PostMapping("/save")
	public String saveMvcModel(@ModelAttribute Student student,Model model) {
	Integer id=	service.saveMvcmodel(student);
	model.addAttribute("mvcmodel","data saved successfulluy"+id);
		return "Student";
		}
	@GetMapping("/display")
	public String displayData(@ModelAttribute Student student,Model model) {
		List<Student> list=service.findAll();
		model.addAttribute("list",list);
		return "Studentdisplay";
	}
	@GetMapping("/delete")
	public String deletedData(@RequestParam Integer id,Model model) {
		service.deleteMvcmodel(id);
		List<Student> list=service.findAll();
		model.addAttribute("list",list);
		model.addAttribute("service"+"data'"+id+"'deleted");
		return "Studentdisplay";
	}
	@GetMapping("/edit")
	public String editData(@RequestParam Integer id,Model model) {
		Student student=service.getoneMvcmodel(id);
		model.addAttribute("mvcmodel",student);
		return "Studentedit";
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student student,Model model) {
		service.updateMvcmodel(student);
		List<Student> list=service.findAll();
		model.addAttribute("list",list);
		model.addAttribute("data"+"updated'"+list+"'successfully");
		return "Studentdisplay";
		
	}
}