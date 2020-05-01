/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amryramadhanprasetya.cv.services;

import com.amryramadhanprasetya.cv.interfaces.IContact;
import com.amryramadhanprasetya.cv.model.Contact;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amry4
 */
@Service
@Transactional
public class ContactService {
    
    @Autowired
    private IContact generic;
     /**
      * this function for getting all data from entity database
      * @return to findall function from interface
      */
    public List<Contact> listAll() {
        return generic.findAll();
    }
    /**
     * this function is for saving the data to database at entity Contact
     * @param Contact getting the entity Contact from database.
     */
    public void save(Contact Contact) {
        generic.save(Contact);
    }
     /**
      * this function for getting the data Contact by the id 
      * @param id is the integer datatype for an id
      * @return to object by the id
      */
    public Contact get(Integer id) {
        return generic.findById(id).get();
    }
     /**
      * this function for the hard delete
      * @param id is integer datatype 
      */
    public void delete(Integer id) {
        generic.deleteById(id);
    }
}
