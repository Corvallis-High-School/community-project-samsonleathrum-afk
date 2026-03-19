public class NinthSt extends CircleBlvd {
private boolean sign;
public NinthSt(boolean dyu, double du, int rq, boolean s)
{
super(dyu, du, rq);
sign = s;

}
public NinthSt()
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

public void setNewRoadQuality(int qual)
{
    rq = qual;
    if(rq>5)
         rq = 5;
      else if(rq<0)
         rq = 0;
}

public String toString()
{
    if(dyu==true)
        return "Daily use of Ninth St "+du+ ". Road quality rating: "+rq+". Signed petition? "+sign;
    return "Not a user";
}

}
