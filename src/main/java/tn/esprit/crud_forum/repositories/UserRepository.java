package tn.esprit.crud_forum.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.crud_forum.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
