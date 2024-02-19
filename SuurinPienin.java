import java.util.Scanner;

public class SuurinPienin {
    public static void main(String[] args) {
        int luku1, luku2, luku3, suurin, pienin;
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä ensimmäinen kokonaisluku: ");
        luku1 = lukija.nextInt();

        System.out.print("Syötä toinen kokonaisluku: ");
        luku2 = lukija.nextInt();

        System.out.print("Syötä kolmas kokonaisluku: ");
        luku3 = lukija.nextInt();

        suurin = suurin(luku1, luku2, luku3);
        pienin = pienin(luku1, luku2, luku3);

        System.out.print("Syöttämistäsi luvuista suurin oli " + suurin);
        System.out.println(" ja pienin " + pienin);
    }

        public static int suurin(int luku1, int luku2, int luku3) {
			 if (luku1 > luku2 && luku1 > luku3) {
				return luku1;
			 } else if (luku2 > luku1 && luku2 > luku3) {
				return luku2;
			 } else {
				return luku3;
			 }
		 }
		public static int pienin(int luku1, int luku2, int luku3) {
			if (luku1 < luku2 && luku1 < luku3) {
				return luku1;
			} else if (luku2 < luku1 && luku2 < luku3) {
				return luku2;
			} else {
				return luku3;
		}
    }


}