package assignment01;

public class Student{
    
    //INstance Fields
    private Person self;
    private Class class1 = Class.DUMMY_CLASS;
    private Class class2 = Class.DUMMY_CLASS;
    private Class class3 = Class.DUMMY_CLASS;
    private Class class4 = Class.DUMMY_CLASS;
    
    //Constructor
    public Student(Person aSelf){
        
        self=aSelf;
    }
    
    //Set qpouints Methods
    public void setQualPoints1(double qPoints){
        class1.setQualPoints(qPoints);
    }
    public void setQualPoints2(double qPoints){
        class2.setQualPoints(qPoints);
    }
    public void setQualPoints3(double qPoints){
        class3.setQualPoints(qPoints);
    }
    public void setQualPoints4(double qPoints){
        class4.setQualPoints(qPoints);
    }
    
    //Get Methods
    public String getName(){
        String retName = self.getFirstName() + " " + self.getMiddleInitial() + ". " + self.getLastName();
        return retName;
    }
    public Class getClass1(){
        return class1;
    }
     public Class getClass2(){
        return class2;
    }
     public Class getClass3(){
        return class3;
    }
     public Class getClass4(){
        return class4;
    }
    //Set Methods
    public void setClass1(Class aClass){
        class1=aClass;
    }
    public void setClass2(Class aClass){
        class2=aClass;
    }
    public void setClass3(Class aClass){
        class3=aClass;
    }
    public void setClass4(Class aClass){
        class4=aClass;
    }
    
    public double computeSemesterGPA(){
        double gpa = 0.0;
        double totalPoints = class1.getQualPoints() + class2.getQualPoints() + class3.getQualPoints() + class4.getQualPoints();
        double totalCredits = class1.getNumCredits() + class2.getNumCredits() + class3.getNumCredits() + class4.getNumCredits();
        if(totalCredits>0){
            gpa = totalPoints/totalCredits;
        }
        return gpa;
    }
}
