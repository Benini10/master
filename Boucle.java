class Boucle{
  public static void main(String[] args) {
    int x = 0;
    for(int i = 0; i < 10 ; i++){
      System.out.println("Say ok <="+i);
    }

    while(x < 10){
      System.out.println("Say again <="+x);
      x++;
    }
  }
}