// Interface Exercise
// Register customer and invite all the register customers
interface Member
{
    public void callback();
}

// class store which has Member interface
class Store
{
    Member members[]=new Member[10];
    int count=0;

    // Register a new member
    void register(Member m)
    {
        members[count++]=m;
    }

    // invite all the members who had registered in the store
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name=n;
    }

    @Override
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
    }
}

public class InterfaceExercise {
    public static void main(String[] args)
    {
        Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
