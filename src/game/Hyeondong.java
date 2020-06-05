import java.util.*;
public class Hyeondong {
	private int answer1 = 1;
	private int answer2 = 1;
	private int answer3 = 4;
	private int score = 0;
	private String right = "Correct Answer!\n";
	private String wrong = "Wrong Answer...\n";
	
	public void show() 
	{//method to print quiz
		System.out.println("--------------------------------[Hyeondong-Hall]--------------------------------");
		System.out.println("This is Hyeondong Hall.");
		System.out.println("Hyeondong Hall is the main building of Handong University.");
		System.out.println("There are classrooms, professor's office, various administrative departments, and the president's office in the Hyeondong Hall.");
		System.out.println("Let's take a quiz about Handong University.");
		System.out.println("--------------------------------------------------------------------------------");
		try {
		      Thread.sleep(2 * 1000);
		    } catch (InterruptedException e) { }
	
	}
	public boolean quiz() {
	
		show();
		Scanner schd = new Scanner(System.in);
		System.out.println("Which bird is the symbol of Handong University? \n");
		System.out.println("(1) Seagull ");
		System.out.println("(2) Albatross ");
		System.out.println("(3) Dove ");
		System.out.println("(4) Hawk ");
		int s1 = schd.nextInt(); 
		if(s1== answer1) {
			System.out.println(right);
			score++;
		}else {
			System.out.println(wrong);
		}

		System.out.println("Which flower is the symbol of Handong University? \n");
		System.out.println("(1) Rugosa rose ");
		System.out.println("(2) Sunflower ");
		System.out.println("(3) Damask rose");
		System.out.println("(4) Gallic rose ");
		s1 = schd.nextInt(); 
		if(s1==answer2){
			System.out.println(right);
			score++;
		}else {
			System.out.println(wrong);
		}

		System.out.println("Which tree is the symbol of Handong University? \n");
		System.out.println("(1) Beech tree ");
		System.out.println("(2) Oak tree ");
		System.out.println("(3) Ash tree ");
		System.out.println("(4) Black pine ");
		s1 = schd.nextInt(); 
		if(s1==answer3){
			System.out.println(right);
			score++;
		}else {
			System.out.println(wrong);
		}
		if(score<3) {
			Character.growHp(-5);
			return false;
		}else {
			return true;
		}
		  
	}
	

	
	
}
