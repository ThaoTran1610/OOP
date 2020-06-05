package StudentManageOOP;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MenuStudentManage {
    static int quantityStudent;
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> listStudent = new ArrayList<>();
    static Object Comparator;

    public static void Menu(){
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student by ID");
        System.out.println("3. Delete Student by ID");
        System.out.println("4. Sort Student by GPA");
        System.out.println("5. Sort Student by Name");
        System.out.println("6. Show Student");
        System.out.println("0. Exit");
    }

    public static void Back(){
        Menu();
        ChooseOption();
    }
    //Add Student
    public static void AddStudent() {
        System.out.print("Input quantity of Students: ");
        quantityStudent = input.nextInt();

        for (int i = 1; i <= quantityStudent; i++) {
            System.out.println("- Student "+i);
            System.out.println("id: ");
            input.skip("\\n+");
            String id = input.nextLine();
            System.out.println("Name: ");
            String name = input.nextLine();
            System.out.println("Age: ");
            int age = input.nextInt();
            System.out.println("Address: ");
            input.skip("\\n+");
            String address = input.nextLine();
            System.out.println("GPA: ");
            Double gpa = input.nextDouble();

            listStudent.add(new Student(id,name,age,address,gpa));
        }
        Back();
    }
    //Edit Student
    public static void EditStudentByID() {
        System.out.println("Input the ID of student which want to edit: ");
        input.skip("\\n+");
        String id = input.nextLine();

        for (int i = 0; i < listStudent.size(); i++) {
            if (id.equals(listStudent.get(i).getId())) {
                listStudent.get(i).Output();
                System.out.println("What do you want to change: ");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Address");
                System.out.println("4. GPA");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Input new Name: ");
                        input.skip("\\n+");
                        String name = input.nextLine();
                        listStudent.get(i).setName(name);
                        listStudent.get(i).Output();
                        break;
                    case 2:
                        System.out.println("Input new Age: ");
                        int age = input.nextInt();
                        listStudent.get(i).setAge(age);
                        listStudent.get(i).Output();
                        break;
                    case 3:
                        System.out.println("Input new Address: ");
                        input.skip("\\n+");
                        String address = input.nextLine();
                        listStudent.get(i).setAddress(address);
                        listStudent.get(i).Output();
                        break;
                    case 4:
                        System.out.println("Input new GPA: ");
                        input.skip("\\n+");
                        Double gpa = input.nextDouble();
                        listStudent.get(i).setGpa(gpa);
                        listStudent.get(i).Output();
                        break;
                }
            }
            Back();
        }
    }
    //Delete Student by ID
    public static void DeleteStudentByID() {
        System.out.println("Input the ID of student which want to edit: ");
        input.skip("\\n+");
        String id = input.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if (id.equals(listStudent.get(i).getId())) {
                listStudent.remove(listStudent.get(i));
            }
        }
        Back();
    }
    //Sort Student by GPA
    public static void SortStudentByGPA() {
        listStudent.sort(Student::compare);
        ShowStudent();
        Back();
    }
    //Sort Student by Name
    public static void SortStudentByName() {
        Collections.sort(listStudent, new Comparator<Student>(){
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
        });
        ShowStudent();
    }
    //Show Student
    public static void ShowStudent() {
        for (int i = 0; i < listStudent.size(); i++) {
            Student students = listStudent.get(i);
            System.out.println("Student "+i+" : ID: "+students.getId()+" - Name: "+students.getName()+" - Age: "+students.getAge()+" - Address: "+students.getAddress()+" - GPA: "+students.getGpa());
        }
        Back();
    }
    //Choose Option
    public static void ChooseOption() {
        int a;
        a = input.nextInt();
        switch (a) {
            case 1:
                AddStudent();
                break;
            case 2:
                EditStudentByID();
                break;
            case 3:
                DeleteStudentByID();
                break;
            case 4:
                SortStudentByGPA();
                break;
            case 5:
                SortStudentByName();
                break;
            case 6:
                ShowStudent();
                break;
           /* case 0:
                MethodExitEvent();
                break;*/
        }
    }
    //Main
    public static void main(String[] args){
        Menu();
        ChooseOption();
    }
}
