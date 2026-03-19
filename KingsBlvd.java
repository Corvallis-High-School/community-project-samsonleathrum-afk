public class KingsBlvd extends CircleBlvd {
private boolean sign;
public KingsBlvd(boolean dyu, double du, int rq, boolean s)
{
super(dyu, du, rq);
sign = s;
}
public KingsBlvd()
{
    dyu = super.getdoYouUse();
    SignPetition(true);
}
public String SignPetition(boolean ye)
{
System.out.println("Will you sign the petition?");
    if(ye==true)
    {
        sign = true;
        return "Signed";
    }
    return "";
}
public void setPetition(boolean s)
{
    if(s==false)
        sign = false;
}

public void setNewRoadQuality(int Q) //setter alters the roadQuality variable for one object.
    {
      rq = Q;
    }

public String toString()
{
    if(dyu==true)
        return "Daily use of Kings Blvd "+du+ ". Road quality rating: "+rq+". Signed petition? "+sign;
    return "Not a user";
    
}

}
