package com.github.example.springredistplexample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Storage extends CrudRepository<Model, String> {
}
