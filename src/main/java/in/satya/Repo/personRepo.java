package in.satya.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satya.Entity.Person;

public interface personRepo extends JpaRepository<Person, Integer> {

}
