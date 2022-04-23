class negetiveIntegerArray {
  public static void main(String[] args) {
    int[]data=new int [51];
    int count=0;
    for(int i=-1;i>=-100;i=i-2){
        data[count]=i;
          count=count+1;
    }
    for(int i=0;i<50;i++){
      System.out.println(data[i]);
    }
  }
}