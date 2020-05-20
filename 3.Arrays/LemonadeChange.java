class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0){
                    return false;
                }else{
                    five--;
                    ten++;
                }
            }else{
                if(ten != 0 && five != 0){
                    ten--;
                    five--;
                    twenty++;
                }else if(ten == 0 && five >= 3){
                    five -=3;
                }else{
                    return false;
                }
            }
        }
        return true;   
    }
}