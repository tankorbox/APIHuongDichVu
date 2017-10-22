package tv.thanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.thanh.model.DienThoai;


@Repository
public interface DienThoaiRepository extends JpaRepository<DienThoai, Integer> {

}
