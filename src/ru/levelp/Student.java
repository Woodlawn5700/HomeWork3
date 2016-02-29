package ru.levelp;

/**
 * Created by pavelpetrov on 29.02.16.
 */
public class Student {
    String name;
    int age;
    boolean isFullTime;
    double avr;

    public static void print(Student[] students) {
        for (int i = 0; i < Main.studentNumber; i ++){
            System.out.println("Имя студента : " + students[i].name);
            System.out.println("Возраст студента : " + students[i].age);
            System.out.println("Средний бал студента : " + students[i].avr);
            System.out.println("Cтудент учится на дневном : " + students[i].name);
            System.out.println();
        }
    }
    public static Student[] abcBubbleSort(Student[] students){
        Algorithms compareArray  = new Algorithms();

        for (int i = 0 ; i < Main.studentNumber - 1; i ++){
            for (int j = 0; j < Main.studentNumber - 1 - i; j ++){
                int x = compareArray.compare(students[j].name, students[j+ 1].name);
                if (x == 1){
                     Student temp = new Student();
                    temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }


}
