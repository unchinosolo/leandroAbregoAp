package com.portfolio.leandroAbrego.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;



@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
   
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String img;

}
