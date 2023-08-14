package patika;

import java.util.Arrays;

public class tekrarEdenCiftSayilar {
	public static void main(String[] args) {
		int[] list= {3,7,10,6,6,3,2,9,10,21,13,2,9};
		int[] duplicate=new int[list.length];
		int startindex=0;
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length;j++) {
				if(i!=j && list[i] ==list[j] && list[i]%2==0) {
					if(!isFind(duplicate, list[i])) {
						duplicate[startindex++]=list[i];
					break;
					}
	
				}
			}	
		}
		for(int value:duplicate) {
			if(value!=0) {
				System.out.println(value);
			}
		}
	}
	static boolean isFind(int[] arr,int value) {
		for(int i:arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}
}
