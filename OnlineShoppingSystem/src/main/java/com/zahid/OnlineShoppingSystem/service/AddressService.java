package com.zahid.OnlineShoppingSystem.service;

import com.zahid.OnlineShoppingSystem.dao.AddressRepository;
import com.zahid.OnlineShoppingSystem.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> getAddressesByUserId(Integer userId) {
        return addressRepository.findByUserId(userId);
    }
    public Address getAddressById(Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }

    public void deleteAddress(Integer addressId) {
        addressRepository.deleteById(addressId);
    }
}

