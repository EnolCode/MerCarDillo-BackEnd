package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.MerCarDilloBack.MerCardilloBack.entity.MarcaCoche;

public interface MarcaService {
    public List<MarcaCoche> findAll();

    public Page<MarcaCoche> findAll(Pageable pageable);

    public Optional<MarcaCoche> findById(Long id);

    public MarcaCoche save(MarcaCoche marca);

    public void deleteById(Long id);
}
