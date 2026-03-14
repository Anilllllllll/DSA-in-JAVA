class Solution {
    public String getHappyString(int n, int k) {
        
        List<String> ans = new ArrayList<>();
        String a = "abc";
        backtrack(ans,n,"",a);

        int size = ans.size();
        return (k>size)? "":ans.get(k-1);

    }
    void backtrack(List<String> ans,int n,String s,String a){
        
        if(n==s.length()){
            ans.add(s);
            return;
        }

        for(int i=0; i<3; i++){
            char ch = a.charAt(i);
            int len = s.length();
            if(s.isEmpty()){
                 backtrack(ans,n,s+ch,a);
            }
            else if( s.charAt(len-1)!=ch){
            backtrack(ans,n,s+ch,a);
            }
            
        }

        
    }
}