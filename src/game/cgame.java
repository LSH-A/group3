package Java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class cgame {
	public boolean main() {
		int damage=0;
		int cleartime=0;//Ŭ�����ϱ���� �ɸ� Ƚ��
		int mode=0;//�ΰ��� ���̵��� ��带 ����.
 		cgamebase c=new cgamebase();//�Ѵ� �̸� ���������ش�.
 		cgamehard h=new cgamehard();
 		Scanner src=new Scanner(System.in);
 		//����
 		System.out.println("Welcome to Newton hall");
		System.out.println("we prepare some crcuit game for you "+Character.getName());
		System.out.println("We have a 2 mode of game");
		System.out.println("1. just connect the crcuit from start to goal");
		System.out.println("2. Keep the power level above 1 and connect the start to the goal ");
		System.out.println("Please enter your choice(1. without power level, 2.with power level)");
		//�߸��� �Է��� �����ϰ� �ٽ� �ϵ��� �Ѵ�.
		while(mode!=1||mode!=2) {
		
			try {
			mode=src.nextInt();
		 	if(mode==1) { 
		 		cleartime=c.menu();
		 		break;
		 		}
		 	else if(mode==2){
		 		cleartime=h.menu();
		 		break;
		 		}
		 	else System.out.println("You Put the Wrong Number! please re-enter your choice!");
			} catch(InputMismatchException e){
			 	System.out.println("You Put the Wrong Type!! please re-enter your choice!");		 
			 	src.nextLine();
		 	}
		}
 		
		if(cleartime!=-1) {
		System.out.println("You tried "+cleartime+"times");//�Ϸ���� �ɸ� �õ�Ƚ���� ��½����ش�.
		if (cleartime<5)damage= 0;//3�������� �Ǽ��� ��ȿ�� ó���Ѵ�.
		else if(cleartime<13) damage =cleartime-5;// 4���̻��� �Ǽ��� 3��ŭ �����ؼ� �������� �ش�.
		else damage= 8;//���� �� �������� 3�� ������� 3���� �����Ѵ�.
		Character.growHp(-damage);
		return true;//������
		}
		else return false;//���н�
	}
	

	
}
