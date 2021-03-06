package Algorithms;
import java.util.ArrayList;
//Given a collection of strings, Return all possible permutations.
//Example : abcd
//[[a, a, a, a], [a, a, a, b], [a, a, a, c], [a, a, a, d], [a, a, b, a], [a, a, b, b], [a, a, b, c], [a, a, b, d], [a, a, c, a], [a, a, c, b], [a, a, c, c], [a, a, c, d], [a, a, d, a], [a, a, d, b], [a, a, d, c], [a, a, d, d], [a, b, a, a], [a, b, a, b], [a, b, a, c], [a, b, a, d], [a, b, b, a], [a, b, b, b], [a, b, b, c], [a, b, b, d], [a, b, c, a], [a, b, c, b], [a, b, c, c], [a, b, c, d], [a, b, d, a], [a, b, d, b], [a, b, d, c], [a, b, d, d], [a, c, a, a], [a, c, a, b], [a, c, a, c], [a, c, a, d], [a, c, b, a], [a, c, b, b], [a, c, b, c], [a, c, b, d], [a, c, c, a], [a, c, c, b], [a, c, c, c], [a, c, c, d], [a, c, d, a], [a, c, d, b], [a, c, d, c], [a, c, d, d], [a, d, a, a], [a, d, a, b], [a, d, a, c], [a, d, a, d], [a, d, b, a], [a, d, b, b], [a, d, b, c], [a, d, b, d], [a, d, c, a], [a, d, c, b], [a, d, c, c], [a, d, c, d], [a, d, d, a], [a, d, d, b], [a, d, d, c], [a, d, d, d], [b, a, a, a], [b, a, a, b], [b, a, a, c], [b, a, a, d], [b, a, b, a], [b, a, b, b], [b, a, b, c], [b, a, b, d], [b, a, c, a], [b, a, c, b], [b, a, c, c], [b, a, c, d], [b, a, d, a], [b, a, d, b], [b, a, d, c], [b, a, d, d], [b, b, a, a], [b, b, a, b], [b, b, a, c], [b, b, a, d], [b, b, b, a], [b, b, b, b], [b, b, b, c], [b, b, b, d], [b, b, c, a], [b, b, c, b], [b, b, c, c], [b, b, c, d], [b, b, d, a], [b, b, d, b], [b, b, d, c], [b, b, d, d], [b, c, a, a], [b, c, a, b], [b, c, a, c], [b, c, a, d], [b, c, b, a], [b, c, b, b], [b, c, b, c], [b, c, b, d], [b, c, c, a], [b, c, c, b], [b, c, c, c], [b, c, c, d], [b, c, d, a], [b, c, d, b], [b, c, d, c], [b, c, d, d], [b, d, a, a], [b, d, a, b], [b, d, a, c], [b, d, a, d], [b, d, b, a], [b, d, b, b], [b, d, b, c], [b, d, b, d], [b, d, c, a], [b, d, c, b], [b, d, c, c], [b, d, c, d], [b, d, d, a], [b, d, d, b], [b, d, d, c], [b, d, d, d], [c, a, a, a], [c, a, a, b], [c, a, a, c], [c, a, a, d], [c, a, b, a], [c, a, b, b], [c, a, b, c], [c, a, b, d], [c, a, c, a], [c, a, c, b], [c, a, c, c], [c, a, c, d], [c, a, d, a], [c, a, d, b], [c, a, d, c], [c, a, d, d], [c, b, a, a], [c, b, a, b], [c, b, a, c], [c, b, a, d], [c, b, b, a], [c, b, b, b], [c, b, b, c], [c, b, b, d], [c, b, c, a], [c, b, c, b], [c, b, c, c], [c, b, c, d], [c, b, d, a], [c, b, d, b], [c, b, d, c], [c, b, d, d], [c, c, a, a], [c, c, a, b], [c, c, a, c], [c, c, a, d], [c, c, b, a], [c, c, b, b], [c, c, b, c], [c, c, b, d], [c, c, c, a], [c, c, c, b], [c, c, c, c], [c, c, c, d], [c, c, d, a], [c, c, d, b], [c, c, d, c], [c, c, d, d], [c, d, a, a], [c, d, a, b], [c, d, a, c], [c, d, a, d], [c, d, b, a], [c, d, b, b], [c, d, b, c], [c, d, b, d], [c, d, c, a], [c, d, c, b], [c, d, c, c], [c, d, c, d], [c, d, d, a], [c, d, d, b], [c, d, d, c], [c, d, d, d], [d, a, a, a], [d, a, a, b], [d, a, a, c], [d, a, a, d], [d, a, b, a], [d, a, b, b], [d, a, b, c], [d, a, b, d], [d, a, c, a], [d, a, c, b], [d, a, c, c], [d, a, c, d], [d, a, d, a], [d, a, d, b], [d, a, d, c], [d, a, d, d], [d, b, a, a], [d, b, a, b], [d, b, a, c], [d, b, a, d], [d, b, b, a], [d, b, b, b], [d, b, b, c], [d, b, b, d], [d, b, c, a], [d, b, c, b], [d, b, c, c], [d, b, c, d], [d, b, d, a], [d, b, d, b], [d, b, d, c], [d, b, d, d], [d, c, a, a], [d, c, a, b], [d, c, a, c], [d, c, a, d], [d, c, b, a], [d, c, b, b], [d, c, b, c], [d, c, b, d], [d, c, c, a], [d, c, c, b], [d, c, c, c], [d, c, c, d], [d, c, d, a], [d, c, d, b], [d, c, d, c], [d, c, d, d], [d, d, a, a], [d, d, a, b], [d, d, a, c], [d, d, a, d], [d, d, b, a], [d, d, b, b], [d, d, b, c], [d, d, b, d], [d, d, c, a], [d, d, c, b], [d, d, c, c], [d, d, c, d], [d, d, d, a], [d, d, d, b], [d, d, d, c], [d, d, d, d]]
public class PermutationOfString {
	public static ArrayList<ArrayList<String>> permutation(String input){
		ArrayList<ArrayList<String>> rst = new ArrayList<ArrayList<String>>();
			if(input == null || input.length() == 0){
			return rst;
		}
		char [] charinput =input.toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		helper(rst,list,charinput);
		System.out.println(rst.size());
		return rst;	
	}
	private static void helper(ArrayList<ArrayList<String>> rst, ArrayList<String> list, char[] input) {
		// TODO Auto-generated method stub
		if(list.size() == input.length){
			rst.add(new ArrayList<String>(list));
			return;
		}
		for(int i = 0;i < input.length;i++){
			if(list.contains(input[i])){
				continue;
			}
			list.add(String.valueOf(input[i]));
			helper(rst, list, input);
			list.remove(list.size()-1);	
		}
	}
	public static void main(String [] args){
		String inputString = "abcd";
		System.out.println(permutation(inputString));
	}
}
