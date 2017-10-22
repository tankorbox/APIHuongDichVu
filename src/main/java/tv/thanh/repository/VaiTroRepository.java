package tv.thanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tv.thanh.model.VaiTro;

@Repository
public interface VaiTroRepository extends JpaRepository<VaiTro, Integer> {
	
}
