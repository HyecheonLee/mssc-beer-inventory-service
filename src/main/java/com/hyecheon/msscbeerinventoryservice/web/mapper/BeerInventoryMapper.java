package com.hyecheon.msscbeerinventoryservice.web.mapper;

import com.hyecheon.msscbeerinventoryservice.domain.BeerInventory;
import com.hyecheon.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * @author hyecheon
 * @date 2020-01-30
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

  BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

  BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
