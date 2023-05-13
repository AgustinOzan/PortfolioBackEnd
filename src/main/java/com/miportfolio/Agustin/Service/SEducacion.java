package com.miportfolio.Agustin.Service;

import com.miportfolio.Agustin.Entity.Educacion;
import com.miportfolio.Agustin.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
  //*Nos trae una lista*//
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
   
    //*Buscar por ID*//
    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    }
    
    //*Buscar por NOMBRE*//
    public Optional<Educacion> getByNombreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }
    
    //*Guarda el objeto EDUCACION*//
    public void save(Educacion educacion){
        rEducacion.save(educacion);
    }
    
     //*Borrar objeto por ID*//
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    //*Se fija si ya existe por ID*//
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
     //*Se fija si ya existe por NOMBRE*//
    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    }
     
}
