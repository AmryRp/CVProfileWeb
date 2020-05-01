/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amryramadhanprasetya.cv.controllers;

import com.amryramadhanprasetya.cv.model.Contact;
import com.amryramadhanprasetya.cv.services.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amry4
 */
@Controller
 @RequestMapping("/")
public class IndexController {
    
    @Autowired
    private ContactService contactlist;
    
    @RequestMapping("/")
    public String page(Model model) {
        List<Contact> listCon = contactlist.listAll();
        model.addAttribute("Contact", listCon);
        return "index";
    }
    
}
