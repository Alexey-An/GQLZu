package com.gqlzu.dao.repostiory;

import com.gqlzu.dao.entity.Role;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
