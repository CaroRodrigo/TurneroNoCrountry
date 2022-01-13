/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnero.NoCountry.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Rodrigo Caro
 */
@Data
@Entity
public class Sucursal implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String direccion;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "provincia_id", insertable = false, updatable = false)
    private Provincia provincia;
    
    @Column(name = "provincia_id", nullable = false)
    private String provinciaId;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ciudad_id", insertable = false, updatable = false)
    private Ciudad ciudad;
    
    @Column(name = "ciudad_id", nullable = false)
    private String ciudadId;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private Usuario usuario;
    
    @Column(name = "usuario_id", nullable = false)
    private String usuarioId;

}
