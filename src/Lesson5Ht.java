import java.util.Scanner;

public class Lesson5Ht {
    public static void main(String[] args) {
      /*  System.out.println("Задание1");//Не понял, как убрать  null из массива,если он заканчивается раньше
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов массиве");
        int a = scanner.nextInt();
        String mass[];
        mass = new String[a];
        if (a <= 0) {
            System.out.println("Error");
        } else {
            int i = 0;
            while (i < mass.length) {
                System.out.println("Введите слово, которое хотите добавить в массив. Для завершения введите 'exit'");
                String b = scanner.next();
                if ("exit".equals(b)) {
                    break;
                } else if (Arrays.asList(mass).contains(b)) {
                    break;
                } else {
                    mass[i] = b;
                    i++;
                }
            }
            System.out.println(Arrays.toString(mass));
        }*/


       /* System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String a = scanner.nextLine();
        System.out.println("Введите слово");
        String b=scanner.nextLine();
        System.out.println(a);
        a=a.replaceAll(","," ");
        String[] mass=a.split(" ");
        int c=0;
        for(int i=0;i<mass.length;i++)
        {
           if (mass[i].contains(b)){
               c=c+1;
           }
        }
        System.out.println("Содержится:"+c);*/

/*
        System.out.println("Задание 3"); // не получилось
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение либо слово");
        String polindrom = scanner.nextLine().replaceAll("\\s", "");
        int a = 0;
        for (int i = 0, j = polindrom.length()-1; i < j / 2; i++, j--) {
            char ipos = polindrom.charAt(i);
            char jpos = polindrom.charAt(j);

            if (ipos == jpos) a = a + 1;
        }
        if (a == (polindrom.length() / 2)) {
            System.out.println("Слово является полиндромом");
        } else {
            System.out.println("Слово не является полиндромом");
        }
*/

        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение либо слово");
        String predl = scanner.nextLine();

        String a=predl.substring(0,1).toUpperCase();
        String b=predl.substring(1).toLowerCase();

        System.out.println(a+b);

        System.out.println("Задание 5");//не понял

















    }
}
