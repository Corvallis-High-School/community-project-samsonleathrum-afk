public class CommunityProject
{
    private boolean doYouUse; //Instance variable tracks whether a person drives on Circle Blvd.
    private double dailyUse; //Instance variable tracks how many times per day a person uses this road.
    private int roadQuality; //Instance variable tracks the user's rating of the road.
    
    public CommunityProject(boolean dyu, double du, int rq)
    {
        //Constructor gathers the user's response from the main method.
    doYouUse = dyu; 
    dailyUse = du;
    roadQuality = rq;
 
    }
    public void print() //This method prints the instance variables. This could represent the user's original information or their altered response, depending on where their main method calls the print statement.
    {
        System.out.println("Do you use Circle Blvd? "+doYouUse+"\n"+"How many times a day on average? "+dailyUse+"\n"+"Rate the road quality: " + roadQuality);
    }

    public boolean getdoYouUse() //getter returns whether they use the road.
    {
       return doYouUse;
    }
    public double getdailyUse() //getter returns how many times they use the road.
    {
       return dailyUse;
    }
    public int getRoadQuality() //getter returns the user's rating.
    {
      return roadQuality;
    }
    public void setNewDaily(double nd) //setter alters the dailyUse variable for one object.
    {
       dailyUse = nd;
    }
    public void setNewUsage(boolean U) //setter alters the doYouUse variable for one object.
    {
       doYouUse = U;
    }
    public void setNewRoadQuality(int Q) //setter alters the roadQuality variable for one object.
    {
       roadQuality = Q;
    }
    public String toString() //toString method returns a string that describes all of the user's information.
    {
       return "Do you use Circle? "+doYouUse+"\n"+"How many times do you use Circle daily? " + dailyUse + "\n"+"What is the road quality? " + roadQuality;
    }
    public void findFrequentUser(boolean f) //This method finds if the user believes they are a frequent user.
    {
        if (f==true)
            System.out.print("Frequent user!");
        else
            System.out.print("Not frequent user.");
        
    }
}