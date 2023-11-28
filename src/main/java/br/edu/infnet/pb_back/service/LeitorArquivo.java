package br.edu.infnet.pb_back.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorArquivo {

    public String lerArquivo(String caminho) {
        try {
            Path path = Paths.get(caminho);
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            // Log ou outra manipulação de exceção
            return "Erro na leitura do arquivo";
        }
    }
}
