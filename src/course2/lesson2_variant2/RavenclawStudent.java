package course2.lesson2_variant2;

public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public RavenclawStudent(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int smart, int wise, int witty, int creative) {
        super(studentName, studentSurname, powerOfMagic, distanceOfApparition);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    private int ability() {
        return smart + wise + witty + creative;
    }

    public void compareRavenclawStudents(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s %s лучше, чем когтевранец %s %s: %d VS %d%n", getStudentName(), getStudentSurname(),ravenclawStudent.getStudentName(), ravenclawStudent.getStudentSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s %s лучше, чем когтевранец %s %s: %d VS %d%n", ravenclawStudent.getStudentName(), ravenclawStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s %s такой же, как когтевранец %s %s: %d VS %d%n", ravenclawStudent.getStudentName(), ravenclawStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d; творчество: %d", super.toString(), smart, wise, witty, creative);
    }
}
