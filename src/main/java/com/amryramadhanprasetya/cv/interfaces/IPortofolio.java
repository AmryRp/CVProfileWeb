/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amryramadhanprasetya.cv.interfaces;

import com.amryramadhanprasetya.cv.model.Portofolio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author amry4
 */
public interface IPortofolio extends JpaRepository<Portofolio,Integer>{
    
}
