package ali;


public class Training {
    private String name;
    public int age;

    public String set_name(){
        name = "ali";
        return name;
    }
    public int set_age(){
        age = 15;
        return age;
    }
    public void init(){
        set_name();
        set_age();
        System.out.println("name" + name + "age" + age);
    }
    public static void main(String[] args) {
        
    }
}
