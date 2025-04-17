package Classes;

import Classes.global_Var;
import Classes.Date;

public class Person {

    // * Attributes *
    protected String firstName;
    protected String lastName;
    protected int nationalCode;
    protected Date birthDate;
    private int count = 1;

    // * Constructors *
    public Person() {
    }

    // * Setter *\
    public void setNationalCode(int nationalCode) {
        if (nationalCode > 0) {
            this.nationalCode = nationalCode;
        } else {
            System.out.println(" The entered National Code is not valid\n" +
                    "We have saved " + this.count + " for you ");
            this.nationalCode = this.count;
            this.count += 1;
        }
    }

    // * Getter *
    public int getNationalCode() {
        return nationalCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // * Methods *
    public void read() {
        System.out.print(" Enter your First Name : ");
        this.firstName = global_Var.console.next();

        System.out.print(" Enter your Last Name : ");
        this.lastName = global_Var.console.next();

        System.out.print(" Enter your National Code : ");
        int nCode = global_Var.console.nextInt();
        this.setNationalCode(nCode);

        this.birthDate = new Date();
        this.birthDate.read();
    }

    public void show() {
        System.out.print(" Name :  " + this.firstName + " " + this.lastName + "\n" + " National Code is : " + this.nationalCode + "\n" + " Birth Date is : " + this.birthDate);
    }

    public void showFullNameCoach() {
        System.out.println("Team Coach is : " + this.firstName + " " + this.lastName);
    }
}
