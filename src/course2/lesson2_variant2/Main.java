package course2.lesson2_variant2;

public class Main {

    public static void printStudentInfo(GryffindorStudent[] gryffindorStudents,
                                        SlytherinStudent[] slitherinStudents,
                                        HufflepuffStudent[] hufflepuffStudents,
                                        RavenclawStudent[] ravenclawStudents,
                                        String name,
                                        String surname) {

        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] != null & gryffindorStudents[i].getStudentSurname().equals(surname) & gryffindorStudents[i].getStudentName().equals(name)) {
                System.out.println("Gryffindor faculty:");
                System.out.println("--------------------");
                System.out.println(gryffindorStudents[i]);
                return;
            }
        }

        for (int i = 0; i < slitherinStudents.length; i++) {
            if (slitherinStudents[i] != null & slitherinStudents[i].getStudentSurname().equals(surname) & slitherinStudents[i].getStudentName().equals(name)) {
                System.out.println("Slitherin faculty:");
                System.out.println("--------------------");
                System.out.println(slitherinStudents[i]);
                return;
            }
        }

        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] != null & hufflepuffStudents[i].getStudentSurname().equals(surname) & hufflepuffStudents[i].getStudentName().equals(name)) {
                System.out.println("Hufflepuff faculty:");
                System.out.println("--------------------");
                System.out.println(hufflepuffStudents[i]);
                return;
            }
        }

        for (int i = 0; i < ravenclawStudents.length; i++) {
            if (ravenclawStudents[i] != null & ravenclawStudents[i].getStudentSurname().equals(surname) & ravenclawStudents[i].getStudentName().equals(name)) {
                System.out.println("Ravenclaw faculty:");
                System.out.println("--------------------");
                System.out.println(ravenclawStudents[i]);
                return;
            }
        }

        System.out.println("Student " + name + " " + surname + " " + "is not found");
    }
    public static void compareStudents(GryffindorStudent[] gryffindorStudents,
                                       SlytherinStudent[] slitherinStudents,
                                       HufflepuffStudent[] hufflepuffStudents,
                                       RavenclawStudent[] ravenclawStudents,
                                       String studentName1,
                                       String studentSurname1,
                                       String studentName2,
                                       String studentSurname2) {
        GryffindorStudent gryffindorStudent1 = null;
        GryffindorStudent gryffindorStudent2 = null;
        SlytherinStudent slitherinStudent1 = null;
        SlytherinStudent slitherinStudent2 = null;
        HufflepuffStudent hufflepuffStudent1 = null;
        HufflepuffStudent hufflepuffStudent2 = null;
        RavenclawStudent ravenclawStudent1 = null;
        RavenclawStudent ravenclawStudent2 = null;

        for (int i = 0; i < gryffindorStudents.length; i++) {
            if (gryffindorStudents[i] != null & gryffindorStudents[i].getStudentName().equals(studentName1) & gryffindorStudents[i].getStudentSurname().equals(studentSurname1)) {
                gryffindorStudent1 = gryffindorStudents[i];

            } else if (gryffindorStudents[i].getStudentName().equals(studentName2) & gryffindorStudents[i].getStudentSurname().equals(studentSurname2)) {
                gryffindorStudent2 = gryffindorStudents[i];
            }
        }

        for (int i = 0; i < slitherinStudents.length; i++) {
            if (slitherinStudents[i] != null & slitherinStudents[i].getStudentName().equals(studentName1) & slitherinStudents[i].getStudentSurname().equals(studentSurname1)) {
                slitherinStudent1 = slitherinStudents[i];

            } else if (slitherinStudents[i].getStudentName().equals(studentName2) & slitherinStudents[i].getStudentSurname().equals(studentSurname2)) {
                slitherinStudent2 = slitherinStudents[i];
            }
        }

        for (int i = 0; i < hufflepuffStudents.length; i++) {
            if (hufflepuffStudents[i] != null & hufflepuffStudents[i].getStudentName().equals(studentName1) & hufflepuffStudents[i].getStudentSurname().equals(studentSurname1)) {
                hufflepuffStudent1 = hufflepuffStudents[i];

            } else if (hufflepuffStudents[i].getStudentName().equals(studentName2) & hufflepuffStudents[i].getStudentSurname().equals(studentSurname2)) {
                hufflepuffStudent2 = hufflepuffStudents[i];
            }
        }

        for (int i = 0; i < ravenclawStudents.length; i++) {
            if (ravenclawStudents[i] != null & hufflepuffStudents[i].getStudentName().equals(studentName1) & ravenclawStudents[i].getStudentSurname().equals(studentSurname1)) {
                ravenclawStudent1 = ravenclawStudents[i];

            } else if (ravenclawStudents[i].getStudentName().equals(studentName2) & ravenclawStudents[i].getStudentSurname().equals(studentSurname2)) {
                ravenclawStudent2 = ravenclawStudents[i];
            }
        }

        if (gryffindorStudent1 != null & gryffindorStudent2 != null) {
            gryffindorStudent1.compareGryffindorStudents(gryffindorStudent2);
        } else if (slitherinStudent1 != null & slitherinStudent2 != null) {
            slitherinStudent1.compareSlytherinStudents(slitherinStudent2);
        } else if (hufflepuffStudent1 != null & hufflepuffStudent2 != null) {
            hufflepuffStudent1.compareHufflepuffStudents(hufflepuffStudent2);
        } else if (ravenclawStudent1 != null & ravenclawStudent2 != null) {
            ravenclawStudent1.compareRavenclawStudents(ravenclawStudent2);
        }

        if (gryffindorStudent1 != null & slitherinStudent2 != null) {
                gryffindorStudent1.compareHogwarts(slitherinStudent2);
        } else if (slitherinStudent1 != null & gryffindorStudent2 != null) {
                slitherinStudent1.compareHogwarts(gryffindorStudent2);
        }

        if (gryffindorStudent1 != null & hufflepuffStudent2 != null) {
            gryffindorStudent1.compareHogwarts(hufflepuffStudent2);
        } else if (hufflepuffStudent1 != null & gryffindorStudent2 != null) {
            hufflepuffStudent1.compareHogwarts(gryffindorStudent2);
        }

        if (gryffindorStudent1 != null & ravenclawStudent2 != null) {
            gryffindorStudent1.compareHogwarts(ravenclawStudent2);
        } else if (ravenclawStudent1 != null & gryffindorStudent2 != null) {
            ravenclawStudent1.compareHogwarts(gryffindorStudent2);
        }

        if (slitherinStudent1 != null & hufflepuffStudent2 != null) {
            slitherinStudent1.compareHogwarts(hufflepuffStudent2);
        } else if (hufflepuffStudent1 != null & slitherinStudent2 != null) {
            hufflepuffStudent1.compareHogwarts(slitherinStudent2);
        }

        if (slitherinStudent1 != null & ravenclawStudent2 != null) {
            slitherinStudent1.compareHogwarts(ravenclawStudent2);
        } else if (ravenclawStudent1 != null & slitherinStudent2 != null) {
            ravenclawStudent1.compareHogwarts(slitherinStudent2);
        }

        if (hufflepuffStudent1 != null & ravenclawStudent2 != null) {
            hufflepuffStudent1.compareHogwarts(ravenclawStudent2);
        } else if (ravenclawStudent1 != null & hufflepuffStudent2 != null) {
            ravenclawStudent1.compareHogwarts(hufflepuffStudent2);
        }
    }

    public static void main(String[] args) {

        GryffindorStudent[] gryffindorStudents = {
                new GryffindorStudent("Garry", "Potter", 90, 190, 50, 60, 70),
                new GryffindorStudent("Hermione", "Granger", 80, 180, 60, 70, 80),
                new GryffindorStudent("Ron", "Weasley", 70, 170, 20, 30, 40),
        };

        SlytherinStudent[] slitherinStudents = {
                new SlytherinStudent("Draco", "Malfoy", 85, 185, 80, 85, 90, 95, 100),
                new SlytherinStudent("Graham", "Montague", 50, 150, 50, 55, 60, 65, 70),
                new SlytherinStudent("Gregory", "Goyle", 30, 130, 30, 35, 40, 45, 50),
        };

        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent("Zacharias", "Smith", 80, 180, 50, 60, 70),
                new HufflepuffStudent("Cedric", "Diggory", 70, 170, 40, 50, 60),
                new HufflepuffStudent("Justin", "Finch-Fletchley", 60, 160, 30, 40, 50),
        };

        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Zhou", "Chang", 85, 185, 60, 70, 80, 90),
                new RavenclawStudent("Padma", "Patil", 75, 175, 50, 60, 70, 80),
                new RavenclawStudent("Marcus", "Belby", 65, 165, 40, 50, 60, 70),
        };


        printStudentInfo(gryffindorStudents, slitherinStudents, hufflepuffStudents, ravenclawStudents, "Marcus", "Belby" );
        System.out.println();

        compareStudents(gryffindorStudents, slitherinStudents, hufflepuffStudents, ravenclawStudents, "Garry", "Potter", "Draco", "Malfoy");
        System.out.println();

        compareStudents(gryffindorStudents, slitherinStudents, hufflepuffStudents, ravenclawStudents,"Garry", "Potter", "Hermione", "Granger");
        System.out.println();

    }
}
