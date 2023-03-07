package course2.lesson2_variant2;

public class SlytherinStudent extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, studentSurname, powerOfMagic, distanceOfApparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherinStudents(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n", getStudentName(), getStudentSurname(), slytherinStudent.getStudentName(), slytherinStudent.getStudentSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s %s лучше, чем гриффиндорец %s %s: %d VS %d%n", slytherinStudent.getStudentName(), slytherinStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s %s такой же, как гриффиндорец %s %s: %d VS %d%n", slytherinStudent.getStudentName(), slytherinStudent.getStudentSurname(), getStudentName(), getStudentSurname(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, lustForPower);
    }
}
