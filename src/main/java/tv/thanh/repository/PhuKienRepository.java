package tv.thanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.thanh.model.PhuKien;

@Repository
public interface PhuKienRepository extends JpaRepository<PhuKien, Integer> {

}
