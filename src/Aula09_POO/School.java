package Aula09_POO;

import java.util.ArrayList;
import java.util.List;

public class School {

   private String schoolName;
   private List<Student> studentsEnrolled = new ArrayList<>();
   private List<Employee> employees = new ArrayList<>();
   private List<Teacher> teachersHired = new ArrayList<>();

   public School(String schoolName){
      this.schoolName = schoolName;
   }

   public void addStudent(Student student){
      for (Student s : studentsEnrolled){
         if (s.checkCPF(student.getCPF()))
            return;
      }
      this.studentsEnrolled.add(student);
   }

   public void removeStudent(String CPF){
      for (Student s : studentsEnrolled) {
         if (s.checkCPF(CPF)) {
            this.studentsEnrolled.remove(s);
         }
      }
   }

   public void updateStudent(String CPF, Student student){
      for (Student s : studentsEnrolled){
         if (s.checkCPF(CPF)){
            s = student;
         }
      }
   }

   public void studentData(String CPF){
      for(Student s : studentsEnrolled){
         if (s.checkCPF(CPF))
            System.out.println(s.toString());
      }
   }
   public void listStudents(){
      for(Student s : studentsEnrolled)
         System.out.println(s.toString());
   }

   public void addTeacher(Teacher teacher){
      for (Teacher t : teachersHired){
         if (t.checkCPF(teacher.getCPF()))
            return;
      }
      this.teachersHired.add(teacher);
   }

   public void removeTeacher(String CPF){
      for (Teacher t : teachersHired) {
         if (t.checkCPF(CPF))
            this.teachersHired.remove(t);
      }
   }

   public void updateTeacher (String CPF, Teacher teacher){
      for (Teacher t : teachersHired){
         if (t.checkCPF(CPF)){
            t = teacher;
         }
      }
   }

   public void teacherData(String CPF){
      for(Teacher t: teachersHired){
         if (t.checkCPF(CPF))
            System.out.println(t.toString());
      }
   }
   public void listTeachers(){
      for(Teacher t: teachersHired)
         System.out.println(t.toString());
   }

   public void addEmployee(Employee employee){
      for (Employee e : employees){
         if (e.checkCPF(employee.getCPF()))
            return;
      }
      this.employees.add(employee);
   }

   public void removeEmployee(String CPF) {
      for (Employee e : employees) {
         if (e.checkCPF(CPF))
            this.employees.remove(e);
      }
   }

   public void updateEmployee(String CPF, Employee employee){
      for (Employee e : employees){
         if (e.checkCPF(CPF)){
            e = employee;
         }
      }
   }

   public void employeeData(String CPF){
      for(Employee e : employees){
         if (e.checkCPF(CPF))
            System.out.println(e);
      }
   }

   public void listEmployees(){
      for(Employee e: employees)
         System.out.println(e.toString());
   }

}