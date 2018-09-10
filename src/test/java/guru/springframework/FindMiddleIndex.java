package guru.springframework;

/**
 * Created by Dégi János on 2018.09.05..
 */
public class FindMiddleIndex {

    int id = 324465464;

    public static int findMiddleIndex(int[] numbers) throws Exception {

        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }

    public static int findMiddleIndex2(int[] numbers) throws Exception {

        int checkNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            checkNum += numbers[i];
            System.out.println("i: "+i+" checkNum: " + checkNum);
            int sum = 0;
            for (int j = i+1; j < numbers.length; j++) {
                sum += numbers[j];
            }
            System.out.println("sum: " + sum);
            if (checkNum == sum)
                return i;
        }

        return 0;
    }

    public static void main(String a[]) {

        FindMiddleIndex findMiddleIndex = new FindMiddleIndex();
        System.out.println(findMiddleIndex.hashCode());

//        int[] num = { 2, 4, 4, 5, 4, 1 };
        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                    + findMiddleIndex2(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
	public int hashCode() {
		return this.id;
    }
}
