package dz_22_10;

public class Main {
    public static void main(String[] args) {

        /*9. Создаем новый объект Cat и сразу задаем ему значения полей*/
        Cat barsik = new Cat("Барсик", 5);

        /*10. Вывод в консоль объекта класса Cat (т.е. того объекта, который мы создали*/
        System.out.println(barsik);

        /*Объявляем новую переменную barsikName, в которой будет лежат то, что там вернет геттер*/
        String barsikName = barsik.getName();

        /*По аналогии*/
        int barsikCount = barsik.getCount();

        /*4.1 Выводим значения полей*/
        System.out.println("Изначальное имя кота — " +barsikName);/*
                        либо можно System.out.println("Изначальное имя кота — " + barsik.getName());, но тогда не сможем
                        это в метод передать, т.к. это будет не переменная*/
        System.out.println("Изначальный count кота — " +barsikCount);

        /*4.2 Изменяем значение полей через сеттер*/
        barsik.setName("Василий");
        barsik.setCount("15");

        /*Выводим заново*/
        System.out.println("Новое имя кота — " + barsikName);
        System.out.println("Новый count кота — " +barsikCount);

        /*Вызываем метод, который выводит значения полей*/
//        output(barsikName, barsikCount);



        String stroka = toString("Барсик", 3, "fdfdf");
        System.out.println(stroka);

    }

    /*Добавляем метод, который будет выводить строку с полями класса*/
    public static String toString(String barsikName, int barsikCount, String stroka){
        stroka = barsikName + " " + barsikCount;
        return stroka;
    }

//    /*Метод, который будет выводить значения полей*/
//    public static void output(String barsikName, int barsikCount){
//        System.out.println(barsikName);
//        System.out.println(barsikCount);
//    }
}

