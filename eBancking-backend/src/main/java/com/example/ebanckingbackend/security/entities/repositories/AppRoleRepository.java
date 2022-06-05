package com.example.ebanckingbackend.security.entities.repositories;

import com.example.ebanckingbackend.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    AppRoleRepository findByRoleName( String roleName);
}