package com.api.imc.services;

import com.api.imc.model.Imc;
import com.api.imc.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {

    @Autowired
    private ImcRepository imcRepository;

    public void registerImc(Imc imc){
        imcRepository.save(imc);
    }

    public List<Imc> list(){
        return imcRepository.findAll();
    }

}
