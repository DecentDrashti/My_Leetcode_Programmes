class First_Index_Occurence{
    public int strStr(String haystack, String needle) {
        if(needle.length()<=haystack.length()){
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                System.out.println(i);
            }
        }
    }
        System.out.println(-1);
    }
}