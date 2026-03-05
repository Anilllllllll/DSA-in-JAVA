class Solution {
    public String mergeCharacters(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        while(true){
            boolean merged = false;

            for(int i=0;i<sb.length()-1;i++){

                for(int j=i+1;j<sb.length() && j-i<=k;j++){

                    if(sb.charAt(i)==sb.charAt(j)){
                        sb.deleteCharAt(j);
                        merged = true;
                        break;
                    }
                }

                if(merged) break;
            }

            if(!merged) break;
        }

        return sb.toString();
    }
}