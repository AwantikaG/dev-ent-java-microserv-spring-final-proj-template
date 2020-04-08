package com.hinkmond.finalproj;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthAppController {

    //HealthServices healthServices = new HealthServiceImpl();
    @CrossOrigin
    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    public ResponseEntity<RegistrationData> register(@RequestBody RegistrationData rd) {
        System.out.println("Welcome to MyHealthApp !! Please enter your details to get registered ... \n");
        HealthServices healthServices = new HealthServiceImpl();
        HttpHeaders headers = new HttpHeaders();
        if (rd == null) {
            return new ResponseEntity<RegistrationData>(HttpStatus.BAD_REQUEST);
        }
        int cnt = healthServices.register(rd);

        headers.add("User registered- ", String.valueOf(rd.getUserid()));
        return new ResponseEntity<RegistrationData>(rd, headers, HttpStatus.CREATED);
    }


    @CrossOrigin
    @RequestMapping(value = "/BookAppointment", method = RequestMethod.POST )

    public ResponseEntity<AppointmentData>bookAppointment(@RequestBody AppointmentData ad ) {
        System.out.println("Welcome to MyHealthApp !! Please enter appointment details to Book Appointment ... \n");
        HealthServices healthServices = new HealthServiceImpl();
        HttpHeaders headers = new HttpHeaders();
        if (ad ==null){
            return new ResponseEntity<AppointmentData>(HttpStatus.BAD_REQUEST);
        }
        healthServices.bookAppointment(ad);
        return new ResponseEntity<AppointmentData>(ad, headers, HttpStatus.CREATED);

    }

   @CrossOrigin
   @RequestMapping(value = "/viewAppointment/{userid}", method = RequestMethod.GET )
   public ResponseEntity<AppointmentData>viewAppointment(@PathVariable("userid") int userid){

       HealthServices healthServices = new HealthServiceImpl();

       AppointmentData ad = healthServices.viewAppointment(userid);
       if (ad == null) {
            return new ResponseEntity<AppointmentData>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<AppointmentData>(ad, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/updateTestAndReportData", method = RequestMethod.POST )
    public ResponseEntity<TestAndReportData>viewTestAndReportData(@RequestBody TestAndReportData trd ) {
        System.out.println("Welcome to MyHealthApp !! Update Patient's Report ... \n");
        HealthServices healthServices = new HealthServiceImpl();
        HttpHeaders headers = new HttpHeaders();
        if (trd ==null){
            return new ResponseEntity<TestAndReportData>(HttpStatus.BAD_REQUEST);
        }
        healthServices.updateTestAndReportData(trd);
        return new ResponseEntity<TestAndReportData>(trd, headers, HttpStatus.CREATED);

    }

    @CrossOrigin
    @RequestMapping(value = "/viewTestAndReportData/{userid}", method = RequestMethod.GET)
    ResponseEntity<TestAndReportData>viewTestAndReportData (@PathVariable("userid") int userid){
        HealthServices healthServices = new HealthServiceImpl();

        TestAndReportData trd = healthServices.viewTestAndReportData(userid);
        if (trd == null) {
            return new ResponseEntity<TestAndReportData>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TestAndReportData>(trd, HttpStatus.OK);
    }

}
