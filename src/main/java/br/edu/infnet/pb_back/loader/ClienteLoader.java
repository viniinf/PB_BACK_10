package br.edu.infnet.pb_back.loader;

import br.edu.infnet.pb_back.model.Cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteLoader {
    public List<Cliente> loadClientes(String filePath) {
        List<Cliente> clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                Cliente cliente = createCliente(data);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace(); // handle the exception according to your needs
        }

        return clientes;
    }

    private Cliente createCliente(String[] data) {
        // Parse the data and create a Cliente object
        // Example: return new Cliente(Long.parseLong(data[0]), data[1], data[2], ..., data[6]);
        return new Cliente(
                Long.parseLong(data[0]),
                data[1],
                data[2],
                LocalDate.parse(data[3]),
                data[4],
                data[5],
                data[6]
        );
    }}