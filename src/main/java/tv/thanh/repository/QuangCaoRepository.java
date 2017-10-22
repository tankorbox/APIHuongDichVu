package tv.thanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.thanh.model.QuangCao;

@Repository
public interface QuangCaoRepository extends JpaRepository<QuangCao, Integer> {
	
}
