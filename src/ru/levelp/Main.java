package ru.levelp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pavelpetrov on 29.02.16.
 */
//2) Создать класс Algorithms с двумя методами:
//        НЕ ПРИМЕНЯТЬ СТАНДАРТНЫЕ МЕТОДЫ СРАВНЕНИЯ СТРОК И СОРТИРОВКИ
//        1. public int compare(String a, String b)
//        возвращает -1, если строка a раньше по алфавиту, чем b
//        0, если строки a и b одинаковы
//        1, если строка b раньше, чем a
//        Уровни сложности (рекомендуется выполнять в этом порядке):
//        * Сортировка только по первой букве
//        ** Сортировка по всем буквам с учетом длины
//        Алексей             Алекс
//        Алекс       ->      Александр
//        Александр           Алексей
//        2. public Student[] abcBubbleSort(Student[] students)
//        получает массив студентов,
//        сортирует его по алфавиту,
//        возвращает отсортированные массив
//        3) Вывод студентов на экран всегода в отсортированном по алфавиту
//        (по имени) виде
public class Main {
    public static int studentNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student[] students = new Student[3];

        while (true) {

            System.out.println("1 - добавть студетна");
            System.out.println("2 - вывести на экран");
            System.out.println("3 - выйти из программы ");
            int unswer = Integer.parseInt(reader.readLine());

            if (unswer == 1) {

                students[studentNumber] = new Student();
                System.out.println("Введите Имя");
                students[studentNumber].name = reader.readLine();
                System.out.println("Введите Age");
                students[studentNumber].age = Integer.parseInt(reader.readLine());
                System.out.println("Введите Срелний бал");
                students[studentNumber].avr = Double.parseDouble(reader.readLine());
                System.out.println("Введите находится ли студент на очном (true / false)");
                String fullday = reader.readLine();
                if (fullday.equals("true")) {

                    students[studentNumber].isFullTime = true;

                } else {

                    students[studentNumber].isFullTime = false;
                }
                studentNumber++;

            }

            if (unswer == 2) {
                students = Student.abcBubbleSort(students);
                Student.print(students);
            }

            if (unswer == 3)
                break;

        }
    }
}
