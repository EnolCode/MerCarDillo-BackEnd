package com.MerCarDilloBack.MerCardilloBack.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;
import com.MerCarDilloBack.MerCardilloBack.repository.TipoRepository;

@ExtendWith(MockitoExtension.class)
public class TipoServiceImplTest {

    @Mock
    private TipoRepository repository;

    @InjectMocks
    private TipoServiceImpl service;

    @Test
    public void testFindAll() {
        // Given
        TipoCoche tipo1 = new TipoCoche("Deportivo");
        tipo1.setTipo("Mono volumen");

        List<TipoCoche> result = service.findAll();
        result.add(tipo1);

        assertEquals("Mono volumen",result.get(0).getTipo());
    }
}