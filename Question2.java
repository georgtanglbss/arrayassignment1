import java.util.ArrayList;

class Question2 {

    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int temp=0;
        for(int i = 0; i<nums.size(); i++ ){
            int a = nums.get(i);
            for(int j = i+1; j<nums.size(); j++){
                int b = nums.get(j);
                if(a < b){
                    b = a;
                    temp = i;
                }
            }
        }
        nums.remove(temp);
    }

    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }

}
