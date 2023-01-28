package org.test;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Calle Falsa 123");
        Animal animal = new Animal("Firulais", address, 5);
        Animal animal2 = new Animal(animal.name, animal.address, animal.age);
        animal2.name = "Rex";
        animal2.address.street = "Calle Falsa 456";
        animal2.age = 10;
        System.out.println(animal.name);
        System.out.println(animal.address);
        System.out.println(animal.age);

        System.out.println(animal2.name);
        System.out.println(animal2.address);
        System.out.println(animal2.age);

        System.out.println(animal);
        System.out.println(animal2);
    }
}
