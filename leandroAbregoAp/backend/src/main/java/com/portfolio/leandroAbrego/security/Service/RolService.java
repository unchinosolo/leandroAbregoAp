
package com.portfolio.leandroAbrego.security.Service;

import com.portfolio.leandroAbrego.security.entity.Rol;
import com.portfolio.leandroAbrego.security.enums.RolNombre;
import com.portfolio.leandroAbrego.security.repository.IRolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre)
    {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol)
    {
        irolRepository.save(rol);
    }
}
