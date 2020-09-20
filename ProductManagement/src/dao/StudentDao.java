package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	 int add(Student Student);
     int delete(Student Student);
     
     
      int delete(int Student);
     
      List<Student> getById(int class0);
      
      List<Student> getAll();
      
}
