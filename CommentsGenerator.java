import java.util.Scanner;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

class CommentsGenerator{
	
	private static Scanner input;

	public static void main(String[] args) {
		
		String visability;
		String placement;
		String sponsor;
		String getSponsor;
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nVersion 0.1 \n\nWelcome to the comments generator! Answer questions to generate a comment.\n\nPress \"Enter\" to continue!");
		input.nextLine();
		System.out.println("Is logo visibility good(1) or very good(2)?");  
		//Get input for visability
		String visabilityChoise = input.next();
		if(Integer.parseInt(visabilityChoise)==1) {
			visability = "God";
		}else {
			visability = "Meget god";
		}
		System.out.println("What is the placement of the logo?\n1: skilt\n2: digitalskilt\n3: drakt\n4: treningsdress\n5: bakvegg");  
		//Get input of placementChoise
		String placementChoise = input.next();
		switch (Integer.parseInt(placementChoise)) {
			case 1:
				placement = "skilt";
				break;
			case 2:
				placement = "digitalskilt";
				break;
			case 3:
				placement = "drakt";
				break;
			case 4:
				placement = "treningsdress";
				break;
			case 5:
				placement = "bakvegg";
				break;
			default:
				placement = "Wrong number";
				break;
		}
		//System.out.println("Type the name of the sponsor:");
		//getSponsor = input.nextLine();
		//sponsor = getSponsor.toUpperCase();
		String myString = visability + " eksponering for " + "SP" + " på " + placement;
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
		//Print out the result
		System.out.println(myString);//visability + " eksponering for " + "SP" + " på " + placement);
		input.nextLine();
	}
}
