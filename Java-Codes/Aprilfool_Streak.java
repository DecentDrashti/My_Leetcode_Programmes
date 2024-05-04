class Aprilfool_Streak{
    public int lengthOfLastWord(String s) {
         s = s.trim();
        
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            }
            else if (count > 0) {
                break;
            }
        }
        
        System.out.println(count);
    }
}