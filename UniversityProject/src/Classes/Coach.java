package Classes;

import Classes.global_Var;

public class Coach extends Person {

    // * Attributes *
    private String coachingDegree;

    // * Constructors *
    public Coach() {
    }

    // * Setter *
    public void setCoachingDegree(String coachingDegree) {
        if (coachingDegree.equals("A") || coachingDegree.equals("B") || coachingDegree.equals("C")) {
            this.coachingDegree = coachingDegree;
        } else {
            System.out.println(" The entered Coach Degree is not valid\n" +
                    "We have saved A for you ");
            this.coachingDegree = "A";
        }
    }

    // * Getter *
    public String getCoachingDegree() {
        return coachingDegree;
    }

    // * Methods *
    public void read() {

        super.read();

        System.out.print(" Enter your Coaching Degree (A, B, C) : ");
        String grade = global_Var.console.next();
        setCoachingDegree(grade);
    }

    public void show() {
        super.show();

        System.out.print(" Coaching Degree is : " + this.coachingDegree);
    }
}
