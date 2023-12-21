package com.scolaire.ecolematernelle.Service;

import com.scolaire.ecolematernelle.Entity.Cour;
import com.scolaire.ecolematernelle.Repository.CourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourService {
    @Autowired
    private CourRepo courRepo;

    public Cour ajtCour(Cour cour){
        return courRepo.save(cour);
    }
    public List<Cour>getAllcours(){
        return courRepo.findAll();
    }
}
