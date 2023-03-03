package course2.lesson2;

public class PrintService {

    public void print(Gryffindor[] gryffindorStudents, String name, String surname) {
        System.out.println("Gryffindor:");
        System.out.println("--------------------");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] != null & gryffindorStudents[i].getStudentSurname().equals(surname) & gryffindorStudents[i].getStudentName().equals(name)) {
                System.out.println("Student Name: " + gryffindorStudents[i].getStudentName());
                System.out.println("Student Surname: " + gryffindorStudents[i].getStudentSurname());
                System.out.println("Power of Magic: " + gryffindorStudents[i].getPowerOfMagic());
                System.out.println("Distance of Apparition: " + gryffindorStudents[i].getDistanceOfApparition());
                System.out.println("Nobility: " + gryffindorStudents[i].getNobility());
                System.out.println("Honor: " + gryffindorStudents[i].getHonor());
                System.out.println("Bravery: " + gryffindorStudents[i].getBravery());
                System.out.println();
                return;
            }
        }
        System.out.println("Student " + name + " " + surname + " " + "is not found");
        System.out.println();
    }

    public static void print(Slytherin[] slytherinStudents, String name, String surname) {
        System.out.println("Slytherin:");
        System.out.println("--------------------");
        for (int i = 0; i < slytherinStudents.length; i++) {
            if (slytherinStudents[i] != null & slytherinStudents[i].getStudentSurname().equals(surname) & slytherinStudents[i].getStudentName().equals(name)) {
                System.out.println("Student Name: " + slytherinStudents[i].getStudentName());
                System.out.println("Student Surname: " + slytherinStudents[i].getStudentSurname());
                System.out.println("Power of Magic: " + slytherinStudents[i].getPowerOfMagic());
                System.out.println("Distance of Apparition: " + slytherinStudents[i].getDistanceOfApparition());
                System.out.println("Cunning: " + slytherinStudents[i].getCunning());
                System.out.println("Ambition: " + slytherinStudents[i].getAmbition());
                System.out.println("Resourcefulness: " + slytherinStudents[i].getResourcefulness());
                System.out.println("Lust For Power: " + slytherinStudents[i].getLustForPower());
                System.out.println();
                return;
            }
        }
        System.out.println("Student " + name + " " + surname + " " + "is not found");
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuffStudents, String name, String surname) {
        System.out.println("Hufflepuff:");
        System.out.println("--------------------");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] != null & hufflepuffStudents[i].getStudentSurname().equals(surname) & hufflepuffStudents[i].getStudentName().equals(name)) {
                System.out.println("Student Name: " + hufflepuffStudents[i].getStudentName());
                System.out.println("Student Surname: " + hufflepuffStudents[i].getStudentSurname());
                System.out.println("Power of Magic: " + hufflepuffStudents[i].getPowerOfMagic());
                System.out.println("Distance of Apparition: " + hufflepuffStudents[i].getDistanceOfApparition());
                System.out.println("Hardworking: " + hufflepuffStudents[i].getHardworking());
                System.out.println("Loyal: " + hufflepuffStudents[i].getLoyal());
                System.out.println("Honest: " + hufflepuffStudents[i].getHonest());
                System.out.println();
                return;
            }
        }
        System.out.println("Student " + name + " " + surname + " " + "is not found");
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclawStudents, String name, String surname) {
        System.out.println("Ravenclaw:");
        System.out.println("--------------------");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            if (ravenclawStudents[i] != null & ravenclawStudents[i].getStudentSurname().equals(surname) & ravenclawStudents[i].getStudentName().equals(name)) {
                System.out.println("Student Name: " + ravenclawStudents[i].getStudentName());
                System.out.println("Student Surname: " + ravenclawStudents[i].getStudentSurname());
                System.out.println("Power of Magic: " + ravenclawStudents[i].getPowerOfMagic());
                System.out.println("Distance of Apparition: " + ravenclawStudents[i].getDistanceOfApparition());
                System.out.println("Smart: " + ravenclawStudents[i].getSmart());
                System.out.println("Wise: " + ravenclawStudents[i].getWise());
                System.out.println("Witty: " + ravenclawStudents[i].getWitty());
                System.out.println("Creative: " + ravenclawStudents[i].getCreative());
                System.out.println();
                return;
            }
        }
        System.out.println("Student " + name + " " + surname + " " + "is not found");
        System.out.println();
    }

}
