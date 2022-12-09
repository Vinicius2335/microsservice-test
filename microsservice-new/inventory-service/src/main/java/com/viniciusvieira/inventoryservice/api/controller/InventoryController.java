package com.viniciusvieira.inventoryservice.api.controller;

import com.viniciusvieira.inventoryservice.api.representation.model.response.InventoryResponse;
import com.viniciusvieira.inventoryservice.domain.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    //@GetMapping("/{sku-code}")
    //@ResponseStatus(HttpStatus.OK)
    //public boolean isInStock(@PathVariable("sku-code") String skuCode){
    //    return inventoryService.isInStock(skuCode);
    //}

    //http://localhost:8082/api/inventory?skuCode=iphone_11&skuCode=iphone_13
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam() List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
