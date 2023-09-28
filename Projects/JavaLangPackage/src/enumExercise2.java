// enum constant with values exercise

enum Dept2{
    CS("John","Block A"),CE("Smith","Block B"),CIVIL("Srinivas","Block C"),IT("Dave","Block D");

    String head;
    String location;

    private Dept2(String head, String location){
        this.head = head;
        this.location = location;
    }

    public String getHeadName(){
        return head;
    }

    public String getLocation(){
        return  location;
    }
}
public class enumExercise2 {
    public static void main(String[] args) {
        Dept2 d = Dept2.IT;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }
}
