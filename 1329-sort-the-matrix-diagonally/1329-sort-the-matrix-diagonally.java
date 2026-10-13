class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>>map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int key=i-j;
                map.putIfAbsent(key,new PriorityQueue<>());
                map.get(key).offer(mat[i][j]);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int key=i-j;
                mat[i][j]=map.get(key).poll();
            }
        }
        return mat;
    }
}