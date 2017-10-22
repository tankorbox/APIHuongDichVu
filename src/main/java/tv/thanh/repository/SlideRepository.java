package tv.thanh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tv.thanh.model.Slide;

@Repository
public interface SlideRepository extends JpaRepository<Slide, Integer> {
	
}
