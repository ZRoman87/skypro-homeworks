package course2.lesson2;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int smart, int wise, int witty, int creative) {
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
}
