package csgame;

import java.util.Scanner;

public class Caishu {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=(int)(Math.random()*100);
		//int 秦鸿祜;
		int count=0;
		int a=0;
		System.out.println("我已经想好了一个0—100的数");
		do
		{
			System.out.println("请猜这0-100个数");
			a=in.nextInt();
			if(a>number)
			{
				System.out.println("你才的这个数大了");
				count++;
			}
			else if(a<number)
			{
				System.out.println("你猜的数小了");
				count++;
			}
			
		}while(a!=number);
		System.out.println("我是玉辉；我终于你猜对了。我用了"+count+"次猜到了这个答案，我承认我是笨蛋");

	}

}
