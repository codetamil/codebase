package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingAUrl {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

		
	}

}
