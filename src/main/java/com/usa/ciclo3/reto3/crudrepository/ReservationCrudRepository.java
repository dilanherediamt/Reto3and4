package com.usa.ciclo3.reto3.crudrepository;

import com.usa.ciclo3.reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
