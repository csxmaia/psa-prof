package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.entidade.CNH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnhRepository extends JpaRepository<CNHEntidade, Long> {

}