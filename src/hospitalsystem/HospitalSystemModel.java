/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author edowa
 */
import java.util.ArrayList;
public class HospitalSystemModel {
    private ArrayList<Patient> PatientList = new ArrayList<Patient>();
    private ArrayList<Staff> StaffList = new ArrayList<Staff>();
    
    
    public HospitalSystemModel(){
        PatientList.add(new Patient("Toni O.","612-000-000","Elmo Street","Sick"));
        PatientList.add(new Patient("Adonai","714-000-000","HollyWood Street","Healthy"));
        PatientList.add(new Patient("Abshir","762-000-000","Batman Street","Mild Sickness"));
        
        StaffList.add(new Staff(4550,"hello"));
        StaffList.add(new Staff(6120,"helloWorld"));
        StaffList.add(new Staff(7630,"passWrd"));
        
        
   
        
    }
}
