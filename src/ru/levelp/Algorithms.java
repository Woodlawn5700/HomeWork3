package ru.levelp;

/**
 * Created by pavelpetrov on 29.02.16.
 */
public class Algorithms {
    public int compare(String a, String b) {
        char[] arrayA = new char[a.length()];
        arrayA = a.toCharArray();
        char[] arrayB = new char[b.length()];
        arrayB = b.toCharArray();
        int x = 0;
        if (a.equals(b)) {
            x = 0;
        }

        else {
            if (arrayA.length <= arrayB.length) {

                for (int i = 0; i < arrayA.length; i++) {
                    if (arrayA[i] < arrayB[i]) {
                        x = -1;
                        break;

                    } else if (arrayA[i] > arrayB[i]) {
                        x = 1;
                        break;
                    }
                    if (arrayA[arrayA.length - 1] == arrayB[arrayA.length - 1]) {
                        if (arrayA.length > arrayB.length) {
                            x = 1;
                            break;
                        } else {
                            x = -1;
                            break;
                        }
                    }
                }
            }

            else {
                for (int i = 0; i < arrayB.length; i++) {

                    if (arrayA[i] < arrayB[i]) {
                        x = -1;
                        break;
                    }
                    else if (arrayA[i] > arrayB[i]) {
                        x = 1;
                        break;
                    }
                    else
                        x = 1;

                }
            }
        }

        return x;
    }
}
