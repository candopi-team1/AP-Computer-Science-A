public class ClassReuse
{

   public  static void main(String args[]) {
      Professor  headProf  = new  Professor("John", 99900.00);
      Department phyDept = new Department("Physics", headProf);


      Professor  prof1 = new  Professor("Jack", 7000.00);
      Professor  prof2 = new  Professor("Jane", 9030.00);
      Professor[] profs = { prof1, prof2 }; 
      phyDept.setProfessors(profs);



      Student  stu1 = new  Student("Alan", 4.00);
      Student  stu2 = new  Student("Alice", 2.50);
      Student[]  stus = {stu1, stu2};      
      phyDept.setStudents(stus);

     System.out.println(phyDept.getProfessors()[0].getName()        );
  }

}

///////////////////
class Professor
{
 private String name;
 private double salary;

 public Professor(String newName, double newSalary)
 {
   name = newName;
   salary = newSalary;
 }

 public String getName()
 {
    return name;
 }

 public double getSalary()
 {
    return salary;
 }

}

////////////////////
class Student
{

 private String name;
 private double gpa;


 public Student(String newName, double newGpa)
 {
    name = newName;
    gpa = newGpa;
 }

 public String getName()
 {
    return name;
 }

 public double getGpa()
 {
    return gpa;
 }

 
 public void setGpa(double newGpa)
 {
   gpa = newGpa;
 }

}

///////////////////////////
class Department
{
 private String name;
 private Student[] students;
 private Professor[] professors;
 private Professor head;


 public Department(String newName, Professor head)
 {
    name = newName;
    head = head;
 }
 public String getName()
 {
    return name;
 }

 public Professor[] getProfessors()
 {
    return professors;
 }


 public void setProfessors(Professor[] profs)
 {
    professors = profs;
 }


 public Student[] getStudents()
 {
    return students;
 }


 public void setStudents(Student[] stus)
 {
    students = stus;
 }

 public Professor getHead()
 {
    return head;
 }

 
 public void setHead(Professor newHead)
 {
   head = newHead;
 }

}

