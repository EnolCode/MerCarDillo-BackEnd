package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.MerCarDilloBack.MerCardilloBack.entity.AnuncioCoche;

public interface AnuncioService {
    public List<AnuncioCoche> findAll();

    public Page<AnuncioCoche> findAll(Pageable pageable);

    public Optional<AnuncioCoche> findById(Long id);

    public AnuncioCoche save(AnuncioCoche anuncio);

    public void deleteById(Long id);
}
