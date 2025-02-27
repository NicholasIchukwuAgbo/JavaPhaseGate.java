import java.util.Arrays;

public class UniqueArray{
    public static int uniqueNumber(int[] arrays) {
        int sum = 0;
        for (int num : arrays) {
            sum ^= num;
        }
        return sum;
	}

public static void main(String[] args){
int[] nums = {2,3,4,4,3};
System.out.print(uniqueNumber(nums));

  }

}