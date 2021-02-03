package loopEx1;

public class Q2 {

	public static void main(String[] args) {
		int lineCount=7;
		int starCount=1;
		int spaceCount=lineCount/2+1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i<lineCount/2) {
				starCount+=2;
				spaceCount-=1;
			}
			else {
				starCount-=2;
				spaceCount+=1;
			}
			System.out.println();
		}
	}
}