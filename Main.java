class Main {

     public static void main(String[] args)
    {
    CommunityProject p1 = new CommunityProject(true, 4.8, 10); //Object 1.
    CommunityProject p2 = new CommunityProject(false, 2.6, 23); //Object 2.
    p1.getdoYouUse();
    p1.getdailyUse();
    p1.getRoadQuality();
    p1.setNewDaily(40.2);
    p2.setNewUsage(true);
    p1.setNewRoadQuality(4);
    p1.toString();
    p2.toString();
    p1.print();
    p2.print();
    p2.findFrequentUser(true);

    }
}