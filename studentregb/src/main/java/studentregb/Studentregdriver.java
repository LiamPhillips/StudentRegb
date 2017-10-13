//Liam Phillips
//13390871
//4BP

package studentregb;
import studentreg.Programme;
import studentreg.Module;
import studentreg.Student;
import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Studentregdriver {
    
    public static void main(String args[]){
        //define student
        Student s1 = new Student("Grant Gustin","14/01/1990",27,"BLE");
        Student s2 = new Student("Chris Rock","07/02/1965",52,"BLE");
        Student s3 = new Student("Post Malone","04/07/1995",22,"MEE");
        Student s4 = new Student("Hugh Jackman","12/10/1968",49,"MEE");
        Student s5 = new Student("Kendrick Lamar","17/06/1987",30,"BP");
        
        //all students
        ArrayList<Student> group1 = new ArrayList<Student>();
        group1.add(s1);
        group1.add(s2);
        group1.add(s3);
        group1.add(s4);
        group1.add(s5);
        
        //BLE and MEE
        ArrayList<Student> group2 = new ArrayList<Student>();
        group2.add(s1);
        group2.add(s2);
        group2.add(s3);
        group2.add(s4);
        
        //MEE and BP
        ArrayList<Student> group3 = new ArrayList<Student>();
        group3.add(s3);
        group3.add(s4);
        group3.add(s5);
        
        //Module Definitions
        Module CT420 = new Module("Real Time Systems","CT420",group1);
        Module CT414 = new Module("Distributed Systems","CT414",group2);
        Module EE444 = new Module("Signal Processing","EE444",group3);
        Module EE453 = new Module("Telecommunications","EE453",group3);
        
        //BLE Modules
        ArrayList<Module> BLEmodules = new ArrayList<Module>();
        BLEmodules.add(CT420);
        BLEmodules.add(CT414);
        LocalDate start = new LocalDate(2017,10,13);
        LocalDate end = new LocalDate(2018,5,31);
        Programme BLE = new Programme("BLE",BLEmodules,start,end);
        
        //BP Modules
        ArrayList<Module> BPmodules = new ArrayList<Module>();
        BPmodules.add(EE453);
        BPmodules.add(EE444);
        BPmodules.add(CT414);
        Programme BP = new Programme("BP",BPmodules,start,end);
        
        //MEE Modules
        ArrayList<Module> MEEmodules = new ArrayList<Module>();
        MEEmodules.add(EE444);
        MEEmodules.add(CT420);
        MEEmodules.add(CT414);
        MEEmodules.add(EE453);
        Programme MEE = new Programme("MEE",MEEmodules,start,end);
        
               
        //Prints Student name, Course & modules
        BLE.printStudents();
        MEE.printStudents();
        BP.printStudents();
    
       
        
    }
}