package com.MerCarDilloBack.MerCardilloBack.controller;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;
import com.MerCarDilloBack.MerCardilloBack.service.TipoService;

@WebMvcTest(controllers = TipoController.class)
public class TipoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TipoService service;

    @Test
    void test_findAll_return_all_tipos() throws Exception{

        List<TipoCoche> tipos = new ArrayList<>();
        TipoCoche deportivo = new TipoCoche("Deportivo");
        tipos.add(deportivo);

        when(service.findAll()).thenReturn(tipos);

        MockHttpServletResponse response = mockMvc.perform(get("/api/mercardillo/tipos").contentType("application/json"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();

        assertEquals(200, response.getStatus());
        assertEquals(true,response.getContentAsString().contains("Deportivo"));
    }
}
