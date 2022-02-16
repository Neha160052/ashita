
//Create a two dimensional array of integers and display:
//	sum of all elements of each column
//	sum of all elements of each row


public class Question4 {

	public static void main(String[] args) {
		int row,col,sumOfRow=0,sumOfCol=0;
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		row = arr.length;
		col = arr[0].length;
		for(int i=0;i<row;i++) {
		    sumOfRow=0;
			for(int j=0;j<col;j++) {
				sumOfRow = sumOfRow + arr[i][j];
			}
			System.out.println("sum of "+(i+1)+" row: "+sumOfRow);
		}
		for(int i=0;i<col;i++) {
		    sumOfCol=0;
			for(int j=0;j<row;j++) {
				sumOfCol = sumOfCol + arr[j][i];
			}
			System.out.println("sum of "+(i+1)+" column: "+sumOfCol);
		
		}
	}

}
