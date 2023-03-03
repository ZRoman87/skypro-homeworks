package course2.lesson2;

public class Hufflepuff extends Hogwarts {
    int hardworking;
    int loyal;
    int honest;

    public Hufflepuff(String studentName, String studentSurname, int powerOfMagic, int distanceOfApparition, int hardworking, int loyal, int honest) {
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
}
