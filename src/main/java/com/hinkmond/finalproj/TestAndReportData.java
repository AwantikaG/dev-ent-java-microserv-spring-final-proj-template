package com.hinkmond.finalproj;

public class TestAndReportData {

    private int userid;
    private String DocName;
    private String PatientFirstName;
    private String PatientLastName;
    private String TestPrescribed;
    private String TestDate;
    private String TestResults;
    private String Diagnosis;


    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getTestPrescribed() {
        return TestPrescribed;
    }

    public void setTestPrescribed(String testPrescribed) {
        TestPrescribed = testPrescribed;
    }

    public String getTestResults() {
        return TestResults;
    }

    public void setTestResults(String testResults) {
        TestResults = testResults;
    }

    public String getTestDate() {
        return TestDate;
    }

    public void setTestDate(String testDate) {
        TestDate = testDate;
    }

    public String getPatientFirstName() {
        return PatientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        PatientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return PatientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        PatientLastName = patientLastName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
