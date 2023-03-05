package course2.lesson1;

import java.util.Arrays;

public class Main {

    public static Integer[] changeValue(Integer[] value) {
        value[0] = 99;
        return value;
    }

    public static void changePerson (Person person) {
        //person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
        System.out.println(person.toString());
    }

    public static void main(String[] args) {

        Integer[] value = {3,4};
        System.out.println(Arrays.toString(changeValue(value)));
        System.out.println(Arrays.toString(value));

        Person person = new Person();
        person.name = "Lyapis";
        person.surname = "Trubetskoy";

        changePerson(person);

        System.out.println(person.toString());


    }
}
