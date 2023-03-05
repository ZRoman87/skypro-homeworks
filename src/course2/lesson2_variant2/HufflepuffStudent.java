package course2.lesson2_variant2;

public class HufflepuffStudent extends HogwartsStudent {

    private int hardworking;
    private int loyal;
    private int honest;

    public HufflepuffStudent(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int hardworking, int loyal, int honest) {
        super(studentName, studentSurname, powerOfMagic, distanceOfApparition);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int ability() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuffStudents(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s %s лучше, чем пуффендуец %s %s: %d VS %d%n", getStudentName(), getStudentSurname(), hufflepuffStudent.getStudentName(), hufflepuffStudent.getStudentSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s %s лучше, чем пуффендуец %s %s: %d VS %d%n", hufflepuffStudent.getStudentName(), hufflepuffStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s %s такой же, как пуффендуец %s %s: %d VS %d%n", hufflepuffStudent.getStudentName(), hufflepuffStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), hardworking, loyal, honest);
    }

}
