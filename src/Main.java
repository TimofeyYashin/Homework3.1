public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний!");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать!");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int airTemperature = 3;
        if (airTemperature < 5) {
            System.out.println("«На улице " + airTemperature + " градусов, нужно надеть шапку!");
        }
        else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки!");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 90;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф!");
        }
        else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно!");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 8;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора спать!");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад!");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу!");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " ,то его место в университете!");
        }
        if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора ходить на работу!");
        }
        if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + " ,то он может отдохнуть!");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 60;
        boolean adult = false;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ",то ему нельзя кататься на атракционе!");
        }
         if (age >= 5 && age < 14 && adult) {
            System.out.println("Если возраст ребенка равен " + age + ",то ему можно кататься только в сопровождении взрослого!");
        }
         else if (age >= 5 && age < 14 ) {
             System.out.println("Если возраст ребенка равен " + age + ",а взрослого нет, кататься нельзя!");
         }
         else if (age >= 14) {
             System.out.println("Если возраст ребенка равен " + age + ", кататься можно одному!");
         }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int place = 102;
        int seat = 60;
        int standingPlace = 42;
        if ( seat < 60 && standingPlace < 42) {
            System.out.println("Есть и сидячие места и стоячие места");
        }
        else if (seat < 60) {
            System.out.println("Ecть сидячие места");
        }
        else if (standingPlace < 42) {
            System.out.println( "Есть стоячие места");
        }
        else  {
            System.out.println("Мест нет");
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one = 98;
        int two = 900;
        int three = 9000;
        if (one > two && one > three) {
            System.out.println("Число one = " + one + " больше!");
        }
        if (two > one && two > three) {
            System.out.println("Число two = " + two + " больше!");
        }
        else if (three > one && three > two) {
            System.out.println("Число three = " + three + " больше!");
        }
    }
}

