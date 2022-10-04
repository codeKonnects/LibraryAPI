package com.codeKonnects.libraryapi.repositories.users;


import com.codeKonnects.libraryapi.models.users.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
