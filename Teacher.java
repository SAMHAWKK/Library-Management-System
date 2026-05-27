public class Teacher extends Person {

    
    public Teacher(String name, int id) {
        super(name, id);
    }

    
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}
