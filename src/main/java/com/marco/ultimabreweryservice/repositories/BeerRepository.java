package com.marco.ultimabreweryservice.repositories;

import com.marco.ultimabreweryservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
  }
