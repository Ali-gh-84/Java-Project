package Classes;

public class Player extends Person {

    // * Attributes *
    private String specialistPost;

    // * Constructors *
    public Player() {
    }

    // * Setter *
    public void setSpecialistPost(String specialistPost) {
        if (specialistPost.equals("Goalkeeper") || specialistPost.equals("Defender") || specialistPost.equals("Midfielder") || specialistPost.equals("Attacker")) {
            this.specialistPost = specialistPost;
        } else {
            System.out.println(" The entered specialty post is not valid\n" +
                    "We have saved a goalkeeper for you ");
            this.specialistPost = "Goalkeeper";
        }
    }

    // * Methods *
    public void read() {

        super.read();

        System.out.print(" Enter your Specialist Post (Goalkeeper, Defender, Midfielder, Attacker) : ");
        String post = global_Var.console.next();
        setSpecialistPost(post);
    }

    public void show() {
        super.show();

        System.out.print(" Specialist Post is : " + this.specialistPost);
    }

    public void showFullNamePlayer() {
        System.out.println( this.firstName + " " + this.lastName);
    }
}
