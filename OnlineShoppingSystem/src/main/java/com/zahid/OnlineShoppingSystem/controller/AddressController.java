package com.zahid.OnlineShoppingSystem.controller;

import com.zahid.OnlineShoppingSystem.model.Address;
import com.zahid.OnlineShoppingSystem.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
   AddressService addressService;

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @GetMapping
    public List<Address> getAddressesByUserId(@RequestParam Integer userId) {
        return addressService.getAddressesByUserId(userId);
    }

    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable Integer addressId) {
        addressService.deleteAddress(addressId);
    }
}

