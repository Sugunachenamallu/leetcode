class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int gift:gifts){
            pq.offer(gift);
        }
        for(int i=0;i<k;i++){
            int first=pq.poll();
            int new_first=(int)Math.sqrt(first);
            pq.offer(new_first);
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum=sum+pq.poll();
        }
        return sum;
    }
}