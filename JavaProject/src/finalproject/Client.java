package finalproject;

import java.util.ArrayList;
import java.util.Random;

public class Client{
	//所有客人類別的父類別

	private String occupation;	//職業
	private static final int NUMBEROFPRODUCTS = 13;	//總商品數13
	private int[] preference = new int[NUMBEROFPRODUCTS];	//客人的商品偏好(購買機率)
	private ArrayList<Product> purchasingList = new ArrayList(5);	//購物清單(初始大小5)
	
	//constructor:設定職業名稱
	public Client(String occupation){
		this.occupation = occupation;
	}

	//取得職業
	public String getOccupation(){	
		return occupation;
	}

	//設定客人對各商品的偏好程度(%)
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

	//根據商品偏好購買商品
	public void buyThings(){
		//隨機購買n個商品(n=1~5)
		Random random = new Random();
		int numOfThings = random.nextInt(5) + 1;	

		int total = 100;   //各商品偏好度總和100%

		//產生n個隨機商品加入購物清單
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
	}//演算法參考:http://puremonkey2010.blogspot.com/2010/10/java.html

	//列印當次購物明細
	public void showDetails(){
		System.out.println("本次購買明細: (" + getOccupation() +")");
		for(int i=0; i<purchasingList.size(); i++){
			System.out.print( purchasingList.get(i).getClass().getName()
				+ String.format(" %d元 %n",purchasingList.get(i).getCost()) );
		}
		System.out.println("總計:" + totalCost() + "元\n");
	}

	//計算購物清單內的商品總金額
	public int totalCost(){		
		int sum = 0;
		for(int i=0; i<purchasingList.size(); i++){
			sum += (purchasingList.get(i)).getCost();
		}
		return sum;
	}

}