package com.Kasun.Enterprices.First.Project.Service.IMPL;

import com.Kasun.Enterprices.First.Project.DTO.Entity.Student;
import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.DTO.ResponseDTO.ResponseStudentDTO;
import com.Kasun.Enterprices.First.Project.Repo.StudentRepo;
import com.Kasun.Enterprices.First.Project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public String saveStudent(RequestStudentDTO dto) {

      Student student = new Student(
       dto.getFullName(),
       dto.getAge(),
       dto.getNic()
      );

      studentRepo.save(student);

        return dto.getFullName();
    }


    public List<ResponseStudentDTO> getAllStudent() {
        ArrayList<ResponseStudentDTO> arrayList = new ArrayList<>();

      List<Student> students = studentRepo.findAll();
      for (Student s : students){
        arrayList.add(
                new ResponseStudentDTO(
                    s.getName(),
                    s.getAge(),
                    s.getNic()
                )
        );
      }

        return arrayList;
    }


    public String deleteStudent(long id) {
        Optional<Student> student= studentRepo.findById(id);
        if (student.isEmpty()){
            throw new RuntimeException("Student Dosnt Exist");
        }
        studentRepo.delete(student.get());
        return student.get().getName();
    }


    public String updateStudent(RequestStudentDTO dto, long id) {
        Optional<Student> student= studentRepo.findById(id);
        if (student.isEmpty()){
            throw new RuntimeException("Student Dosnt Exist");
        }
        student.get().setName(dto.getFullName());
        student.get().setAge(dto.getAge());
        student.get().setNic(dto.getNic());

        studentRepo.save(student.get());

        return dto.getFullName();
    }
}
