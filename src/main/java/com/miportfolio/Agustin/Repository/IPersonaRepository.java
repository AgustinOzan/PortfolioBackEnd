package com.miportfolio.Agustin.Repository;

import com.miportfolio.Agustin.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Integer>{
    
    //*Busca por el nombre*//
    public Optional<Persona> findByNombre(String nombre);
    
    //*Pregunta si ya existe el nombre*//
    public boolean existsByNombre(String nombre);
    
}
