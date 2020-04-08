package com.hinkmond.finalproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("healthService")
public class HealthServiceImpl implements  HealthServices{
    @Autowired
    //private DAOInterface dao;
    HealthAppImpl healthAppImpl = new HealthAppImpl();

    public int register(RegistrationData rd){
        return healthAppImpl.register(rd);
    }

    public int bookAppointment (AppointmentData ad) {
        //AppointmentData ad = healthAppImpl.bookAppointment();
        return healthAppImpl.bookAppointment(ad);
    }
    public AppointmentData viewAppointment(int userid) {

        AppointmentData ad = healthAppImpl.viewAppointment(userid);
        return ad;
    }

    public int updateTestAndReportData(TestAndReportData trd) {
        return healthAppImpl.updateTestAndReportData(trd);
    }

    public TestAndReportData viewTestAndReportData(int userid){
        TestAndReportData trd =healthAppImpl.viewTestAndReportData(userid);
        return trd;
    }

}
