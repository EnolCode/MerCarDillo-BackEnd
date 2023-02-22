package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.MerCarDilloBack.MerCardilloBack.entity.Anuncio;
import com.MerCarDilloBack.MerCardilloBack.repository.AnuncioRepository;

@Service
public class AnuncioServiceImpl implements AnuncioService {
    
    @Autowired
    private AnuncioRepository anuncioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Anuncio> findAll() {

        return anuncioRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Anuncio> findAll(Pageable pageable) {
        return anuncioRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Anuncio> findById(Long id) {
        return anuncioRepository.findById(id);
    }

    @Transactional
    @Override
    public Anuncio save(Anuncio anuncio) {
        return anuncioRepository.save(anuncio);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        anuncioRepository.deleteById(id);
    }
}
