package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;
import com.MerCarDilloBack.MerCardilloBack.repository.TipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TipoServiceImpl implements TipoService {
    
    @Autowired
    private TipoRepository tipoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TipoCoche> findAll() {
        return tipoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<TipoCoche> findAll(Pageable pageable) {
        return tipoRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<TipoCoche> findById(Long id) {
        return tipoRepository.findById(id);
    }

    @Transactional
    @Override
    public TipoCoche save(TipoCoche tipoCoche) {
        return tipoRepository.save(tipoCoche);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        tipoRepository.deleteById(id);
    }
}
