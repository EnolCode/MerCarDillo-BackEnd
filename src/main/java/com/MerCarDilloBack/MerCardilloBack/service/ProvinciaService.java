package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.MerCarDilloBack.MerCardilloBack.entity.Provincia;

public interface ProvinciaService {
    public List<Provincia> findAll();

    public Page<Provincia> findAll(Pageable pageable);

    public Optional<Provincia> findById(Long id);

    public Provincia save(Provincia provincia);

    public void deleteById(Long id);
}
