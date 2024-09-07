package org.example;

public class Main {
    public static void main(String[] args) {
        Person aStudent = new Person("Max");
        Person aFriend = new Person("Zoe",22);
        aStudent.setFriend(aFriend);

        aStudent.sayName();
        aStudent.getFriend().sayName();
        aStudent.increaseAgeBy(5);
        aStudent.getFriend().increaseAgeBy(6);
        System.out.println("Student´s age is " + aStudent.getAge());
        System.out.println("Friend´s age ist " + aStudent.getFriend().getAge());
    }
}