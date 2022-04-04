package com.moini;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CheckedException {
	
	public static void main(String[] args) {
		File f = new File("desktop/note.txt");
		FileInputStream inputStream  = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println(br.readLine());
	}

	
}
