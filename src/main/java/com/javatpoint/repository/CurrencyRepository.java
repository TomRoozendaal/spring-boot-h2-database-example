package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
}
