package course2.lesson2;

public class Main {

    public static void compareStudents(Gryffindor[] gryffindorStudents) {
        int[] score = new int[gryffindorStudents.length];
        System.out.println("--- Total score for Gryffindor's students:");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            score[i] = gryffindorStudents[i].getNobility() + gryffindorStudents[i].getHonor() + gryffindorStudents[i].getBravery();
            System.out.println(gryffindorStudents[i].getStudentName() + " score " + score[i]);
        }
        System.out.println("--- Comparison of Gryffindor's students:");
        for (int i = 0; i < gryffindorStudents.length-1; i++) {
            if (score[i] > score[i+1]) {
                System.out.println(gryffindorStudents[i].getStudentName() + " better, then " + gryffindorStudents[i+1].getStudentName());
            } else {
                System.out.println(gryffindorStudents[i+1].getStudentName() + " better, then " + gryffindorStudents[i].getStudentName());
            }
        }
        System.out.println();
    }

    public static void compareStudents(Slytherin[] slitherinStudents) {
        int[] score = new int[slitherinStudents.length];
        System.out.println("--- Total score for Slytherin's students:");
        for (int i = 0; i < slitherinStudents.length; i++) {
            score[i] = slitherinStudents[i].getCunning() + slitherinStudents[i].getDetermination() + slitherinStudents[i].getAmbition() + slitherinStudents[i].getResourcefulness() + slitherinStudents[i].getLustForPower();
            System.out.println(slitherinStudents[i].getStudentName() + " score " + score[i]);
        }
        System.out.println("--- Comparison of Slytherin's students:");
        for (int i = 0; i < slitherinStudents.length-1; i++) {
            if (score[i] > score[i+1]) {
                System.out.println(slitherinStudents[i].getStudentName() + " better, then " + slitherinStudents[i+1].getStudentName());
            } else {
                System.out.println(slitherinStudents[i+1].getStudentName() + " better, then " + slitherinStudents[i].getStudentName());
            }
        }
        System.out.println();
    }

    public static void compareStudents(Hufflepuff[] hufflepuffStudents) {
        int[] score = new int[hufflepuffStudents.length];
        System.out.println("--- Total score for Hufflepuff's students:");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            score[i] = hufflepuffStudents[i].getHardworking() + hufflepuffStudents[i].getLoyal() + hufflepuffStudents[i].getHonest();
            System.out.println(hufflepuffStudents[i].getStudentName() + " score " + score[i]);
        }
        System.out.println("--- Comparison of Hufflepuff's students:");
        for (int i = 0; i < hufflepuffStudents.length-1; i++) {
            if (score[i] > score[i+1]) {
                System.out.println(hufflepuffStudents[i].getStudentName() + " better, then " + hufflepuffStudents[i+1].getStudentName());
            } else {
                System.out.println(hufflepuffStudents[i+1].getStudentName() + " better, then " + hufflepuffStudents[i].getStudentName());
            }
        }
        System.out.println();
    }

    public static void compareStudents(Ravenclaw[] ravenclawStudents) {
        int[] score = new int[ravenclawStudents.length];
        System.out.println("--- Total score for Hufflepuff's students:");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            score[i] = ravenclawStudents[i].getWise() + ravenclawStudents[i].getCreative() + ravenclawStudents[i].getSmart() + ravenclawStudents[i].getWitty();
            System.out.println(ravenclawStudents[i].getStudentName() + " score " + score[i]);
        }
        System.out.println("--- Comparison of Hufflepuff's students:");
        for (int i = 0; i < ravenclawStudents.length-1; i++) {
            if (score[i] > score[i+1]) {
                System.out.println(ravenclawStudents[i].getStudentName() + " better, then " + ravenclawStudents[i+1].getStudentName());
            } else {
                System.out.println(ravenclawStudents[i+1].getStudentName() + " better, then " + ravenclawStudents[i].getStudentName());
            }
        }
        System.out.println();
    }

    public static void compareAnyStudents(Gryffindor[] gryffindorStudents, Slytherin[] slitherinStudents, Hufflepuff[] hufflepuffStudents, Ravenclaw[] ravenclawStudents, String surname1, String surname2){
        int powerOfMagic1 = 0;
        int powerOfMagic2 = 0;
        int distanceOfApparition1 = 0;
        int distanceOfApparition2 = 0;
        String faculty1 = "";
        String faculty2 = "";
        String studentName1 = "";
        String studentName2 = "";
        String studentSurname1 = "";
        String studentSurname2 = "";


        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] != null & gryffindorStudents[i].getStudentSurname().equals(surname1)) {
                faculty1  = "Gryffindor";
                studentName1 = gryffindorStudents[i].getStudentName();
                studentSurname1 = gryffindorStudents[i].getStudentSurname();
                powerOfMagic1 = gryffindorStudents[i].getPowerOfMagic();
                distanceOfApparition1 = gryffindorStudents[i].getDistanceOfApparition();
            } else if (gryffindorStudents[i].getStudentSurname().equals(surname2)) {
                faculty2  = "Gryffindor";
                studentName2 = gryffindorStudents[i].getStudentName();
                studentSurname2 = gryffindorStudents[i].getStudentSurname();
                powerOfMagic2 = gryffindorStudents[i].getPowerOfMagic();
                distanceOfApparition2 = gryffindorStudents[i].getDistanceOfApparition();
            }
        }

        for (int i = 0; i < slitherinStudents.length; i++) {
            if (slitherinStudents[i] != null & slitherinStudents[i].getStudentSurname().equals(surname1)) {
                faculty1  = "Slytherin";
                studentName1 = slitherinStudents[i].getStudentName();
                studentSurname1 = slitherinStudents[i].getStudentSurname();
                powerOfMagic1 = slitherinStudents[i].getPowerOfMagic();
                distanceOfApparition1 = slitherinStudents[i].getDistanceOfApparition();
            } else if (slitherinStudents[i].getStudentSurname().equals(surname2)) {
                faculty2  = "Slytherin";
                studentName2 = slitherinStudents[i].getStudentName();
                studentSurname2 = slitherinStudents[i].getStudentSurname();
                powerOfMagic2 = slitherinStudents[i].getPowerOfMagic();
                distanceOfApparition2 = slitherinStudents[i].getDistanceOfApparition();
            }
        }

        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] != null & hufflepuffStudents[i].getStudentSurname().equals(surname1)) {
                faculty1  = "Hufflepuff";
                studentName1 = hufflepuffStudents[i].getStudentName();
                studentSurname1 = hufflepuffStudents[i].getStudentSurname();
                powerOfMagic1 = hufflepuffStudents[i].getPowerOfMagic();
                distanceOfApparition1 = hufflepuffStudents[i].getDistanceOfApparition();
            } else if (hufflepuffStudents[i].getStudentSurname().equals(surname2)) {
                faculty2  = "Hufflepuff";
                studentName2 = hufflepuffStudents[i].getStudentName();
                studentSurname2 = hufflepuffStudents[i].getStudentSurname();
                powerOfMagic2 = hufflepuffStudents[i].getPowerOfMagic();
                distanceOfApparition2 = hufflepuffStudents[i].getDistanceOfApparition();
            }
        }

        for (int i = 0; i < ravenclawStudents.length; i++) {
            if (ravenclawStudents[i] != null & ravenclawStudents[i].getStudentSurname().equals(surname1)) {
                faculty1  = "Ravenclaw";
                studentName1 = ravenclawStudents[i].getStudentName();
                studentSurname1 = ravenclawStudents[i].getStudentSurname();
                powerOfMagic1 = ravenclawStudents[i].getPowerOfMagic();
                distanceOfApparition1 = ravenclawStudents[i].getDistanceOfApparition();
            } else if (ravenclawStudents[i].getStudentSurname().equals(surname2)) {
                faculty2  = "Ravenclaw";
                studentName2 = ravenclawStudents[i].getStudentName();
                studentSurname2 = ravenclawStudents[i].getStudentSurname();
                powerOfMagic2 = ravenclawStudents[i].getPowerOfMagic();
                distanceOfApparition2 = ravenclawStudents[i].getDistanceOfApparition();
            }
        }

        System.out.println("Comparison of " + studentName1 + " " + studentSurname1 + " and " + studentName2 + " " + studentSurname2);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Faculty: " + faculty1);
        System.out.println("Student name: " + studentName1);
        System.out.println("Student surname: " + studentSurname1);
        System.out.println("SPower of Magic: " + powerOfMagic1);
        System.out.println("Distance of Apparition: " + distanceOfApparition1);
        System.out.println();
        System.out.println("Faculty: " + faculty2);
        System.out.println("Student name: " + studentName2);
        System.out.println("Student surname: " + studentSurname2);
        System.out.println("SPower of Magic: " + powerOfMagic2);
        System.out.println("Distance of Apparition: " + distanceOfApparition2);
        System.out.println();

        if (powerOfMagic1 > powerOfMagic2) {
            System.out.println(studentName1 + " " + studentSurname1 + " has more power of magic, then " + studentName2 + " " + studentSurname2);
        } else {
            System.out.println(studentName2 + " " + studentSurname2 + " has more power of magic, then " + studentName1 + " " + studentSurname1);
        }

        if (distanceOfApparition1 > distanceOfApparition2) {
            System.out.println(studentName1 + " " + studentSurname1 + " has ability for apparition farther, then " + studentName2 + " " + studentSurname2);
        } else {
            System.out.println(studentName2 + " " + studentSurname2 + " has ability for apparition farther, then " + studentName1 + " " + studentSurname1);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Gryffindor[] gryffindorStudents = {
                new Gryffindor("Garry", "Potter", 90, 190, 50, 60, 70),
                new Gryffindor("Hermione", "Granger", 80, 180, 60, 70, 80),
                new Gryffindor("Ron", "Weasley", 70, 170, 20, 30, 40),
        };

        Slytherin[] slitherinStudents = {
                new Slytherin("Draco", "Malfoy", 85, 185, 80, 85, 90, 95, 100),
                new Slytherin("Graham", "Montague", 50, 150, 50, 55, 60, 65, 70),
                new Slytherin("Gregory", "Goyle", 30, 130, 30, 35, 40, 45, 50),
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Zacharias", "Smith", 80, 180, 50, 60, 70),
                new Hufflepuff("Cedric", "Diggory", 70, 170, 40, 50, 60),
                new Hufflepuff("Justin", "Finch-Fletchley", 60, 160, 30, 40, 50),
        };

        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Zhou", "Chang", 85, 185, 60, 70, 80, 90),
                new Ravenclaw("Padma", "Patil", 75, 175, 50, 60, 70, 80),
                new Ravenclaw("Marcus", "Belby", 65, 165, 40, 50, 60, 70),
        };

        // Print out info about 1 student

        PrintService printService = new PrintService();

        printService.print(gryffindorStudents,"Garry", "Potter");
        printService.print(slitherinStudents, "Draco", "Malfoy");
        printService.print(hufflepuffStudents, "Zacharias", "Smith");
        printService.print(ravenclawStudents, "Zhou", "Chang");

        // Compare all students by total score (summary of traits) in 1 faculty

        compareStudents(gryffindorStudents);
        compareStudents(slitherinStudents);
        compareStudents(hufflepuffStudents);
        compareStudents(ravenclawStudents);

        // Compare any 2 students by power of magic and distance of apparition

        compareAnyStudents(gryffindorStudents, slitherinStudents, hufflepuffStudents, ravenclawStudents, "Potter", "Malfoy");
        compareAnyStudents(gryffindorStudents, slitherinStudents, hufflepuffStudents, ravenclawStudents, "Smith", "Diggory");


    }


}
