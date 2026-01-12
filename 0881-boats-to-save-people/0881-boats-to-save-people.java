class Solution {
    public int numRescueBoats(int[] people, int limit) {

        if (people.length == 0)return 0;
        Arrays.sort(people);
        int i = 0,j =people.length-1;
        int count =0;
        while(i<=j){
            if(i == j){
                i++;j--;
                count++;
            }
            else if(people[i] + people[j] <= limit){
                i++; j--;
                count++;

            }
            else {
                j--;
                count++;
            }
        }
        return count;
    }
}