/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.Image;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author ajay09
 */
public class Person {
    
    private String name;
    private String geographicData;
    private Date dateOfBirth;
    private long telephoneNumber;
    private long faxNumber;
    private String emailAddress;
    private String SSN;
    private long medicalRecordNumber;
    private String healthPlanBeneficiaryNumber;
    private long bankAccountNumbers;
    private String licenseNumber;
    private String vehicleIdentifiers;
    private String deviceIdentifiers;
    private String linkedIn;
    private String IP;
    private Icon pic;
    
    public String getName(){
        return name;
    }
    
     public void setName(String name){
     if(name.matches("[a-zA-Z]+")) {
            this.name = name;
    } else {
            JOptionPane.showMessageDialog(null, "Invalid Person Name Entered.");
        }
     }
     
    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        String t = String.valueOf(telephoneNumber);
        if (t.matches("\\d{10}")){
            this.telephoneNumber = telephoneNumber;
    } else{
            JOptionPane.showMessageDialog(null, "Invalid Telephone Number Entered.");
        }
    }    

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
        String f = String.valueOf(faxNumber);
        if (f.matches("\\d{10}")){
            this.faxNumber = faxNumber;
    } else{
            JOptionPane.showMessageDialog(null, "Invalid Fax Number Entered.");
        }
    }    

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        if (emailAddress.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.emailAddress = emailAddress;
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Email Address Entered.");
        }
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
         this.SSN = SSN;
        if (SSN.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$")) {
            this.SSN = SSN;
    }   else{
            JOptionPane.showMessageDialog(null, "Invalid SSN Entered.");
        }
    }
        

    public long getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(long medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
        String m = String.valueOf(medicalRecordNumber);
        if (m.matches("\\d{7}")){
        this.medicalRecordNumber = medicalRecordNumber;
    }   else {
            JOptionPane.showMessageDialog(null, "Invalid Medical Record Number entered. ");
        }
    }    

    public String getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
     this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
     if(healthPlanBeneficiaryNumber.matches("\\b\\d[A-Z]{2}\\d-[A-Z]{2}\\d-[A-Z]{2}\\d{2}\\b")){
            this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    } else {
         JOptionPane.showMessageDialog(null, "Invalid Health Plan Beneficiary Number Entered.");
     }          
   }

    public long getBankAccountNumbers() {
        return bankAccountNumbers;
    }

    public void setBankAccountNumbers(long bankAccountNumbers) {
        this.bankAccountNumbers = bankAccountNumbers;
        String b = String.valueOf(bankAccountNumbers);
        if (b.matches("\\d{1,16}")){
            this.bankAccountNumbers = bankAccountNumbers;
    } else {
            JOptionPane.showMessageDialog(null, "Invalid Bank Account Number Entered.");
        }
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        if(licenseNumber.matches("[A-Z]{1}\\d{9}")) {
            this.licenseNumber = licenseNumber;
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid License Number Entered.");
        }
    }

    public String getVehicleIdentifiers() {
        return vehicleIdentifiers;
    }

    public void setVehicleIdentifiers(String vehicleIdentifiers) {
        this.vehicleIdentifiers = vehicleIdentifiers;
        if(vehicleIdentifiers.matches("^[A-Z0-9]{17}$")){
            this.vehicleIdentifiers = vehicleIdentifiers;
    }   else {
            JOptionPane.showMessageDialog(null, "Invalid Vehicle Identifier Entered.");
        }
    }
    public String getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(String deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
        
        if(deviceIdentifiers.matches("^[A-Z0-9]{16}$")){
            this.deviceIdentifiers = deviceIdentifiers;
    }   else {
            JOptionPane.showMessageDialog(null, "Invalid Device Identifiers Entered.");
        }
    }
    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
        if (IP.matches("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$")) {
            this.IP = IP;
    }   else {
            JOptionPane.showMessageDialog(null, "Invalid IP Address Entered.");
        }
    }

    public Icon getPic() {
        return pic;
    }

    public void setPic(Icon pic) {
        if(pic != null) {
            this.pic = pic;
        }
        else {
            JOptionPane.showMessageDialog(null, "Upload an image");
        }
    }

}
