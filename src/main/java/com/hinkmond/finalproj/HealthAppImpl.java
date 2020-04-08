package com.hinkmond.finalproj;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("healthDao")
public class HealthAppImpl implements DAOInterface {

    JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();

    public int register(RegistrationData rd) {
        int rowCount = jdbcTemplate.update( "INSERT INTO  registration_data (first_name, last_name, address, email_id, user_id) VALUES (?,?,?,?,?)", new Object[] { rd.getFirstName(), rd.getLastName(), rd.getAddress(), rd.getEmail(), rd.getUserid()});
        return rowCount;
    }

    public int bookAppointment(AppointmentData ad) {

        int rowct = jdbcTemplate.update("INSERT INTO  appointment_data (first_name, last_name, user_id, date_time, doc_name, reason_for_visit) VALUES (?,?,?,?,?,?)", new Object[] { ad.getFirstName(), ad.getLastName(), ad.getUserId(), ad.getAppointmentDateAndTime(), ad.getDocName(), ad.getReason_for_hospital_visit()});
        //int rowct = jdbcTemplate.update("INSERT INTO appointment_data (first_name, last_name, user_id) SELECT first_name, last_name, user_id from registration_data where user_id=ad.getUserid()");
        return rowct;
    }

    public AppointmentData viewAppointment(int userid) {
        AppointmentData ad = null;
        try {
            ad = jdbcTemplate.queryForObject("SELECT * FROM appointment_data WHERE user_id = ?",
                    new Object[]{userid}, new BeanPropertyRowMapper<AppointmentData>(AppointmentData.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return ad;
    }

    @Override
    public int updateTestAndReportData(TestAndReportData trd) {
        int rowct = jdbcTemplate.update("INSERT INTO  test_report_data (patient_first_name, patient_last_name, doc_name, test_prescribed, date, test_results, diagnosis, user_id) VALUES (?,?,?,?,?,?,?,?)", new Object[] {trd.getPatientFirstName(), trd.getPatientLastName(), trd.getDocName(), trd.getTestPrescribed(), trd.getTestDate(), trd.getTestResults(), trd.getDiagnosis(), trd.getUserid()});
        return rowct;
    }

    @Override
    public TestAndReportData viewTestAndReportData(int userid) {
        TestAndReportData trd = null;
        try {
            trd = jdbcTemplate.queryForObject("SELECT * FROM test_report_data WHERE user_id = ?",
                    new Object[]{userid}, new BeanPropertyRowMapper<TestAndReportData>(TestAndReportData.class));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return trd;
    }
}
