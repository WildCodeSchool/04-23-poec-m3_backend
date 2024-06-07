package com.poec.projet_backend.domains.language;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Long>{
    @Query(
            value = "SELECT * FROM language",
            nativeQuery = true)
    List<Language> findAllLanguages();
}
