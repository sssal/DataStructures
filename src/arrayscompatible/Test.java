package arrayscompatible;

public class Test {
    public static void main(String[] args){
        Person[] arr = new Employee[5];
        arr[0] = new Student();
    }
}

class Person{
}

class Employee extends Person{

}

class Student extends Person{

}
