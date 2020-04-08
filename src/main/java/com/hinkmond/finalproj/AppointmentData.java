package com.hinkmond.finalproj;

public class AppointmentData {
    private String firstName;
    private String lastName;
    private String DocName;
    private String AppointmentDateAndTime;
    private String Reason_for_hospital_visit;
    private int userId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocName() {
        return DocName;
    }

    public void setDocName(String docName) {
        DocName = docName;
    }

    public String getAppointmentDateAndTime() {
        return AppointmentDateAndTime;
    }

    public void setAppointmentDateAndTime(String appointmentDateAndTime) {
        AppointmentDateAndTime = appointmentDateAndTime;
    }

    public String getReason_for_hospital_visit() {
        return Reason_for_hospital_visit;
    }

    public void setReason_for_hospital_visit(String reason_for_hospital_visit) {
        Reason_for_hospital_visit = reason_for_hospital_visit;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("User Id:- " + getUserId());
        str.append(" First Name:- " + getFirstName());
        str.append(" Last Name:- " + getLastName());
        str.append(" Doctor Name:- " + getDocName());
        str.append(" Date and Time of appointment:- " + getAppointmentDateAndTime());
        str.append(" Reason for hospital visit:- " + getReason_for_hospital_visit());
        return str.toString();
    }

}
