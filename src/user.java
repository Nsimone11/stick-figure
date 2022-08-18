
public class user {
    String name="Nina-Simone";
    int age = 0;

    public static void main(String[] args) {
        user nina = new user();
        System.out.println(nina.getName());
        nina.setAge(15);
        System.out.println(nina.getAge());
    }


    public String  getName() {

        return this.name;
    }
    public int getAge(){

        return this.age;
    }
    public void setAge(int age){

        this.age = age;
    }

}
