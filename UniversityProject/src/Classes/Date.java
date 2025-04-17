package Classes;

public class Date {

    // * Attributes *
    private int y;
    private int m;
    private int d;

    // * Constructors *
    public Date() {
    }

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // * Setter *
    public void setY(int y) {
        if (y > 0 && y < 1404) {
            this.y = y;
        } else {
            System.out.println(" The entered Year is not valid\n" +
                    "We have saved 1360 for you ");
            this.y = 1360;
        }
    }

    public void setM(int m) {
        if (m > 0 && m < 13) {
            this.m = m;
        } else {
            System.out.println(" The entered Month is not valid\n" +
                    "We have saved 1 for you ");
            this.m = 1;
        }
    }

    public void setD(int d) {
        if (d > 0 && d < 32) {
            this.d = d;
        } else {
            System.out.println(" The entered Day is not valid\n" +
                    "We have saved 1 for you ");
            this.d = 1;
        }
    }

    // * Getter *
    public int getY() {
        return y;
    }

    public int getM() {
        return m;
    }

    public int getD() {
        return d;
    }

    // * Methods *
    public boolean equal(Date a) {
        return this.y == a.y && this.m == a.m && this.d == a.d;
    }

    public void read() {
        System.out.print(" Enter your Year of Birth : ");
        int yearPerson = global_Var.console.nextInt();
        setY(yearPerson);

        System.out.print(" Enter your Month of Birth : ");
        int monthPerson = global_Var.console.nextInt();
        setM(monthPerson);

        System.out.print(" Enter your Day of Birth : ");
        int dayPerson = global_Var.console.nextInt();
        setD(dayPerson);
    }

    @Override
    public String toString() {
        return "your BirthDate is : " + this.y + "/" + this.m + "/" + this.d;
    }

    public boolean calculateAge(Date currentDate) {
        int age = currentDate.getY() - this.y;
        return age > 30;
    }
}
