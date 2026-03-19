public class CircleBlvd
{
    public boolean dyu; //Instance variable tracks whether a person drives on Circle Blvd. dyu = do You Use.
    public double du; //Instance variable tracks how many times per day a person uses this road. //du = daily use.
    public int rq; //Instance variable tracks the user's rating of the road. rq = Road quality.
    
    public CircleBlvd(boolean doYouUse, double dailyUse, int roadQuality)
    {
        //Constructor gathers the user's response from the main method.
    dyu = doYouUse; 
    du = dailyUse;
    rq = roadQuality;
    checkRq();
    }

    public void checkRq()
    {
      if(rq>5)
       rq = 5;
      else if(rq<0)
         rq = 0;
    }

    public CircleBlvd()
    {
      dyu = false;
    }
    public void print() //This method prints the instance variables. This could represent the user's original information or their altered response, depending on where their main method calls the print statement.
    {
        System.out.println(""+toString());
    }

    public boolean getdoYouUse() //getter returns whether they use the road.
    {
       return dyu;
    }
    public double getdailyUse() //getter returns how many times they use the road.
    {
       return du;
    }
    public int getRoadQuality() //getter returns the user's rating.
    {
      return rq;
    }
    public void setNewDaily(double nd) //setter alters the dailyUse variable for one object.
    {
       du = nd;
    }
    public void setNewUsage(boolean U) //setter alters the doYouUse variable for one object.
    {
       dyu = U;
    }
    public void setNewRoadQuality(int Q) //setter alters the roadQuality variable for one object.
    {
      rq = Q;
    }
    public String toString() //toString method returns a string that describes all of the user's information.
    {
      if(dyu==true)
       return "Do you use Circle Blvd? " +getdoYouUse()+ ". Daily use of Circle Blvd "+getdailyUse()+ ". Road quality rating: "+getRoadQuality();
    return "Not a user";
    }
    public void findFrequentUser(boolean f) //This method finds if the user believes they are a frequent user.
    {
        if (f==true)
            System.out.println("Frequent user!");
        else
            System.out.println("Not frequent user.");
        
    }
}