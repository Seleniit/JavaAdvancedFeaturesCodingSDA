package OOP;

public class Task2_PersonStudentLecture {
    public static void main(String[] args) {
        Person person = new Person("Smart Guy","Somewhere here");
        Person student = new Student("Daytime study", 2022, 22222);
        Person stuff = new Lecturer("Math", 9999);
        Student newStudent = new Student("The Smartest", 2000, 3333);
        System.out.println(person + " and " + newStudent);
        System.out.println( student);
        System.out.println(stuff);
    }
}
