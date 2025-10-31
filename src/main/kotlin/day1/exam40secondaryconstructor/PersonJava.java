package day1.exam40secondaryconstructor;

class PersonJava {
    private String name;
    private int age;

    // 주 생성자
    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 부 생성자
    public PersonJava(String name) {
        this(name, 0); // 다른 생성자 호출
    }
}