package course2.lesson2_variant2;

public class GryffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int nobility, int honor, int bravery) {
        super(studentName, studentSurname, powerOfMagic, distanceOfApparition);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int ability() {
        return nobility + honor + bravery;
    }
    public void compareGryffindorStudents(GryffindorStudent gryffindorStudent) {
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n", getStudentName(), getStudentSurname(), gryffindorStudent.getStudentName(), gryffindorStudent.getStudentSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n", gryffindorStudent.getStudentName(), gryffindorStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s %s такой же, как гриффиндорец %s %s: %d VS %d%n", gryffindorStudent.getStudentName(), gryffindorStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, bravery);
    }
}
