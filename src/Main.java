import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая раота №2! Теория\n");

//        Задача 1.
//        Напишите методы Equals and HashCode для класса Student,
//        который состоит из полей String name и int age.

//        Задача 2.
//        Напишите Java-программу для итерации объекта типа HashMap с
//        использованием цикла while и улучшенного цикла for.

        Map<String, String> studentsList = new HashMap<>();

        studentsList.put("Артем", "Павленко");
        studentsList.put("Сергей", "Иванов");
        studentsList.put("Виктор", "Петров");
        studentsList.put("Максим", "Сидоров");
        studentsList.put("Юрий", "Мирошниченко");

        Iterator iterator = studentsList.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Map.Entry<String, String> entry : studentsList.entrySet()) {
            System.out.println(entry);
        }

    }
}