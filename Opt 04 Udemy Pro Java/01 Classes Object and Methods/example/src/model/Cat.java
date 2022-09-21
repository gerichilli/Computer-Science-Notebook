package model;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    public void meow() {
        // soutp
        System.out.println("Meow meow");
    }
}
