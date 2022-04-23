class Main {
  public static void main(String[] args) {
    int[]data=new int [101];
    int count=0;
    for(int i=0;i<=100;i++){
        data[count]=i;
          count=count+1;
    }
    for(int i=0;i<101;i++){
      //System.out.println(data[i]);

if (data[i] %5==0){
  System.out.println(data[i]);
}
    }
  }
}