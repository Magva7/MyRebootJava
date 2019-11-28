package dz_22_10;

/*Создаем новый класс Cat*/
public class Cat{
    String name;
    int count;

    /*Создаем конструктор без параметров*/
    public Cat(){
        System.out.println(name + " " + count);
    }

    /*Создаем конструктор, который будет задавать значения полям*/
    public Cat(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /*For update*/
    /*Создаем геттер, который будет выводить значения поля name*/
    public String getName(){
        return name;
    }

    /*Создаем геттер, который будет выводить значения поля count*/
    public int getCount(){
        return count;
    }

    /*Создаем сеттер, который будет задавать значение полю name*/
    public void setName (String name){
        this.name = name;
    }

    /*Создаем сеттер, который будет задавать значение полю count*/
    public void setCount (String count){
        this.name = count;
    }
}
