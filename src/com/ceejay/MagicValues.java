package com.ceejay;

import java.util.List;

public class MagicValues {


    List<Student> newStudents = List.of(
            new Student("1234-xxx", "Bob", "Johnson", "Meteorology"),
            new Student("1232-xxx", "Grace", "Nkwantebisa", "Herbal Medicine"),
            new Student("1212-xxx", "Trish", "Johnson", "Anthropology")
    );

    // Calculate Student average
    Student s1 = new Student("123-zz", "Sam", "Wilson", "Science");
    double totalGrades = s1.getTotalGrades();
    int totalSubjects = s1.getGrades().size();
    double studentAverageGrade = totalGrades / totalSubjects;

   public void calculateStudentAverage(){
       if (studentAverageGrade > 90){
           System.out.println("Wonderful, well done :)");
       } else {
           System.out.println("Better luck next time :/");
       }
   }

   public String checkClassCapacity(){
       if (newStudents.size() == 3){
           return "Class is full";
       } else {
           return "Vacancy available";
       }
   }

//   public String checkClassCapacity2(){
//       if (newStudents.size() == 3){
//           return "Class is full";
//       }
//
//       return "Vacancy available";
//
//   }
}
