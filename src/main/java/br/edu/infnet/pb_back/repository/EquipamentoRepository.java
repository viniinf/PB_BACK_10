package br.edu.infnet.pb_back.repository;

import br.edu.infnet.pb_back.model.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
    // métodos personalizados, se necessário
}
