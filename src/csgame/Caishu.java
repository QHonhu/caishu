package csgame;

import java.util.Scanner;

public class Caishu {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=(int)(Math.random()*100);
		//int �غ���;
		int count=0;
		int a=0;
		System.out.println("���Ѿ������һ��0��100����");
		do
		{
			System.out.println("�����0-100����");
			a=in.nextInt();
			if(a>number)
			{
				System.out.println("��ŵ����������");
				count++;
			}
			else if(a<number)
			{
				System.out.println("��µ���С��");
				count++;
			}
			
		}while(a!=number);
		System.out.println("������ԣ���������¶��ˡ�������"+count+"�βµ�������𰸣��ҳ������Ǳ���");

	}

}
