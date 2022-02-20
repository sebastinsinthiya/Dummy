package org.dummy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class Dummy {
	public static void main(String[] args) {
		String s = "sinthiya is a good girl";
		String[] split = s.split(" ");
		String output = "";
		for(int i=split.length-1; i>=0; i--) {
			String word = split[i];
			System.out.println(word);
			for(int j=word.length()-1; j>=0; j--) {
				output = output+word.charAt(j);
			}
			output= output+" ";
		}
		System.out.println(output);
	}
}