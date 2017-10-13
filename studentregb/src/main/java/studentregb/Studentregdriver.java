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
        Student s1 = new Student("Grant Gustin","14/01/1990",27,"CSIT");
        Student s2 = new Student("Chris Rock","07/02/1965",52,"CSIT");
        Student s3 = new Student("Post Malone","04/07/1995",22,"BP");
        Student s4 = new Student("Hugh Jackman","12/10/1968",49,"BP");
        Student s5 = new Student("Kendrick Lamar","17/06/1987",30,"EE");
        
        //all students
        ArrayList<Student> group1 = new ArrayList<Student>();
        group1.add(s1);
        group1.add(s2);
        group1.add(s3);
        group1.add(s4);
        group1.add(s5);
        
        //CS&IT and BP
        ArrayList<Student> group2 = new ArrayList<Student>();
        group2.add(s1);
        group2.add(s2);
        group2.add(s3);
        group2.add(s4);
        
        //BP and EE
        ArrayList<Student> group3 = new ArrayList<Student>();
        group3.add(s3);
        group3.add(s4);
        group3.add(s5);
        
        //Module Definitions
        Module CT417 = new Module("Software Eng. 3","CT417",group1);
        Module CT401 = new Module("Machine Learning","CT401",group2);
        Module EE445 = new Module("DSP","EE445",group3);
        Module EE451 = new Module("System on Chip 1","EE451",group3);
        
        //CS Modules
        ArrayList<Module> CSmodules = new ArrayList<Module>();
        CSmodules.add(CT417);
        CSmodules.add(CT401);
        LocalDate start = new LocalDate(2016,9,5);
        LocalDate end = new LocalDate(2017,5,31);
        Programme CSIT = new Programme("CSIT",CSmodules,start,end);
        
        //BP Modules
        ArrayList<Module> BPmodules = new ArrayList<Module>();
        BPmodules.add(EE445);
        BPmodules.add(CT417);
        BPmodules.add(CT401);
        BPmodules.add(EE451);
        Programme BP = new Programme("BP",BPmodules,start,end);
        
        //EE Modules
        ArrayList<Module> EEmodules = new ArrayList<Module>();
        EEmodules.add(EE451);
        EEmodules.add(EE445);
        EEmodules.add(CT401);
        Programme EE = new Programme("EE",EEmodules,start,end);
        
        //Prints Student name, Course & modules
        CSIT.printStudents();
        BP.printStudents();
        EE.printStudents();
    
       
        
    }
    
}