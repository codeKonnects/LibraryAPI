package com.codeKonnects.libraryapi.utility;

import com.codeKonnects.libraryapi.models.users.Role;
import com.codeKonnects.libraryapi.models.users.enums.ERole;
import com.codeKonnects.libraryapi.repositories.users.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Utility {

    private final RoleRepository roleRepository;

    @Autowired
    public Utility(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<Role> assignRole(ERole erole) {
        List<Role> roles = new ArrayList<>();
        if(roleRepository.findByName(erole).isPresent()){
            roles.add(roleRepository.findByName(erole).get());
            return roles;
        }
        Role role = new Role();
        role.setName(erole);
        roleRepository.save(role);
        roles.add(role);
        return roles;
    }
}