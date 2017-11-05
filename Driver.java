package assignment01;

public class Driver{
    public static void main(String[] args){
        Person person1 = new Person("Schultz","Matthew",'j');
        Person person2 = new Person("Sotolongo","Alessandra",'s');
        Person person3 = new Person("Harron","Jacob",'m');
        
        Student student1 = new Student(person1);
        Student student2 = new Student(person2);
        Student student3 = new Student(person3);
        
        Class class1 = new Class("CS","140",4,10390);
        Class class2 = new Class("CS","120",4,22837);
        Class class3 = new Class("WRIT","111",4,20240);
        
        student2.setClass1(class1);
        student2.setClass2(class2);
        student2.setClass3(class3);
        
        Class class1b = new Class("ECON","160",4,24460);
        Class class2b = new Class("ACCT","211",4,12119);
        Class class3b = new Class("FIN","311",3,24841);
        Class class4b = new Class("GEOG","233",4,17217);
        
        student3.setClass1(class1b);
        student3.setClass2(class2b);
        student3.setClass3(class3b);
        student3.setClass4(class4b);
        
        student2.setQualPoints1(16.0);
        student2.setQualPoints2(14.8);
        student2.setQualPoints3(6.8);
        
        student3.setQualPoints1(16.0);
        student3.setQualPoints2(4.0);
        student3.setQualPoints3(9.0);
        student3.setQualPoints4(12.0);
        
        System.out.printf("Matthews GPA: %.2f\n",student1.computeSemesterGPA());
        System.out.println("Matthew Expected: 0.0");
        System.out.println();
        System.out.printf("Alessandras GPA: %.2f\n",student2.computeSemesterGPA());
        System.out.println("Alessandras Expected: 3.133");
        System.out.println();
        System.out.printf("Jacobs GPA: %.2f\n",student3.computeSemesterGPA());
        System.out.println("Jacobs Expected: 2.733");
        System.out.println();
        

    }
}