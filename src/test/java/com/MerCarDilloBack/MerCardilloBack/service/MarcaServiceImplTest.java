package com.MerCarDilloBack.MerCardilloBack.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.MerCarDilloBack.MerCardilloBack.entity.MarcaCoche;
import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;
import com.MerCarDilloBack.MerCardilloBack.repository.MarcaRepository;
import com.MerCarDilloBack.MerCardilloBack.repository.TipoRepository;

@ExtendWith(MockitoExtension.class)
public class MarcaServiceImplTest {

    @Mock
    private MarcaRepository repository;

    @InjectMocks
    private MarcaServiceImpl service;

    @Test
    public void testFindAll() {
        // Given
        MarcaCoche tipo1 = new MarcaCoche("Ferrari");
        tipo1.setMarca("Ford");

        List<MarcaCoche> result = service.findAll();
        result.add(tipo1);

        assertEquals("Ford",result.get(0).getMarca());
    }
}