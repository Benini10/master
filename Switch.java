public class Switch{
  public static void main(String[] args) {
    int x = 8;
    switch (x) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 9:
        System.out.println("Ce chiffre est impair");
        break;
      case 0:
      case 2:
      case 4:
      case 6:
      case 8:
        System.out.println("Ce chiffre est pair");
        break;
      default:
        System.out.println("Mois inconnu");
        break;
    }
  }
}