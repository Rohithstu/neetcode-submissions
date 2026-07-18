class Solution {
    public int characterReplacement(String s, int k) {
        //int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0,l=0,res=0;
        for(int n=0;n<=s.length()-1;n++)
        {
            map.put(s.charAt(n),map.getOrDefault(s.charAt(n),0)+1);
                max=Math.max(max,map.get(s.charAt(n)));
                while((n-l+1)-max>k)
                {
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    l++;
                }
                res=Math.max(res,n-l+1);
        }
        return res;
        

    }
}
