package com.example.catalogo_sakila.domains.contracts.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.example.catalogo_sakila.domains.entities.Language;

public interface LanguageRepository extends ListCrudRepository<Language, Integer> {
    List<Language> findAllByOrderByName();
    List<Language> findByLastUpdateGreaterThanEqualOrderByLastUpdate(Timestamp fecha);
    List<Language> findByNameStartingWith(String letra);
    List<Language> findTop3By();
}
