public class MinimumRungs {
    public int addRungs(int[] rungs, int dist) {
        int out = 0;
        int current = 0;

        for(int i=0; i<rungs.length; i++){
            if(current+dist >= rungs[i]){
                current = rungs[i];
            }else{

                while(current+dist < rungs[i]){
                    out++;
                    current = current+dist;
                }
                current = rungs[i];
            }
        }
        return out;
    }
}
