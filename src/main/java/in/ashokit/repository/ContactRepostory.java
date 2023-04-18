package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.binding.contact;

@Repository
public interface ContactRepostory extends JpaRepository<contact,Integer>{

	 

}
