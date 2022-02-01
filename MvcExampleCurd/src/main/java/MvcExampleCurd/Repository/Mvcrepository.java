package MvcExampleCurd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MvcExampleCurd.model.Student;

public interface Mvcrepository extends JpaRepository<Student, Integer> {

}
