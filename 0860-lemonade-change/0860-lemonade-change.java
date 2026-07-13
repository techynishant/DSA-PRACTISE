class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0 ;
        int five = 0;
        int twenty = 0;
        for(int i = 0 ;i < bills.length;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five < 1){
                    return false;
                }else{
                    ten++;
                    five--;
                }
            }else{
                if(five > 0 && ten > 0){
                    ten--;
                    five--;
                    twenty++;
                }else if(five >= 3){
                    five-=3;
                }
                else{
                    return false;
                }
            }

        }
        return true;
    }
}