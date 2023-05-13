package com.miportfolio.Agustin.Security.Repository;

import com.miportfolio.Agustin.Security.Entity.Rol;
import com.miportfolio.Agustin.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
