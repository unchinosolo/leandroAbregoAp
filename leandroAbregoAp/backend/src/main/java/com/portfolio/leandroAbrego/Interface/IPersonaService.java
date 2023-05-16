
package com.portfolio.leandroAbrego.Interface;

import com.portfolio.leandroAbrego.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona (Integer id);
    
    public Persona findPersona(Integer id);
}
