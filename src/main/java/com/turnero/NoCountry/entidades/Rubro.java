/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnero.NoCountry.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Rodrigo Caro
 */
@Data
@Entity
public class Rubro implements Serializable, Comparable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String rubro;

    @Override
    public int compareTo(Object t) {
       Rubro rubro = (Rubro) t;
        return this.rubro.compareTo(rubro.getRubro());
    }
}
