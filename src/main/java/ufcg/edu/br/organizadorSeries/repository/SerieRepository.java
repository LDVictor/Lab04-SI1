package ufcg.edu.br.organizadorSeries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufcg.edu.br.organizadorSeries.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {

}
