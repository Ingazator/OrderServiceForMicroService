package uz.pdp.orderserviceformicroservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.orderserviceformicroservice.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
