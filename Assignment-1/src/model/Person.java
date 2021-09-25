/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

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
    private int SSN;
    private int medicalRecordNumber;
    private String healthPlanBeneficiaryNumber;
    private long bankAccountNumbers;
    private String licenseNumber;
    private String vehicleIdentifiers;
    private int deviceIdentifiers;
    private String linkedIn;
    private int IP;
    private int identificationNumber;
    
    public String getName(){
        return name;
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
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public long getBankAccountNumbers() {
        return bankAccountNumbers;
    }

    public void setBankAccountNumbers(long bankAccountNumbers) {
        this.bankAccountNumbers = bankAccountNumbers;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleIdentifiers() {
        return vehicleIdentifiers;
    }

    public void setVehicleIdentifiers(String vehicleIdentifiers) {
        this.vehicleIdentifiers = vehicleIdentifiers;
    }

    public int getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(int deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public int getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
}
