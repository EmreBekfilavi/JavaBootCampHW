package kodlama.io.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguages.entities.Technology;

public interface ITechnologyRepository extends JpaRepository<Technology, Integer> {


}
