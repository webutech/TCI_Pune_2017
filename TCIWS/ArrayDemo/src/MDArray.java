
public class MDArray {

	public static void main(String[] args) {
		int [][] arr=new int[2][];
		
		arr[0]=new int[3];
		arr[1]=new int[4];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		arr[1][3]=70;
		
		
		System.out.println("arr Array length : "+arr.length);
		System.out.println("arr[0] Array length : "+arr[0].length);
		System.out.println("arr[1] Array length : "+arr[1].length);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("Hash code of  arr[0] before changes :"+arr[0].hashCode());
		int [] temp=arr[0];
		System.out.println("Hash code of  temp  :"+temp.hashCode());
		
		int [] temp1={100,200,300,400};
		arr[0]=temp1;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Hash code of  temp1  :"+temp1.hashCode());
		System.out.println("Hash code of  arr[0] after changes :"+arr[0].hashCode());
		

	}

}
