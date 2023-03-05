package course2.lesson2_variant2;

public class HogwartsStudent {

    private String studentName;
    private String studentSurname;
    private int powerOfMagic;
    private int distanceOfApparition;

    public HogwartsStudent(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfApparition = distanceOfApparition;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfApparition() {
        return distanceOfApparition;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfApparition(int distanceOfApparition) {
        this.distanceOfApparition = distanceOfApparition;
    }

    private int ability() {
        return powerOfMagic + distanceOfApparition;
    }
    public void print() {
        System.out.println(this);
    }
    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = ability();
        int ability2 = hogwartsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s: %d VS %d%n", getStudentName(), getStudentSurname(), hogwartsStudent.getStudentName(), hogwartsStudent.getStudentSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s: %d VS %d%n", hogwartsStudent.getStudentName(), hogwartsStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой же, как студент %s %s: %d VS %d%n", getStudentName(), getStudentSurname(), hogwartsStudent.getStudentName(), hogwartsStudent.getStudentSurname(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("Студент %s %s; сила магии: %d; сила трансгрессии: %d", studentName, studentSurname, powerOfMagic, distanceOfApparition);
    }
}
