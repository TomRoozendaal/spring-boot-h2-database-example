package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.Currency;
import com.javatpoint.service.CurrencyService;
/**
 * 
 * @author tvroo
 * Currency controller, defines http endpoints for currency manipulation 
 *
 */
@RestController
public class CurrencyController 
{
	//autowired the CurrencyService class
	@Autowired
	CurrencyService currencyService;
	
	//creating a get mapping that retrieves all the currencies details from the database 
	@GetMapping("/currencies")
	private List<Currency> getAllCurrencies() {
		return currencyService.getAllCurrencies();
	}
	//creating a get mapping that retrieves the details of a specific currency
	@GetMapping("api/currencies/{id}")
	private Currency getCurrency(@PathVariable("id") int id) {
		return currencyService.getCurrencyById(id);
	}
	//creating a delete mapping that deletes a specific currency
	@DeleteMapping("api/currencies/{id}")
	private void deleteCurrency(@PathVariable("id") int id) {
		currencyService.delete(id);
	}
	//creating post mapping that post the currency details in the database
	@PostMapping("api/currencies")
	private String saveCurrency(@RequestBody Currency currency) {
		currencyService.saveOrUpdate(currency);
		return currency.getId();
	}
	//updating put mapping that puts the current details in the database
	@PutMapping("api/currencies/{id}")
	private void updateCurrency(@RequestBody Currency currency) {
		currencyService.saveOrUpdate(currency);
	}
}
