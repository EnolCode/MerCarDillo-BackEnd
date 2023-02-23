package com.MerCarDilloBack.MerCardilloBack.service;

import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;

import com.MerCarDilloBack.MerCardilloBack.entity.Provincia;
import com.MerCarDilloBack.MerCardilloBack.repository.ProvinciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl implements ProvinciaService {
    
    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Provincia> findAll() {
        return provinciaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Provincia> findAll(Pageable pageable) {
        return provinciaRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Provincia> findById(Long id) {
        return provinciaRepository.findById(id);
    }

    @Transactional
    @Override
    public Provincia save(Provincia provincia) {
        return provinciaRepository.save(provincia);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        provinciaRepository.deleteById(id);
    }
}
