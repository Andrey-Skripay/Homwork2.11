package com.example.Homework211;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void welcomeTest() throws Exception {
        mockMvc.perform(get("/calculator"))
                .andExpect(status().isOk())
                .andExpect(content().string("Добро пожаловать в калькулятор"));
    }

    @Test
    public void plusTest() throws Exception {
        mockMvc.perform(get("/calculator/plus?num1=5&num2=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5 + 5 = 10"));
    }

    @Test
    public void minusTest() throws Exception {
        mockMvc.perform(get("/calculator/minus?num1=5&num2=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5 - 5 = 0"));
    }

    @Test
    public void multiplyTest() throws Exception {
        mockMvc.perform(get("/calculator/multiply?num1=5&num2=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5 * 5 = 25"));
    }

    @Test
    public void divideTest() throws Exception {
        mockMvc.perform(get("/calculator/divide?num1=5&num2=5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5 / 5 = 1"));
    }
}
