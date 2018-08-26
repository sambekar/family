package com.family;


import com.family.Person;
import com.family.ApplicationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class RequestController {

    @Autowired
    private ApplicationDao applicationDao;

    @RequestMapping("/persondetails")
    public String greeting(@RequestParam(value="firstname", required=false) String firstname,
                           @RequestParam(value="middlename", required=false) String middlename,
                           @RequestParam(value="lastname", required=false) String lastname,
                           @RequestParam(value="gender", required=false) String gender,
                           @RequestParam(value="dateofbirth", required=false) String dateofbirth,
                           @RequestParam(value="otherdetails", required=false) String otherdetails,
                           Model model) {
        model.addAttribute("firstname", firstname);
        model.addAttribute("middlename", middlename);
        model.addAttribute("lastname", lastname);
        model.addAttribute("gender", gender);
        model.addAttribute("dateofbirth", dateofbirth);
        model.addAttribute("otherdetails", otherdetails);
        if (firstname!=null) {
            Person bo = new Person();
            bo.setFirstname(firstname);
            bo.setMiddlename(middlename);
            bo.setLastname(lastname);
            bo.setGender(gender);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
            LocalDate date = LocalDate.parse(dateofbirth!=null?dateofbirth:LocalDate.now().format(formatter), formatter);
            java.sql.Date sqlDate = java.sql.Date.valueOf(date);
            bo.setDateofbirth(sqlDate);
            bo.setOtherdetails(otherdetails);
            applicationDao.createPerson(bo);
        }
        return "persondetails";
    }

}
