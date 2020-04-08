package com.hinkmond.finalproj;

public interface HealthServices {

    public int register (RegistrationData rd);
    public int bookAppointment(AppointmentData ad);
    public AppointmentData viewAppointment(int userid);
    public int updateTestAndReportData(TestAndReportData trd);
    public TestAndReportData viewTestAndReportData(int userid);
}
