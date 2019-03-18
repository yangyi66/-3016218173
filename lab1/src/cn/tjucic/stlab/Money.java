package cn.tjucic.stlab;

public class Money {
	// 
	int[] m= {50,20,5,1};
	int[] c= {1,1,2,3};
	int[] result= {0,0,0,0};
	public int[] takeout(int n) {
		for(int i=0;i<4;i++) {
			if (n>=m[i]) {
				int shang=n/m[i];
				if(shang<=c[i]) {n=n-shang*m[i];result[i]=shang;if(n==0)return result;}
				else {n=n-c[i]*m[i];result[i]=c[i];}
			}
		}
		return null;
	}
/*穷举法
	String s; //个数
	// {50,20,5,5,1,1,1};
	public String takeout(int y) {
		//1
		if (y==50){s="1 0 0 0";return s;}
		else if(y==20) {s="0 1 0 0";return s;}
		else if(y==5){s="0 0 1 0";return s;}
		else if(y==1){s="0 0 0 1";return s;}
		//2
		else if(y==70){s="1 1 0 0";return s;}
		else if(y==55){s="0 0 1 0";return s;}
		else if(y==51){s="0 0 1 0";return s;}
		
		else if(y==25){s="0 0 1 0";return s;}
		else if(y==21){s="0 0 1 0";return s;}
		
		else if(y==10){s="0 0 1 0";return s;}
		else if(y==6){s="0 0 1 0";return s;}
		//3
		else if(y==75){s="0 0 1 0";return s;}
		else if(y==71){s="0 0 1 0";return s;}
		else if(y==60){s="0 0 1 0";return s;}
		else if(y==56){s="0 0 1 0";return s;}
		else if(y==52){s="0 0 1 0";return s;}
		
		else if(y==30){s="0 0 1 0";return s;}
		else if(y==26){s="0 0 1 0";return s;}
		else if(y==22){s="0 0 1 0";return s;}
		
		else if(y==11){s="0 0 1 0";return s;}
		else if(y==7){s="0 0 1 0";return s;}
		else if(y==3){s="0 0 1 0";return s;}
		//4
		else if(y==80){s="0 0 1 0";return s;}
		else if(y==76){s="0 0 1 0";return s;}
		else if(y==72){s="0 0 1 0";return s;}
		else if(y==61){s="0 0 1 0";return s;}
		else if(y==57){s="0 0 1 0";return s;}
		else if(y==53){s="0 0 1 0";return s;}
		else if(y==31){s="0 0 1 0";return s;}
		else if(y==27){s="0 0 1 0";return s;}
		else if(y==23){s="0 0 1 0";return s;}
		else if(y==12){s="0 0 1 0";return s;}
		else if(y==8){s="0 0 1 0";return s;}
		//5
		else if(y==81){s="0 0 1 0";return s;}
		else if(y==77){s="0 0 1 0";return s;}
		else if(y==73){s="0 0 1 0";return s;}
		else if(y==62){s="0 0 1 0";return s;}
		else if(y==58){s="0 0 1 0";return s;}
		else if(y==32){s="0 0 1 0";return s;}
		else if(y==28){s="0 0 1 0";return s;}
		else if(y==13){s="0 0 1 0";return s;}
		//6
		else if(y==82){s="0 0 1 0";return s;}
		else if(y==78){s="0 0 1 0";return s;}
		else if(y==63){s="0 0 1 0";return s;}
		else if(y==33){s="0 0 1 0";return s;}
		//7
		else if(y==83){s="0 0 1 0";return s;}
		else {s="failed!";return s;}
		
	}
*/
//取余法
	
	
	
	

	
	
	//int[] m= {50,20,5,5,1,1,1}
	//public int[] takeout
}
