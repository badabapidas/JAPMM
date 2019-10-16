package com.bada.exercise2;

public class Book implements ReadOnlyBook {
	private int id;
	private String title;
	private String author;
	private Price price;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bada.exercise2.ReadOnlyBook#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bada.exercise2.ReadOnlyBook#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bada.exercise2.ReadOnlyBook#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bada.exercise2.ReadOnlyBook#toString()
	 */
	@Override
	public String toString() {
		return title + " by " + author;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bada.exercise2.ReadOnlyBook#getPrice()
	 */
	@Override
	public Price getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = new Price(price);
	}
}
