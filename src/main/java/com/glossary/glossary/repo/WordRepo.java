package com.glossary.glossary.repo;

import com.glossary.glossary.entity.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepo extends CrudRepository<Word,Long> {
    public Word save(Word word);

    Iterable<Word> findAllByOrderByIdDesc();
}
