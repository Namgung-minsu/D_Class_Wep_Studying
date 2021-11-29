import java.util.Scanner;

public class PushTestInGitHub {

	public static void main(String[] args) {
		System.out.println("비교할 대상의 수");
		Scanner sc=new Scanner(System.in);
		int cnt= sc.nextInt();
		String name[]= new String[cnt]; String grade[]= new String[cnt];
		int wt[]= new int[cnt];	int ppt[] = new int[cnt];
		int word[]=new int[cnt];	int spread[] =new int[cnt];
		int sum[]=new int[cnt];
		
		
		int A, B, C, D=0;
		
		for(int i=0;i<cnt;i++) {
			System.out.print("이름 : ");
				name[i] = sc.next();
			System.out.print("필기시험 : ");
				wt[i] = sc.nextInt();
			System.out.print("워드 : ");
				word[i] = sc.nextInt();
			System.out.print("파워포인트 : ");
				ppt[i] = sc.nextInt();
			System.out.print("스프레드 : ");
				spread[i]= sc.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<cnt;i++) {
		sum[i] = wt[i] + word[i] + ppt[i] + spread[i];{
		if(sum[i]>=800) {
			grade[i] = "A";}
		else if(sum[i]>= 550) {
			grade[i] = "B";}
		else if(sum[i]>=300) {
			grade[i] = "C";}
		else {
			grade[i]="D";
			}
		}
		}
		
		
		System.out.println("이름\t필기\t워드\t파워포인트\t스프레드\t총점\t등급\n");
		for (int i=0;i<cnt;i++) {
			System.out.println(name[i]+"\t"+wt[i]+"\t"+word[i]+"\t"+ ppt[i]+"\t"+
			spread[i]+ "\t"+sum[i]+"\t"+grade[i]);
			System.out.println();
		}
		
		int[] amount = new int[4];
		for(int i=0; i <grade.length;i++){
			if(grade[i] =="A")
				amount[0]++;
			else if(grade[i]== "B")
				amount[1]++;
			else if(grade[i]=="C")
				amount[2]++;
			else
				amount[3]++;}
			
		System.out.println("A등급 : "+amount[0]+"명\n");
		System.out.println("B등급 : "+amount[1]+"명\n");
		System.out.println("C등급 : "+amount[2]+"명\n");
		System.out.println("D등급 : "+amount[3]+"명\n");
			
		}

		
				
	}
		
			