//Print multiplication table of any number n

  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input The Number!");
    int n = sc.nextInt();
    for(int i=1;i<=10;i++){
      System.out.print(n);
      System.out.print("x");
      System.out.print(i);
      System.out.println(":");
      System.out.println(i*n);
      
    }
  }
