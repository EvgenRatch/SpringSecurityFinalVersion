package ru.itsinfo.springbootsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itsinfo.springbootsecurity.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    //Optional<Role> findByName(String name);
}
