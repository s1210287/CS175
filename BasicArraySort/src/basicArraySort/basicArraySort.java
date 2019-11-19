package basicArraySort;

public class basicArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] numb = {88,47,90,50,77,83,92,96,62,79};
		double [] numbsort = new double[10];
		double lowest = numb[0];
		int savei = 0;
		int j = 0;
		for(int i=1; i<=numb.length-1;i++)
		{
			System.out.println(i);
			if(numb[i] < lowest)
					{
				lowest = numb[i];
				savei = i;
					}
		}
		numb[savei]=-99;
		
		numbsort[j]=lowest;
		j=j+1;
		System.out.println(numbsort[0]);
	}

}
