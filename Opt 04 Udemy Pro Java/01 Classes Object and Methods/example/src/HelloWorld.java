import model.Cat;
import model.Person;

import java.time.LocalDate;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        Person nhi = new Person("Nhi", "Thui", LocalDate.of(1999,10,29));
        Person jimin = new Person("Ji", "Min", LocalDate.of(1999,10,29));
        nhi.setSpouse(jimin);

        Cat beiu = new Cat("beiu", LocalDate.of(2020, 3, 1));
        nhi.setPet(beiu);

        System.out.println(nhi.toString());

        beiu.meow();
    }
}
