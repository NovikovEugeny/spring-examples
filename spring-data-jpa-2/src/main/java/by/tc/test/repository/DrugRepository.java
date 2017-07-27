package by.tc.test.repository;

import by.tc.test.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug,Long> {

    Drug findDrugById(int id);

}