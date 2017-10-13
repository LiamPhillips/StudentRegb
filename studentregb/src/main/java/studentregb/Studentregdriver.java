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
        //Defines students
        Student s1 = new Student("Grant Gustin","14/01/1990",27,"BLE");
        Student s2 = new Student("Chris Rock","07/02/1965",52,"BLE");
        Student s3 = new Student("Post Malone","04/07/1995",22,"MEE");
        Student s4 = new Student("Hugh Jackman","12/10/1968",49,"MEE");
        Student s5 = new Student("Kendrick Lamar","17/06/1987",30,"BP");
        
        //Adds all students
        ArrayList<Student> groupa = new ArrayList<Student>();
        groupa.add(s1);
        groupa.add(s2);
        groupa.add(s3);
        groupa.add(s4);
        groupa.add(s5);
        
        //Adds BLE and MEE students
        ArrayList<Student> groupb = new ArrayList<Student>();
        groupb.add(s2);
        groupb.add(s3);
        groupb.add(s4);
        groupb.add(s5);
        
        //Adds MEE and BP students
        ArrayList<Student> groupc = new ArrayList<Student>();
        groupc.add(s1);
        groupc.add(s2);
        groupc.add(s3);
        
        //Defines modules
        Module CT420 = new Module("Real Time Systems","CT420",groupa);
        Module CT414 = new Module("Distributed Systems","CT414",groupb);
        Module EE444 = new Module("Signal Processing","EE444",groupc);
        Module EE453 = new Module("Telecommunications","EE453",groupc);
        
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
        
               
        //Prints Student name, course and modules
        BLE.printStudents();
        MEE.printStudents();
        BP.printStudents();
    
       
        
    }
}