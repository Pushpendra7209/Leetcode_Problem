package d;

import java.util.Arrays;

public class ArrowShot {
	public static  int findMinArrowShots(int[][] points){
		if(points.length==0) {
			return 0;
			
		}
		Arrays.sort(points,(a,b) -> Integer.compare(a[1], b[1]));
		int arrow=1;
		int end=points[0][1];
		for(int i=0; i<points.length; i++) {
			if(points[i][0]>end) {
				arrow++;
				end=points[i][1];
			}
		}
	
		return arrow;
	}
	
	public static void main(String[] args) {
		int arr[][] = {{10,16},{1,6},{2,6},{7,12}};
		System.out.println(findMinArrowShots(arr));
	}
}
