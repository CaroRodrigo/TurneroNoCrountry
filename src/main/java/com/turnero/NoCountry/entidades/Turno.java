/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnero.NoCountry.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Rodrigo Caro
 */
@Data
@Entity
public class Turno {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
     @ManyToOne
     private Empresa empresa;
     @ManyToOne
     private Usuario usuario;
     @ManyToOne
     private Ciudad ciudad;
     @ManyToOne
     private Provincia provincia;
     @ManyToOne
     private Hora hora;
     
}
