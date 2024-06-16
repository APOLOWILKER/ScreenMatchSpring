package br.com.alura.screenmatchspring.Service;

import br.com.alura.screenmatchspring.model.DadosSerie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// modelando dados da serie
public class ConvertDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obeterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
