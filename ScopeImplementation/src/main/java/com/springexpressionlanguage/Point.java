package com.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Point {

	@Value("#{33+44}") // SpEL 
	private int a;
	@Value("#{8>3? 88: 54}") 
	private int b;
	@Value("#{T(java.lang.Math).sqrt(4)}") // static method 
	private int c;
	@Value("#{T(java.lang.Math).PI}") //static variable 
	private double d;
	@Value("#{new java.lang.String('Priyanka Kulkarni')}") // object creation
	private String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	/**
	 * @return the d
	 */
	public double getD() {
		return d;
	}
	/**
	 * @param d the d to set
	 */
	public void setD(double d) {
		this.d = d;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", name=" + name + "]";
	}
	
}