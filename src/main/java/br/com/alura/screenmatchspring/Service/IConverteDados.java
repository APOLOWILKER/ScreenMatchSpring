package br.com.alura.screenmatchspring.Service;

public interface IConverteDados {
    <T> T obeterDados(String json, Class<T> classe);
}
