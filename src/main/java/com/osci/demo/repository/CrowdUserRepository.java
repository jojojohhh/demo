package com.osci.demo.repository;

import com.osci.demo.entity.CrowdUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CrowdUserRepository extends JpaRepository<CrowdUser, Long> {

    @Query(value = "SELECT * FROM CROWD_USER", nativeQuery = true)
    Stream<CrowdUser> streamAll();

}
