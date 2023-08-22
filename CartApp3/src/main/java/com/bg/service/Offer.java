package com.bg.service;

import com.bg.model.CartItem;

public interface Offer {
	int applyOffer(CartItem product);
	int applyOffer(int amount);
	    
}
