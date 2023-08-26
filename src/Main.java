import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1i2();
        task3();
        task4();

    }

    public static void task1i2() {
        System.out.println("Задача 1.2");
        int[] number = new int[]{1, 2, 3};

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[0] + ",");
        System.out.print(number[1] + ",");
        System.out.println(number[2]);
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumber.length - 1; i++) {
            System.out.print(fractionalNumber[i] + ",");
        }
        System.out.print(fractionalNumber[fractionalNumber.length - 1]);

        System.out.println();
        int[] integerArray = {24, 48, 72, 96, 120};

        for (int i = 0; i < integerArray.length - 1; i++) {
            System.out.print(integerArray[i] + ", ");
        }
        System.out.println(integerArray[integerArray.length - 1]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[]{1, 2, 3};

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length - 1; i > -1; i--) {
            System.out.print(number[i] + ", ");
        }
        System.out.println();

        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = fractionalNumber.length - 1; i > -1; i--) {
            if (i == fractionalNumber.length - 1) {
                System.out.print(fractionalNumber[i] + ",");
            } else {
                System.out.print(fractionalNumber[i] + " ");
            }


        }
        System.out.println();

        int[] integerArray = {24, 48, 72, 96, 120};
        for (int i = integerArray.length  -1; i > -1; i--) {
            if (i == integerArray.length - 1) {
                System.out.print(integerArray[i] + ",");
            } else {
                System.out.print(integerArray[i] + " ");
            }
        }
        System.out.println();
// неполучается вывести запятые как сказанно в условии

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
        number[0] = 7;
        number[1] = 3;
        number[2] = 1;
        for (int i = 0; i <number.length; i++)


            System.out.println(number[i] + 1);






    }



}