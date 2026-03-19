import java.util.ArrayList;

class Main {
     public static void main(String[] args)
    {
    ArrayList<CircleBlvd> users = new ArrayList<CircleBlvd>();
    ArrayList<KingsBlvd> kings = new ArrayList<KingsBlvd>();
    ArrayList<NinthSt> ninth = new ArrayList<NinthSt>();

    users.add(new CircleBlvd()); //Object 1.
    users.add(new CircleBlvd(true, 2.6, 23)); //Object 2.
    users.add(new KingsBlvd(true, 3, 14,false)); 
    users.add(new NinthSt(true, 4.5, 15,false)); 
    
    for (CircleBlvd b : users)
    {
                b.setNewRoadQuality(2);

        b.print();
        System.out.println();

    }
    for (KingsBlvd k : kings)
    {
        k.SignPetition(true);
        k.setNewRoadQuality(2);              
        k.print();
        System.out.println();
        

    }

    for (NinthSt n : ninth)
    {
        n.setNewRoadQuality(1);
        n.print();
    }
}
}