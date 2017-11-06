package tn.mine.banque.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.mine.banque.entites.Compte;
import tn.mine.banque.entites.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

	@Query("select o from Operation o where o.compte.codeCompte=:x")
	public Page<Operation> getOperations(@Param("x") String codeCompte,Pageable pageable);
	//  <==>
	public Page<Operation> findByCompte(Compte compte,Pageable pageable);
	
	
}
