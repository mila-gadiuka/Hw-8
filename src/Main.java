import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] weightOne = new int[3]; // целочисленный массив
        weightOne[0] = 1;
        weightOne[1] = 2;
        weightOne[2] = 3;
        double[] weightTwo = {1.57, 7.654, 9.986}; // массив с дробными значениями
        int[] weightThree = {0, 1, 2};
    }

    public static void task2() {
        int[] weightOne = new int[3];
        weightOne[0] = 1;
        weightOne[1] = 2;
        weightOne[2] = 3;
        for (int i = 0; i < weightOne.length; i++) {
            if (i != weightOne.length - 1) {
                System.out.print(weightOne[i] + ", ");
            } else {
                System.out.print(weightOne[i]);
            }
        }
        System.out.println();
        double[] weightTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < weightTwo.length; i++) {
            if (i != weightTwo.length - 1) {
                System.out.print(weightTwo[i] + ", ");
            } else {
                System.out.print(weightTwo[i]);
            }
        }
        System.out.println();
        int[] weightThree = {0, 1, 2};
        for (int i = 0; i < weightThree.length; i++) {
            if (i != weightThree.length - 1) {
                System.out.print(weightThree[i] + ", ");
            } else {
                System.out.print(weightThree[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        int[] weightOne = new int[3];
        weightOne[0] = 1;
        weightOne[1] = 2;
        weightOne[2] = 3;
        for (int i = weightOne.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weightOne[i] + ", ");
            } else {
                System.out.print(weightOne[i]);
            }
        }
        System.out.println();
        double[] weightTwo = {1.57, 7.654, 9.986}; // массив с дробными значениями
        for (int i = weightTwo.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weightTwo[i] + ", ");
            } else {
                System.out.print(weightTwo[i]);
            }
        }
        System.out.println();
        int[] weightThree = {0, 1, 2};
        for (int i = weightThree.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weightThree[i] + ", ");
            } else {
                System.out.print(weightThree[i]);
            }
        }
        System.out.println();
    }
    public static void task4() {
        int[] weightOne = new int[3]; //кажется немного запуталась с выводом значений через запятую в этой задаче. в говолу ничего не приходит для решения этого вопроса
        weightOne[0] = 1;
        weightOne[1] = 2;
        weightOne[2] = 3;
        for (int i = 0; i != weightOne.length; i++) {
            if (i < weightOne.length) {
                if (weightOne[i] % 2 == 1) {
                    weightOne[i]++;
                }
                System.out.print(weightOne[i] + ", ");
            } else {
                    System.out.print(weightOne[i] + " ");
            }
        }
    }
}