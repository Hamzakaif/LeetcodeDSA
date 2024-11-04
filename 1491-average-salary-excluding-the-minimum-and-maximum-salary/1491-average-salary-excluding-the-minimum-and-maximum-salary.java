class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        double sum = 0;
        Arrays.sort(salary);

        for(int i=1; i<n-1; i++){
            sum += salary[i];
        }
        //finding Average after excluding mini and max
        return sum/(n-2);
    }
}