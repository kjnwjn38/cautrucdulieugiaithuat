package com.b1l1.aplication;

public class Fraction {
	public int numer=0;
	public int denom=1;
	public  Fraction() {
		this.numer=0;
		this.denom=1;
	}
	public Fraction(int x,int y) {
		this.numer=x;
		this.denom=y;
	}
	public Fraction(Fraction f) {
		this.numer=f.numer;
		this.denom=f.denom;
	}
	public String toString() {
		return this.numer+"/"+this.denom;
	}
	
}
