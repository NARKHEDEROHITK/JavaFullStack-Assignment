package service;

interface Bank {
	void widraw(int accno ,double amount);
	void deposite(int accno ,double amount);
	void checkBalence(int accno);
}
