package com.bada.exercise2;

public interface ReadOnlyBook {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	Price getPrice();

}