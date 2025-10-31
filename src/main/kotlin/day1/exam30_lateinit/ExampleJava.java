package day1.exam30_lateinit;

class ExampleJava {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        if (value == null) {
            throw new IllegalStateException("Value is not initialized");
        }
        return value;
    }

    public static void main(String[] args) {
        ExampleJava example = new ExampleJava();
        example.setValue("Hello, Kotlin!");
        System.out.println(example.getValue());
    }
}