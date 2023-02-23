package com.MerCarDilloBack.MerCardilloBack.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.MerCarDilloBack.MerCardilloBack.entity.Provincia;
import com.MerCarDilloBack.MerCardilloBack.repository.ProvinciaRepository;

@ExtendWith(MockitoExtension.class)
public class ProvinciaServiceImplTest {

    @Mock
    private ProvinciaRepository repository;

    @InjectMocks
    private ProvinciaServiceImpl service;

    @Test
    public void testFindAll() {
        // Given
        Provincia tipo1 = new Provincia("Asturias");
        tipo1.setProvincia("Madrid");

        List<Provincia> result = service.findAll();
        result.add(tipo1);

        assertEquals("Madrid",result.get(0).getProvincia());
    }
}