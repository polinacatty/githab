public class Main
{
    public static int fact(int n){
        if (n == 1)
            return n;
        return n*fact(n-1);
    }

    public static void table(){
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
            System.out.println("\n");
        }
    }

    public static int sum(int n){
        int s = 0;
        while (n>0) {
            s = s + n%10;
            n = n/10;
        }
        return s;
    }

    public static boolean isLeapYear(int year) {
        if (year%4 == 0 & !(year%100 == 0 & !(year%400 == 0)))
            return true;
        return false;
    }

    public static int daysInYear(int year) {
        if (isLeapYear(year))
            return 366;
        return 365;
    }

    public static int dayOfTheWeek(String n){
        if (n.equals("Понедельник"))
            return 1;
        if (n.equals("Вторник"))
            return 2;
        if (n.equals("Среда"))
            return 3;
        if (n.equals("Четверг"))
            return 4;
        if (n.equals("Пятница"))
            return 5;
        if (n.equals("Суббота"))
            return 6;
        if (n.equals("Воскресенье"))
            return 7;
        return 0;
    }

    public static void printArray(int[] array){
        System.out.print("[");
        for(int j = 0; j < array.length-1; j++) {
            System.out.print(array[j]+", ");
        }
        System.out.println(array[array.length-1] + "]");
    }

    public static void printArray(int[][] array){
        for(int j = 0; j < array.length; j++) {
            printArray(array[j]);
        }
    }

    public static int[] sort(int[] array){
        for (int i = array.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(array[j] > array[j + 1]) {
                    int v = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = v;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Вторник"));

        int[] array1D = {1,5,3,7,1,9,0,-2,-40,89};
        System.out.println("Вывод массива:");
        printArray(array1D);
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));
        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}, {7, 5, 5, 5}, {6, 7, 5, 4, 78}};
        printArray(array2D);
    }
}