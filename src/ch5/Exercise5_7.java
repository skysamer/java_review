package ch5;

public class Exercise5_7 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money=Integer.parseInt(args[0]);
		
		System.out.println("money= "+money);
		
		int[] coinUnit= {500, 100, 50, 10};
		int[] coin= {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum=0;
			
			coinNum=money/coinUnit[i];
			if(coinNum>coin[i])
				coinNum=5;
			money-=coinNum*coinUnit[i];
			coin[i]=coin[i]-coinNum;
			System.out.printf("%d��: %d%n", coinUnit[i], coinNum);
		}
		
		if(money>0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		
		System.out.println("==���� ������ ����==");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.printf("%d��: %d%n", coinUnit[i], coin[i]);
		}

	}

}
