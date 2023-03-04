package course2.lesson2;

public class Hogwarts {
    private String studentName;
    private String studentSurname;
    private int powerOfMagic;
    private int distanceOfApparition;

    public Hogwarts(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition) {
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
}
