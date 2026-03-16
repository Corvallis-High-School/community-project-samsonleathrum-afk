import java.util.ArrayList;

class Main {

     public static void main(String[] args)
    {


    ArrayList<CircleBlvd> users = new ArrayList<CircleBlvd>();
    users.add(new CircleBlvd(true, 4.8, 10)); //Object 1.
    users.add(new CircleBlvd(false, 2.6, 23)); //Object 2.
    users.add(new CircleBlvd(false, 3, 14)); //Object 3.
    for (CircleBlvd b : users)
    {
        b.print();
    }
    
}}