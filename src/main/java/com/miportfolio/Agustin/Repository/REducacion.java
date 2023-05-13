package com.miportfolio.Agustin.Repository;

import com.miportfolio.Agustin.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    
    //*Busca por el nombre*//
    public Optional<Educacion> findByNombreE(String nombreE);
    
    //*Pregunta si ya existe el nombre*//
    public boolean existsByNombreE(String nombreE);
    
    
}
