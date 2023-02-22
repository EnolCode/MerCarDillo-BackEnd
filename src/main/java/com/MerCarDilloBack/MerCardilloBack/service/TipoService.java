package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;

public interface TipoService {
    public List<TipoCoche> findAll();

    public Page<TipoCoche> findAll(Pageable pageable);

    public Optional<TipoCoche> findById(Long id);

    public TipoCoche save(TipoCoche tipoCoche);

    public void deleteById(Long id);
}
