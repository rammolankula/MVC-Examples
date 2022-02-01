package MvcExampleCurd.Iservice;

import java.util.List;

import MvcExampleCurd.model.Student;

public interface Istudentservice {
	
	public Integer saveMvcmodel(Student student);
	
	public void deleteMvcmodel(Integer id);
	
	public List<Student> findAll();
	
	public Student getoneMvcmodel(Integer integer);
	
	public Student updateMvcmodel(Student student);

}
