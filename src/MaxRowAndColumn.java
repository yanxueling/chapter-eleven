import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class MaxRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>(); //����
	    ArrayList<Integer> list2 = new ArrayList<>();  //����
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the array size n:");
	    int num = input.nextInt();
	    Integer row = 0;   
	    Integer column = 0;
	    Integer row_Max = 0;  //����������м���1
	    Integer column_Max = 0; //����������м���1
	    int[][] array = new int[num][num];
	    Random rand = new Random();
	 
	    //��ɳ�ʼ��������Max��¼�С��������������м���1
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            int randInt = rand.nextInt(2); //0-1֮��������
	            array[i][j] = randInt;
	            System.out.print(array[i][j] + " ");
	            if(randInt == 1) row++; //��1�� �����ۼ���
	        }
	        if(row > row_Max) row_Max = row;  //�洢����������м���1
	        //����
	        row = 0;
	        System.out.println();
	    }
	 
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            if(array[j][i] == 1) column++; //��1�������ۼ���
	        }
	        if(column > column_Max) column_Max = column;  //�洢����������м���1
	        column = 0;
	    }
	 
	    //�������齫���1���С����±�浽list1��list2����
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            if(array[i][j] == 1) row++;
	            if(array[j][i] == 1) column++;
	        }
	        if(row == row_Max) list1.add(i);
	        if(column == column_Max) list2.add(i);
	        row = 0;
	        column = 0;
	    }
	 
	    //��ӡlist1��list2�Ľ��
	    System.out.println("The largest row index: ");
	    for(Integer a:list1)
	        System.out.print(a + " ");
	    System.out.println('\n'+"The largest column index: ");
	    for(Integer b:list2)
	        System.out.print(b + " ");
	}

}
