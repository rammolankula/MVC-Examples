package MvcExampleCurd.Iserviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MvcExampleCurd.Iservice.Istudentservice;
import MvcExampleCurd.Repository.Mvcrepository;
import MvcExampleCurd.model.Student;
@Service
public class Studentserviceimpl implements Istudentservice{

	
	@Autowired
	private Mvcrepository mvcrepository;
	
	
	@Override
	public Integer saveMvcmodel(Student Student) {
		Student.getCost();
		return mvcrepository.save(Student).getId();
	}
	@Override
	public List<Student> findAll() {
		
     List<Student> list=	mvcrepository.findAll();	
     Collections.sort(list,
    		 (o1,o2)->o1.getId()-o2.getId());
	return list;
	}
	@Override
	public void deleteMvcmodel(Integer id) {
		mvcrepository.deleteById(id);
	}
	@Override
	public Student getoneMvcmodel(Integer integer) {
		Optional<Student> opt=mvcrepository.findById(integer);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	@Override
	public Student updateMvcmodel(Student mvcmodel) {
		mvcrepository.save(mvcmodel);
		return null;
	}
	

}
