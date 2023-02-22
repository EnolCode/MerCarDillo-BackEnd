package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

import com.MerCarDilloBack.MerCardilloBack.entity.MarcaCoche;
import com.MerCarDilloBack.MerCardilloBack.repository.MarcaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MarcaServiceImpl implements MarcaService {
    
    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<MarcaCoche> findAll() {
        return marcaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<MarcaCoche> findAll(Pageable pageable) {
        return marcaRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<MarcaCoche> findById(Long id) {
        return marcaRepository.findById(id);
    }

    @Transactional
    @Override
    public MarcaCoche save(MarcaCoche marca) {
        return marcaRepository.save(marca);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        marcaRepository.deleteById(id);
    }
}
