package com.ceenuts.spring5webapp.repositories;

import com.ceenuts.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
