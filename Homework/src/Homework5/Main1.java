public class Main1 {
    public static void main(String[] args) {

        City c1 = new City();
        c1.name = "Yerevan";
        c1.population = 1100000;


        City c2 = new City();
        c2.name = "Moscow";
        c2.population = 12600000;

        City c3 = new City();
        c3.name = "New York";
        c3.population = 8400000;

        City c4 = new City();
        c4.name = "Paris";
        c4.population = 12000000;


        Rectangle rec = new Rectangle();
        int area = rec.calculateArea(5, 14);
        System.out.println(area);


        Employee boy1 = new Employee();
        boy1.id = 1;
        boy1.name = "Arayik";
        boy1.department = "First Department";
        boy1.age = 18;
        boy1.gender = "Male";
        boy1.printEmployee();

        Employee boy2 = new Employee();
        boy2.id = 2;
        boy2.name = "Rob";
        boy2.department = "First Department";
        boy2.age = 18;
        boy2.gender = "Male";
        boy2.printEmployee();

        Employee girl = new Employee();
        girl.id = 3;
        girl.name = "Rubina";
        girl.department = "Second Department";
        girl.age = 20;
        girl.gender = "Female";
        girl.printEmployee();



        Car car1 = new Car();
        car1.model = "Mercedes C203";
        car1.color = "Black";
        System.out.println(car1.stopEngine());

        Car car2 = new Car();
        car2.model = "Mercedes S505";
        car2.color = "White";
        System.out.println(car2.startEngine());


    }
}


//Problem1
class Dog {
}


class Cat {
}


class Horse {
}


//Problem4

/**
 * author Slav
 * Ստեղծել Yerevan, Moscow, New York , Paris քաղաքները համապատասխան
 * մարդաքանակով ։
 */
class City {
    public String name;
    public int population;

}

//Problem 5

/**
 * author Slav
 * Սահմանել Rectangle class : fields (length, width ) , methods ( calculateArea() ) .
 * Ստեղծել ուղղանկյուն (բարձրություն 5, լայքն 14) և հաշվել ուղղանկյան
 * մակերեսը
 */
class Rectangle {
    public int width;
    public int length;

    public int calculateArea(int width, int length) {

        return width * length;

    }

}


//Problem 6
/**
 * author Slav
 *Սահմանել Address class : fields (country , region, city , street, house ) .
 * Սահմանել Bank class : fields (bankName, address (type Address)) .
 */
class Address {
    public String country;
    public String region;
    public String city;
    public String street;
    public String house;

}

class Bank {
    public String bankName;
    public Address address;

}

//Problem 7


class Employee{
    public int id;
    public String name;
    public String department;
    public int age;
    public String gender;

    public void printEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(department);
        System.out.println(age);
        System.out.println(gender);

    }

}

//Problem 8
class Car {

    public String model;
    public String color;
    public double currentSpeed = 0.0;
    public boolean isEngineStart;


    public boolean stopEngine() {
        return isEngineStart = false;
    }

    public boolean startEngine() {
        return isEngineStart = true;
    }

}

