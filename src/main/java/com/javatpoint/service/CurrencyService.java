package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Currency;
import com.javatpoint.repository.CurrencyRepository;
//defining the business logic
@Service
public class CurrencyService {
	@Autowired
	CurrencyRepository currencyRepository;
	
	/**
	 * Retrieves all currencies
	 * @return list of all currencies
	 */
	public List<Currency> getAllCurrencies() {
		List<Currency> currencies = new ArrayList<Currency>();
		currencyRepository.findAll().forEach(currency -> currencies.add(currency));
		return currencies;
	}
	/**
	 * Retrieves a specific currency by ticker id
	 * @param id, ticker id
	 * @return Currency object with id as ticker id
	 */
	public Currency getCurrencyById(int id) {
		return currencyRepository.findById(id).get();
	}
	
	/**
	 * Saves or updates currency
	 * @param currency to be updated
	 */
	public void saveOrUpdate(Currency currency) {
		currencyRepository.save(currency);
	}
	
	/**
	 * Deletes currency with id as ticker id
	 * @param id, ticker id
	 */
	public void delete(int id) {
		currencyRepository.deleteById(id);
	}
	
}