
package com.portfolio.leandroAbrego.security.entity;

import com.portfolio.leandroAbrego.security.enums.RolNombre;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre nombre;
    
    public Rol()
    {
        
    }
    
    public Rol(RolNombre nombre)
    {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getNombre() {
        return nombre;
    }

    public void setNombre(RolNombre nombre) {
        this.nombre = nombre;
    }
    
    
}
