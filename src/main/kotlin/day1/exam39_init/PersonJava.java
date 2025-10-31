package day1.exam39_init;

class PersonJava {
    private String name;
    private int age;

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person 객체가 생성되었습니다: " + name + ", " + age);
    }
}