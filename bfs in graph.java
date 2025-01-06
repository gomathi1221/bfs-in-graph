class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] v=new boolean[V];
       q.add(0);
       v[0]=true;
       while(!q.isEmpty()){
           int c=q.poll();
           a.add(c);
           for(int n:adj.get(c)){
               if(!v[n]){
                   v[n]=true;
                   q.add(n);
               }
           }
       }
       return a;
    }
}