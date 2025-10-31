//package day1.exam34_inheritance;
//
//class Animal {
//    void makeSound() {
//        System.out.println("Animal sound");
//    }
//}
//
//interface Pet {
//    default void makeSound() {
//        System.out.println("Pet sound");
//    }
//}
//
//class Dog extends Animal implements Pet {
//    @Override
//    public void makeSound() {
//        Animal.super.makeSound(); // 특정 인터페이스의 메서드 호출
//    }
//}