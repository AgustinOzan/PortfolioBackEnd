package com.miportfolio.Agustin.Security.Service;

import com.miportfolio.Agustin.Security.Entity.Rol;
import com.miportfolio.Agustin.Security.Enums.RolNombre;
import com.miportfolio.Agustin.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
