import java.util.ArrayList;

class Main {

     public static void main(String[] args)
    {


    ArrayList<CircleBlvd> users = new ArrayList<CircleBlvd>();
    users.add(new CircleBlvd(true, 4.8, 10)); //Object 1.
    users.add(new CircleBlvd(false, 2.6, 23)); //Object 2.
    users.add(new CircleBlvd(false, 3, 14)); //Object 3.
    ArrayList<KingsBlvd> kings = new ArrayList<KingsBlvd>();
    users.add(new KingsBlvd(false, 3, 14,false)); 
    ArrayList<NinthSt> ninth = new ArrayList<NinthSt>();
    users.add(new NinthSt(true, 4.5, 15,false)); 
    
    
    
    for (CircleBlvd b : users)
    {
        b.print();
    }
    for (KingsBlvd k : kings)
    {
        k.print();

    }
    for (NinthSt n : ninth)
    {
        n.print();
                n.setNewRoadQuality(10);

    }
}}