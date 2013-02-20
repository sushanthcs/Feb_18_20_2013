package com.durasoft

class Account {
	int accountNumber
	double balance
    static constraints = {
    }
	static mapping = {
		table "accounts"
		accountNumber column:"account_number"
	}
}
