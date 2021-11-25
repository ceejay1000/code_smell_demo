package com.ceejay;

public class Main {

    // Mysterious variables
    private Object u;
    //Bad examples
    int max=7;
    int students=7;


    ///////////////////////////////////////////////////////////////////////

    // Magic Variables
    //BAD
//    if(val === 38) console.log('congratulations!')
//    //CLEAN
//                const JACKPOT=38;
//    if(val === JACKPOT) console.log('congratulations!')

    //    Hide Implementations
    int[] productArr={};

    // good
    int[] products = {};


    Student s1 = new Student("1223-RUSS", "Yayra", "Gbagbe", "Swahili");
    String studentFirstName = s1.getFirstName();
    String studentLastName = s1.getLastName();
    String studentDepartment = s1.getDepartment();
    String studentId = s1.getId();

    public void getStudentInfo(String studentLastName, String studentFirstName, String studentDepartment, String studentId){


        // Magic String
        if (studentId == "1223-RUSS" && studentDepartment == "Swahili"){
            s1.setDepartment("Russian");
        }
    }

    // clean up
    public void changeStudentDepartment(Student student){
        // ...
    }





    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
    }
}
