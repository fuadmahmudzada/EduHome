package org.example.edu2home.repo;

import org.example.edu2home.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository <Service, Long>{
}
