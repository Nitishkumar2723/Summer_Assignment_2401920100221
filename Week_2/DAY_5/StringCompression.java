class Solution {
    public int compress(char[] chars) {
        int i=0,k=0;
        while(i<chars.length){
            int count=1;
            while(i + count<chars.length && chars[i] == chars[i + count]){
                count++;
            }
            chars[k++]=chars[i];
            if(count>1){
                for(char ch:Integer.toString(count).toCharArray()){
                chars[k++]=ch;
            }
        }
        i+=count;
    }
    return k;

        
    }
    }
