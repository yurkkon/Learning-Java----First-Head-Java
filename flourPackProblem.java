public class flourPackProblem {
    public static void main(String[] args) {

        System.out.println(canPack(3, 0, 15));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0){
            if (bigCount * 5 + smallCount >= goal){
                    while (bigCount != 0 || goal != 0){
                        if (bigCount - 1 >= 0 && goal - 5 >= 0){
                            bigCount--;
                            goal -= 5;
                        } else{
                            break;
                        }
            }  while (smallCount >= 1 && goal != 0){
                       smallCount--;
                       goal--;
                }
                return goal == 0;

        } return false;
    } return false;
    }
}
