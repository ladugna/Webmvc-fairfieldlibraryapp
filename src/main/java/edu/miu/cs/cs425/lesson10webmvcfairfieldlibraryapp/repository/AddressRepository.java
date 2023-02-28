package edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.repository;


import edu.miu.cs.cs425.lesson10webmvcfairfieldlibraryapp.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
