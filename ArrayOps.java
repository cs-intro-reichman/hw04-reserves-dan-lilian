
public class ArrayOps {
    public static void main(String[] args) {
    
    
    }
    
    public static int findMissingInt (int [] array) {
        int sum = 0;
        int arraySum=0;
		for (int i = 1; i <= array.length; i++) {
			sum = sum +i;
		}
		for (int n = 0; n <=(array.length-1); n++) {
			arraySum = arraySum + array[n];
		}
        int missingInt= (sum-arraySum);
        return (missingInt);
    }

    public static int secondMaxValue(int [] array) {
        int max=array[0];
        int secondMax=array[0];
        for (int i = 0; i<array.length;i++)
        {
            if (array[i]>=max)
            {
                secondMax=max;
                max=array[i];
            } else {
                if (array[i]>=secondMax)
                {
                    secondMax=array[i];
                }
            }

        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int sumidentical=0;
        for (int i= 0; i<array1.length;i++){
            for (int n=0; n<array2.length; n++)
            {
                if (array1[i]==array2[n])
                {
                    sumidentical++;
                    break;
                }

            }
        }
        for (int i= 0; i<array2.length;i++){
            for (int n=0; n<array1.length; n++)
            {
                if (array2[i]==array1[n])
                {
                    sumidentical++;
                    break;
                }

            }
        }
        if (sumidentical==(array1.length+array2.length)){
        return true;
        }else 
             return false;
    }

    public static boolean isSorted(int [] array) {
        int first=array[0];
        int temp= array[1];
        if(first>=temp)
        {
            for (int i=2;i<array.length;i++)
            {
                if (temp<array[i])
                {
                    return false;
                }
                temp=array[i];
            }
        }
        if(first<=temp)
        {
            for (int i=2;i<array.length;i++)
            {
                if (temp>array[i])
                {
                    return false;
                }
                temp=array[i];
            }
        }
        return true;
    }

}
