package days3;
import java.util.Scanner;
public class days3_1 {
public  static void main( String args[]) {
	Scanner scanner = new Scanner (System.in);
	int i;
	System.out.println("i�� ������ �Է��ض�: ");
	i = scanner.nextInt();
	int k;
	for ( ; i<10 ; i++) {
		for(k=1; k<10 ; k++)
		System.out.println(i + "*" + k + "=" + i*k);
	}
		
	
	
	
}
}
