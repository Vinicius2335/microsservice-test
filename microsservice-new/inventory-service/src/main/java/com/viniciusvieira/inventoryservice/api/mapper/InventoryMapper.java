package com.viniciusvieira.inventoryservice.api.mapper;

import com.viniciusvieira.inventoryservice.api.representation.model.response.InventoryResponse;
import com.viniciusvieira.inventoryservice.domain.model.Inventory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InventoryMapper {
    private final ModelMapper modelMapper;

    public InventoryResponse toInventoryResponse(Inventory inventory){
        return modelMapper.map(inventory, InventoryResponse.class);
    }
}
