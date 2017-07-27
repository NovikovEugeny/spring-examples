package by.tc.test.repository;

import by.tc.test.entity.Order;
import by.tc.test.repository.query.QueryStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    Order findOrderById(int id);

    @Modifying
    @Query(value = QueryStore.ORDER_RECIPE_INSERT, nativeQuery = true)
    @Transactional
    void saveWithRecipe(@Param("orderId") int orderId, @Param("recipeCode") String recipeCode);


}