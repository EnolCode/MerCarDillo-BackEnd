package com.MerCarDilloBack.MerCardilloBack.controller;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.MerCarDilloBack.MerCardilloBack.entity.AnuncioCoche;
import com.MerCarDilloBack.MerCardilloBack.service.AnuncioService;

@WebMvcTest(controllers = AnuncioController.class)
public class AnuncioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AnuncioService service;

    @Test
    void test_findAll_return_all_tipos() throws Exception{

        List<AnuncioCoche> provincias = new ArrayList<>();
        AnuncioCoche anuncio = new AnuncioCoche("anuncio 1");
        provincias.add(anuncio);

        when(service.findAll()).thenReturn(provincias);

        MockHttpServletResponse response = mockMvc.perform(get("/api/mercardillo/anuncios").contentType("application/json"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();

        assertEquals(200, response.getStatus());
        assertEquals(true,response.getContentAsString().contains("anuncio 1"));
    }
}
