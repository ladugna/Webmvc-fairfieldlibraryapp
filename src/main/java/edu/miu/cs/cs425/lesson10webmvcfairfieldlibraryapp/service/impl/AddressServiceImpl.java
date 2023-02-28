package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.impl;


import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Address;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.repository.AddressRepository;
import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }

}
