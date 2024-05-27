public class Main {
    public static void main(String[] args) {
        // Створення об'єктів за допомогою різних конструкторів
        Person person1 = new Person();
        Person person2 = new Person("Анна ");
        Person person3 = new Person("Петро", "Кузьменко", 30, 1.80);

        // Виведення інформації про об'єкти
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();


    }
}