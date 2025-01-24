public class FindThatSingleNumber{

public int getThatSingleNum(int[] arrays){

int result = 0;

for(int num : arrays){

result ^= num;

}

return result;

}

public static void main(String[] args){

FindThatSingleNumber FindThatSingleNumber = new FindThatSingleNumber();

int[] num = {2, 2, 5, 8, 8};

System.out.print(FindThatSingleNumber.getThatSingleNum(num));


  }


}