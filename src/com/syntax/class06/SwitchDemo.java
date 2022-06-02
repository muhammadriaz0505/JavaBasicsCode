package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		char choice='y';
		String meaning;
		switch(choice) {
		case 'y':
			meaning="yes";
			break;
		case'm':
			meaning="maybe";
			break;
			case'n':
				meaning="no";
				break;
				default:
					meaning="unknown";
			System.out.println(meaning);
		
		}

	}

}
