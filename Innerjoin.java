package com.Contacts.www;

public class Innerjoin {

	public static void main(String[] args) {
		SELECT suppliers.supplier_id, suppliers.supplier_name, order1.order_number  
		FROM suppliers   
		INNER JOIN order1  
		ON suppliers.supplier_id = order1.supplier_id;  
	}

}
