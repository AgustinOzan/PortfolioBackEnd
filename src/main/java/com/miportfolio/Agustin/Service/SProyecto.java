package com.miportfolio.Agustin.Service;

import com.miportfolio.Agustin.Entity.Proyecto;
import com.miportfolio.Agustin.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired RProyecto rproyecto;
    
    public List<Proyecto> list() {
        return rproyecto.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return rproyecto.findById(id);
    }

    public Optional<Proyecto> getByNombre(String nombre) {
        return rproyecto.findByNombre(nombre);
    }

    public void save(Proyecto proyecto) {
        rproyecto.save(proyecto);
    }

    public void delete(int id) {
        rproyecto.deleteById(id);
    }

    public boolean existsById(int id) {
        return rproyecto.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rproyecto.existsByNombre(nombre);
    }

}
