package com.miportfolio.Agustin.Repository;

import com.miportfolio.Agustin.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{
    
        //*Busca por el nombre*//
    public Optional<Proyecto> findByNombre(String nombre);
    
    //*Pregunta si ya existe el nombre*//
    public boolean existsByNombre(String nombre);
    
}
