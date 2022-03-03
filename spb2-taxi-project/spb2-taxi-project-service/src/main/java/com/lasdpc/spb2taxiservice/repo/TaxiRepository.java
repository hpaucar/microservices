package com.lasdpc.spb2taxiservice.repo;

import com.lasdpc.spb2taxiservice.model.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends CrudRepository<Taxi, String> {

}
