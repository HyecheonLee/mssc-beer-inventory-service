package com.hyecheon.msscbeerinventoryservice.repository;

import com.hyecheon.msscbeerinventoryservice.domain.BeerInventory;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hyecheon
 * @date 2020-01-30
 */
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {
  List<BeerInventory> findAllByBeerId(UUID beerId);

}
