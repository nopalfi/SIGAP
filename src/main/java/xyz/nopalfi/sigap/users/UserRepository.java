package xyz.nopalfi.sigap.users;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User getUserById(Long id);
}
