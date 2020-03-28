package com.idemia.api.dao;

import com.idemia.api.model.Authz;
import org.springframework.data.repository.CrudRepository;

public interface AuthzRepository extends CrudRepository<Authz, String> {
}

