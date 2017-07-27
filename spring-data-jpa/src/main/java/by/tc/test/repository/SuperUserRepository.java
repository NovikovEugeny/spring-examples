package by.tc.test.repository;

import by.tc.test.entity.SuperUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperUserRepository extends JpaRepository<SuperUser,Long> {
}