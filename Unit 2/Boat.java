public class Boat {
    private double boatLength;
    private String ownerName, tagNumber;
    public Boat(String owner, double length){
        ownerName = owner;
        boatLength = length;
        tagNumber = "Not Registered";
    }
    public void registerBoat(){
        String tag = ownerName.substring(0,2).toUpperCase();
                                    //Max + 1 - Min
        int num = (int)(Math.random() * 3001 + 12000);

        tagNumber = tag + num;
    }
    public String removeSequence(String segment, String unformatted){
        int seqIndex = unformatted.indexOf(segment);
        return unformatted.substring((seqIndex + segment.length()));
    }
}
