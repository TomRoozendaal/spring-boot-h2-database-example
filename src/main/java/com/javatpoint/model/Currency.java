package com.javatpoint.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table(name = "currency")
public class Currency {
	//mark id as primary key
	@Id
	//defining ticker id as column name
	@Column
	private String id;
	//defining name as column name
	@Column
	private String name;
	//defining value as column name
	@Column
	private int value;
	//defining market cap as column name
	@Column
	private int marketCap;
	
	/**
	 * Currency Object constructor
	 * @param id, ticker id
	 * @param name, name of currency
	 * @param value, number of coins available
	 * @param marketCap, market cap value
	 */
	public Currency(String id, String name, int value, int marketCap) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.marketCap = marketCap;
	}
	
	/**
	 * Retrieves ticker id from Currency object
	 * @return id, ticker id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets ticker id of Currency object
	 * @param id, ticker id
	 * @throws IllegalArgumentException, if id is not a character string of length 3
	 */
	public void setId(String id) throws IllegalArgumentException {
		if (id.length() != 3) {
			throw new IllegalArgumentException("id = "+ id +" is not a valid argument.");
		}
		this.id = id;
	}
	
	/**
	 * Retrieves name from Currency object
	 * @return name, name of currency
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets name of Currency object
	 * @param name, name of currency
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Retrieves number of coins of Currency object
	 * @return value, number of coins
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Sets the number of coins for Currency object
	 * @param value, number of coins
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Retrieves market cap of Currency object
	 * @return marketCap, market cap of currency
	 */
	public int getMarketCap() {
		return marketCap;
	}
	
	/**
	 * Sets market cap of Currency object
	 * @param marketCap, market cap of currency
	 */
	public void setMarketCap(int marketCap) {
		this.marketCap = marketCap;
	}
}