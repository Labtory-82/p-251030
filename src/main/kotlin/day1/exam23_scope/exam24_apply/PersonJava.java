package day1.exam23_scope.exam24_apply;

class PersonJava {
    String name;
    int age;

    public PersonJava setName(String name) {
        this.name = name;
        return this;
    }

    public PersonJava setAge(int age) {
        this.age = age;
        return this;
    }

    public void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        PersonJava person = new PersonJava()
                .setName("Alice")
                .setAge(30);
        person.printInfo();
    }
}