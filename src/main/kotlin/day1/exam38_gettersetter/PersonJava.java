package day1.exam38_gettersetter;

class PersonJava {
    private String name; // private 변수

    public PersonJava(String name) { // 생성자
        this.name = name;
    }

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
}