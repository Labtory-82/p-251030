package day1.exam39_primaryconstructor;

class PersonJava {
    private String name;
    private int age;

    // 생성자
    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}