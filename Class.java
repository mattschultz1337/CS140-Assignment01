package assignment01;

public class Class{
    
    //Instance Fields
    private String name;
    private String number;
    private int numCredits;
    private int crn;
    private double qualPoints;
    
    //Specific Constructor
    public Class(String aName, String aNumber, int aNumCredits, int aCrn){
        name = aName;
        number = aNumber;
        numCredits = aNumCredits;
        crn = aCrn;
    }
    
    public static final Class DUMMY_CLASS = new Class("Dummy","000",0,0);
    
    //Get and Set Methods
    public String getName(){
        return name;
    }
    public void setName(String bName){
        name=bName;
    }
    
    public String getNumber(){
        return number;
    }
    public void setNumber(String bNum){
        number=bNum;
    }
    
    public int getNumCredits(){
        return numCredits;
    }
    public void setNumCredits(int bNumCredits){
        numCredits = bNumCredits;
    }
    
    public int getCrn(){
        return crn;
    }
    public void setCrn(int bCrn){
        crn = bCrn;
    }
    
    public double getQualPoints(){
        return qualPoints;
    }
    public void setQualPoints(double qPoints){
        qualPoints = qPoints;
    }
    
    
    
    
}