
package com.portfolio.leandroAbrego.security.repository;

import com.portfolio.leandroAbrego.security.entity.Rol;
import com.portfolio.leandroAbrego.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    /**
     *
     * @param rolNombre
     * @return
     */
    Optional<Rol> findByRolNombre(RolNombre rolNombre);    
}
