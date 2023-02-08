import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pascDecisionTenth();
    }


    public static void firstTask() {
        Scanner sc = new Scanner(System.in);
        int number = 63;
        int botNum;
        do {
            botNum = (int) (Math.random() * 100);
            if (botNum < number) {
                System.out.println("Число меньшьше, попробуй ещё раз");
            } else if (botNum > number) {
                System.out.println("Число Больше, попробуй ещё раз");
            }
        } while (botNum != number);
        System.out.println("Вы угадали число " + botNum);
    }


    public static void pascDecisionOne() {
        //!!!Вывести все квадраты натуральных чисел, не превосходящие данного числа N.!!!
        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите число :");
//        int number = sc.nextInt();
//        // счетчик натуральных чисел
//        int counter = 0;
//        //переменная результата
//        int result;
//        do{
//            counter++;
//            result = counter * counter;
//            // если счетчик больше или равен загаданному числу, останавливаем программу
//            if(result >= number) {
//                break;
//            }
//            System.out.println(result);
//        } while(number >= counter);

        System.out.println("Введите число:");
        int number = sc.nextInt();
        int result = 1;
        for (int i = 1; result < number; i++) {
            result = i * i;
            System.out.println(result);
        }
    }


    public static void pascDecisionTwo() {
        //!!!Вывести на экран кубы чисел от A до B, которые вводит пользователь.!!!
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число A:");
//        int a = sc.nextInt();
//        System.out.println("Введите число Б:");
//        int b = sc.nextInt();
//        int counter = a;
//        int result;
//        while (counter <= b) {
//            result = counter * counter * counter;
//            System.out.println("Куб числа " + counter + " = " + result);
//            counter++;
//        }
        System.out.println("Введите число Б:");
        int b = sc.nextInt();
        System.out.println("Введите число А:");
        int result;
        for (int i = sc.nextInt(); i <= b; i++) {
            result = i * i * i;
            System.out.println("Куб числа " + i + " равен " + result);
        }
    }


    public static void pascDecisionThird() {
        // !!!Написать программу, которая возводит число в целочисленную степень. Число и степень вводятся с клавиатуры.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int number = sc.nextInt();
//        System.out.println("Введите степень:");
//        int degree = sc.nextInt();
//        int couner = 0;
//        int result = 1;
//        while (couner < degree){
//            result *= number;
//            couner++;
//        }
//        System.out.println(result);


        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("Введите степень:");
        int degree = sc.nextInt();
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= number;
        }
        System.out.println(result);
    }


    public static void pascDecisionFourth() {
        /*Используя цикл написать программу, которая выводит на экран таблицу значений функции
          y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. */
        double x = -5;
        double y;
        while (x <= 5){
            y = 5 - x * x / 2;
            System.out.println(x + "|" + y);
            x += 0.5;
        }
    }

    public static void pascDecisionFifth() {
        //!!!Вычислить факториал числа, которое ввел пользователь.!!!
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int number = sc.nextInt();
//        int count = 1;
//        int result = 1;
//        while (count < number + 1){
//            result *= count;
//            count++;
//        }
//        System.out.println(result);

        System.out.println("Введите число:");
        int number = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }


    public static void pascDecisionSixth() {
        //!!!Вывести на экран ряд чисел Фибоначчи, состоящий из N элементов. Значение N вводится с клавиатуры.!!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int num = sc.nextInt();
//        int fib1 = 0;
//        int fib2 = 1;
//        int fib3;
//        int count = 3;
//        System.out.print(fib1 + " " + fib2 + " ");
//        while (count < num + 1) {
//            fib3 = fib1 + fib2;
//            System.out.print(fib3 + " ");
//            fib1 = fib2;
//            fib2 = fib3;
//            count++;
//        }

        int num = sc.nextInt();
        int fib1 = 0;
        int fib2 = 1;
        int fib3;
        int count = 3;
        System.out.print(fib1 + " " + fib2 + " ");
        for (int i = 3; i <= num; i++) {
            fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }
    }

    public static void pascDecisionSeventh() {
        /* Возьмем любое натуральное число. Если оно четное - разделим его пополам, если нечетное - умножим на 3,
         прибавим 1 и разделим пополам. Повторим эти действия с вновь полученным числом. Гипотеза гласит,
         что независимо от выбора первого числа рано или поздно мы получим 1. */
        for (int i = 20; i <= 30; i++) {
            int j = i;
            do {
                if (j % 2 == 0) {
                    j /= 2;
                } else {
                    j = (j * 3 + 1) / 2;
                }
                System.out.print("|" + j + "|");
            } while (j != 1);
            System.out.println(" ");
        }
    }


    public static void pascDecisionEighth() {
        /* С клавиатуры вводится целое число. Определить, из каких цифр оно состоит, то есть вывести на экран
        отдельные цифры числа */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int num = sc.nextInt();
//        while (num > 0) {
//            System.out.println(num % 10);
//            num = num / 10;
//        }

        for (int i = sc.nextInt(); i > 0; ) {
            System.out.println(i % 10);
            i /= 10;
        }
    }


    public static void pascDecisionNinth() {
        //Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int num = sc.nextInt();
//        int sum = 0;
//        while (num > 0) {
//            if (num % 2 == 0) {
//                sum += num % 10;
//            }
//            num /= 10;
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int i = sc.nextInt(); i > 0;) {
            if (i % 2 == 0) {
                sum += i % 10;
            }
            i /= 10;
        }
        System.out.println(sum);
    }


    public static void pascDecisionTenth() {
        //!!!Написать программу, подсчитывающую количество четных и нечетных цифр числа.!!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int even = 0;
        int uneven = 0;
        while (num > 0) {
            if(num % 2 == 0) {
                even += 1;
            } else {
                uneven += 1;
            }
            num /= 10;
        }
        System.out.println("Четные: " + even);
        System.out.println("Нечетные: " + uneven);
    }


    public static void pascDecisionEleventh() {
        //Дано число. Найти сумму и произведение его цифр.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int num = sc.nextInt();
        int sum = 0;
        int mult = 1;
        while (num > 0) {
            sum += num % 10;
            mult *= num % 10;
            num /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + mult);
    }


    public static void pascDecisionTwelfth() {
        /*Дано целое число, состоящее из разных цифр. Определить, какая из цифр заданного числа больше,
         т. е. найти наибольшую цифру числа. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число :");
        int num = sc.nextInt();
        int max = 0;
        while (num > 0){
            if((num % 10) > max){
                max = num % 10;
            }
            num /= 10;
        }
        System.out.println(max);
    }


    public static void pascDecisionThirteenth() {
        //Найти сумму первой и последней цифр любого целого положительного числа.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int lastNumber = num % 10;
        int firstNumber = 0;
        while(num > 0) {
            firstNumber = num % 10;
            num /= 10;
        }
        System.out.println(firstNumber + lastNumber);
    }


    public static void pascDecisionFourteenth() {
        /*!!!Вводится число. Преобразовать его в другое число, цифры которого будут следовать в
             обратном порядке по сравнению с введенным числом. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int lastNumber;
        int finalNimber = 0;
        while (num > 0) {
            lastNumber = num % 10;
            finalNimber = (finalNimber * 10) + lastNumber;
            num /= 10;
        }
        System.out.println(finalNimber);
    }
}
