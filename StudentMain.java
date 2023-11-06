/*Scenario: Student Management System

You are developing a student management system for a school. The system needs to store and manage student records using an ArrayList. Each student record contains information such as student ID, name, age, and a list of courses the student is enrolled in.

Question:

You are tasked with implementing the student management system using ArrayLists. Define a class named Student to represent a student. The class should have the following attributes:

studentId: an integer representing the student's ID.
name: a string representing the student's name.
age: an integer representing the student's age.
courses: an ArrayList of strings representing the courses the student is enrolled in.

Implement a class named StudentManagementSystem that manages student records using an ArrayList of Student objects. This class should have the following methods:

void addStudent(Student student): Adds the given Student to the system's records. If a student with the same ID already exists, print an error message.
void removeStudent(int studentId): Removes the Student with the given ID from the records. If the student doesn't exist, print an error message.
Student findStudent(int studentId): Finds and returns the Student with the given ID. If the student doesn't exist, return null.
void enrollStudentInCourse(int studentId, String course): Enrolls the student with the given ID in the specified course.
void displayStudentInfo(int studentId): Displays the information of the student with the given ID, including their name, age, and enrolled courses.

Implement a simple program that demonstrates the usage of the StudentManagementSystem class. Create a few Student objects, add them to the system, enroll students in courses, and display student information.
*/

import java.util.*;

class Student {
  int sid;
  String sname;
  int age;
  ArrayList<String> courses;

  Student(int sid, String sname, int age) {
    this.sid = sid;
    this.sname = sname;
    this.age = age;
    this.courses = new ArrayList<>();
  }

  public int getStudentId() {
    return sid;
  }

  public String getName() {
    return sname;
  }

  public int getAge() {
    return age;
  }

  public ArrayList<String> getCourses() {
    return courses;
  }

  public void entollInCourse(String course) {
    courses.add(course);
  }
}

class StudentManagementSystem {
  ArrayList<Student> students;

  public StudentManagementSystem() {
    students = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  /*void removeStudent(int studentId) {
    for (Student stu : students) {
      if (stu.sid == studentId) {
        students.remove(stu);
        System.out.println("removed successfully");
      }
    }
  }*/
  void removeStudent(int studentId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == studentId) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " removed successfully");
                return;
            }
        }
        System.out.println("Error: Student with ID " + studentId + " not found.");
    }

  void enrollStudentInCourse(int studentId, String course) {
    for (Student student : students) {
      if (student.getStudentId() == studentId) {
        student.entollInCourse(course);
      }
    }
  }

  void displayAll()
  {
     for (Student student : students) {
        System.out.println("Student Information");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Courses: " + student.getCourses());
      
    }
  }
  void displayStudentInfo(int studentId) {
    for (Student student : students) {
      if (student.getStudentId() == studentId) {
        System.out.println("Student Information");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Courses: " + student.getCourses());
      }
    }

  }
}

public class StudentMain {
  public static void main(String args[]) {
    StudentManagementSystem sms = new StudentManagementSystem();

    Student stu1 = new Student(1, "Karun", 12);
    Student stu2 = new Student(2, "Raj", 19);
    Student stu3 = new Student(3, "Ram", 13);
    Student stu4 = new Student(4, "Raghu", 14);
    Student stu5 = new Student(5, "Rajesh", 15);

    sms.addStudent(stu1);
    sms.addStudent(stu2);
    sms.addStudent(stu3);
    sms.addStudent(stu4);
    sms.addStudent(stu5);

    sms.enrollStudentInCourse(1, "Maths");
    sms.enrollStudentInCourse(1, "History");
    sms.enrollStudentInCourse(1, "Java");
    sms.enrollStudentInCourse(2, "Python");
    sms.enrollStudentInCourse(2, "Science");

    sms.enrollStudentInCourse(3, "Maths");
    sms.enrollStudentInCourse(4, "History");
    sms.enrollStudentInCourse(5, "Java");
    sms.enrollStudentInCourse(3, "Python");
    sms.enrollStudentInCourse(4, "Science");

   /* sms.displayStudentInfo(1);
    sms.displayStudentInfo(2);
    sms.displayStudentInfo(3);
    sms.displayStudentInfo(4);
    sms.displayStudentInfo(5);
    */
    // beforeremoving
    System.out.println("\n \n before removing \n \n");
    sms.displayAll();
    sms.removeStudent(1);
    // after removing
    System.out.println("\n \n after removing \n \n");
    sms.displayAll();
  }
}