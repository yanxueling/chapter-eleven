import java.util.ArrayList;
public class polygon{
	//ArrayList���������
	private ArrayList<MyPoint> array= new ArrayList<>();
	polygon(){
	}
	 
	public void setPoint(MyPoint p){
	    this.array.add(p);
	}
	//����͹����ε�˼·����һ�����㿪ʼ���������ڵĶ������ߣ������Ϳ��԰�͹����λ��ֳɼ���������
	//�õ�ʮ�¿κ����еļ��������������ʽ����������
	//���������֮�͵���͹����ε����
	public double Area(int pointNum) {
	    int i=0;
	    double temp=0;
	    for(; i <pointNum - 1;i++) {
	        temp += (this.array.get(i).getX() - this.array.get(i+1).getX())*(this.array.get(i).getY() + this.array.get(i+1).getY());
	    }
	    //��ֹArrayList���
	    temp += (this.array.get(i).getX() - this.array.get(0).getX())*(this.array.get(i).getY() + this.array.get(0).getY());
	    if(temp < 0) temp = -temp;
	    return temp/2;
	}
	 
	public void shuchu() {
	    for(int i =0 ;i < array.size();i++) {
	        System.out.print("��" + array.get(i).getX() +"��" + array.get(i).getY() +")");
	 
	    }
	}
}