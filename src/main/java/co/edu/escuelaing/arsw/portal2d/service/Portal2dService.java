package co.edu.escuelaing.arsw.portal2d.service;

import co.edu.escuelaing.arsw.portal2d.model.Mapa;
import co.edu.escuelaing.arsw.portal2d.model.Sala;
import co.edu.escuelaing.arsw.portal2d.repository.MapaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Portal2dService {
    @Autowired
    private MapaDao mapaRepo;

    public Mapa getMapaByName(String name) throws MapaNotFoundException {
        mapaRepo.save(new Mapa("primero","{estruvtura feik}"));
        Mapa ans = mapaRepo.findById(name).orElseThrow(MapaNotFoundException::new);
        return ans;
    }

    public Sala getNewSala(){

        return new Sala("xyhjk2",1);
    }



}
