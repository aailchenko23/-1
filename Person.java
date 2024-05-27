public class Person {
    public String name;
    public String lastname;
    public int age;
    public double height;
    // Конструктор з 4 параметрами

    public Person(String name, String lastname, int age, double height) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
    }
    // Конструктор без параметрів
    public Person() {
        name = "Анна";
        lastname = "Кузь";
        age = 25;
        height = 1.75;
    }
        // Конструктор з одним параметром
    public Person(String name) {
        this.name = name;
        age = 18;
        height = 1.70;
    }
        // Метод для виведення інформації про об'єкт
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Last name:"+ lastname);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height);
    }
}
