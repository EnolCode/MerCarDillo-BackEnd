package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.MerCarDilloBack.MerCardilloBack.entity.Anuncio;

public interface AnuncioService {
    public List<Anuncio> findAll();

    public Page<Anuncio> findAll(Pageable pageable);

    public Optional<Anuncio> findById(Long id);

    public Anuncio save(Anuncio anuncio);

    public void deleteById(Long id);
}
