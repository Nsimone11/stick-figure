
public class main {
    String name = "Nina-Simone";
    int age = 0;


    public static void main(String[] args) {
        main bob = new main();
        bob.getName();
        System.out.println(bob.getName());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
