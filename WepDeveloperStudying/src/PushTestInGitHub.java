import java.util.Scanner;

public class PushTestInGitHub {

	public static void main(String[] args) {
		System.out.println("���� ����� ��");
		Scanner sc=new Scanner(System.in);
		int cnt= sc.nextInt();
		String name[]= new String[cnt]; String grade[]= new String[cnt];
		int wt[]= new int[cnt];	int ppt[] = new int[cnt];
		int word[]=new int[cnt];	int spread[] =new int[cnt];
		int sum[]=new int[cnt];
		
		
		int A, B, C, D=0;
		
		for(int i=0;i<cnt;i++) {
			System.out.print("�̸� : ");
				name[i] = sc.next();
			System.out.print("�ʱ���� : ");
				wt[i] = sc.nextInt();
			System.out.print("���� : ");
				word[i] = sc.nextInt();
			System.out.print("�Ŀ�����Ʈ : ");
				ppt[i] = sc.nextInt();
			System.out.print("�������� : ");
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
		
		
		System.out.println("�̸�\t�ʱ�\t����\t�Ŀ�����Ʈ\t��������\t����\t���\n");
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
			
		System.out.println("A��� : "+amount[0]+"��\n");
		System.out.println("B��� : "+amount[1]+"��\n");
		System.out.println("C��� : "+amount[2]+"��\n");
		System.out.println("D��� : "+amount[3]+"��\n");
			
		}

		
				
	}
		
			