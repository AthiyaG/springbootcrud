package com.renault.mycrudapp.springbootcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renault.mycrudapp.springbootcrudapp.model.users_data;


@Repository
public interface userRepository extends JpaRepository<users_data,Integer> {

}
