package finalproject;

import java.util.ArrayList;
import java.util.Random;

public class Client{
	//�Ҧ��ȤH���O�������O

	private String occupation;	//¾�~
	private static final int NUMBEROFPRODUCTS = 13;	//�`�ӫ~��13
	private int[] preference = new int[NUMBEROFPRODUCTS];	//�ȤH���ӫ~���n(�ʶR���v)
	private ArrayList<Product> purchasingList = new ArrayList(5);	//�ʪ��M��(��l�j�p5)
	
	//constructor:�]�w¾�~�W��
	public Client(String occupation){
		this.occupation = occupation;
	}

	//���o¾�~
	public String getOccupation(){	
		return occupation;
	}

	//�]�w�ȤH��U�ӫ~�����n�{��(%)
	public void setPreference(	
		int a,int b,int c,
		int d,int e,
		int f,int g, int h,
		int i,int j, int k,
		int l,int m)
	{
		preference[0] = a;	//MILKTEA
		preference[1] = b;	//BEER
		preference[2] = c;	//SODA
		preference[3] = d;	//TEAEGG
		preference[4] = e;	//HOTDOG
		preference[5] = f;	//ICESTICK
		preference[6] = g;	//ICECREAM
		preference[7] = h;	//ICECUBE
		preference[8] = i;	//POTATOCHIPS
		preference[9] = j;	//CRACKER
		preference[10] = k;	//CHOCOLATE
		preference[11] = l;	//MAGAZINE
		preference[12] = m;	//NEWSPAPER
	}

	//�ھڰӫ~���n�ʶR�ӫ~
	public void buyThings(){
		//�H���ʶRn�Ӱӫ~(n=1~5)
		Random random = new Random();
		int numOfThings = random.nextInt(5) + 1;	

		int total = 100;   //�U�ӫ~���n���`�M100%

		//����n���H���ӫ~�[�J�ʪ��M��
		for(int i = 0; i < numOfThings; i++ ){
			int t = random.nextInt(total);
			for(int j = 0; j < NUMBEROFPRODUCTS; j++ ){
				t -= preference[j];
				if (t < 0){
					purchasingList.add(ProductList.productList[j]);
					break;
				}
			}
		}
	}//�t��k�Ѧ�:http://puremonkey2010.blogspot.com/2010/10/java.html

	//�C�L���ʪ�����
	public void showDetails(){
		System.out.println("�����ʶR����: (" + getOccupation() +")");
		for(int i=0; i<purchasingList.size(); i++){
			System.out.print( purchasingList.get(i).getClass().getName()
				+ String.format(" %d�� %n",purchasingList.get(i).getCost()) );
		}
		System.out.println("�`�p:" + totalCost() + "��\n");
	}

	//�p���ʪ��M�椺���ӫ~�`���B
	public int totalCost(){		
		int sum = 0;
		for(int i=0; i<purchasingList.size(); i++){
			sum += (purchasingList.get(i)).getCost();
		}
		return sum;
	}

}