package com.aexp.crud.crud.repository;

import com.aexp.crud.crud.model.AmexIntern;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmexRepo extends CrudRepository<AmexIntern, Long> {
}
