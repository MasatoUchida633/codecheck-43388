package codecheck;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		Map<BigInteger, String> fizzBuzzMap = new TreeMap<BigInteger, String>();
		
		for (int i = 0, l = args.length; i < l -1; i++) {
			String inputFizzBuzz[] = args[i].split(":");
			BigInteger a = new BigInteger(inputFizzBuzz[0]);
			StringBuilder s = new StringBuilder();
			for (int j = 1; j < inputFizzBuzz.length; j++) {
				s.append(inputFizzBuzz[j]);
			}
			
			fizzBuzzMap.put(a, s.toString());
		}
		
		BigInteger m = new BigInteger(args[args.length -1]);
		
		StringBuilder answer = new StringBuilder();
		
		for (Map.Entry<BigInteger, String> fizzBuzz : fizzBuzzMap.entrySet()) {
			BigInteger remainder = m.remainder(fizzBuzz.getKey());
			
			if (BigInteger.ZERO.equals(remainder)) {
				answer.append(fizzBuzz.getValue());
			}
		}
		
		if (answer.length() == 0) {
			answer.append(m.toString());
		}
		
		System.out.println(answer.toString());
	}
}
