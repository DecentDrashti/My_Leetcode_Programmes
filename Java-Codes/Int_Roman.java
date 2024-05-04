class Int_Roman{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
    String ths[] = {"", "M", "MM", "MMM"};
    String hrns[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    System.out.println(ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10]);
  }   
}
