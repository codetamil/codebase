package test;

import java.util.*;

import util.GstCalc;


public class TestGstCalculator {
	public static void main(String args[])
	{
		double amt,bill;
		GstCalc g=new GstCalc();
		Scanner s=new Scanner(System.in);
		amt=s.nextDouble();
		System.out.println(g.calc(amt));
		bill=amt+(g.calc(amt));
		System.out.println("total bill:"+bill);
	}

}
