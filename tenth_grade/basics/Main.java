
import java.util.Scanner; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			
		int count1 = 0, count2 = 0, count3 = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 4; ++i)
		{
			int grad1 = input.nextInt();
			int grad2 = input.nextInt();
			
			if (grad1 > -1 || grad2 > -1)
			{
				++count1; /*��� ������ ������*/
			}
			
			else if (grad1 == -1 && grad2 == -1)
			{
				++count3; /*����� �� ��� ������*/
			}
			
			else{
				++count2; /* ���� �� ��� */
			}
			
		}
		System.out.println("���� �� �������� ������ ��� ������ " + count1);
		System.out.println(" ���� �� �������� ������ ����� ���" + count2);
		System.out.println(" ���� �� �������� ��� ����� ����� ���" + count3);
		
		
//		int buy = input.nextInt();
//		int sell = input.nextInt();
//		
//		buy = buy * 5;
//		sell = sell * 10;
//		
//		if (sell > buy)
//		{
//			System.out.print("goot proofit");
//		}
//		else{
//			System.out.print("NO proofit");
//		}
		
		
		
//		int count = 0;
//		
//		for (int i = 0; i < 101; ++i)
//		{
//			if (i % 3 == 0)
//			{
//				count += 1;
//			}
//		}
//		
//		System.out.println(count);

	}

}
