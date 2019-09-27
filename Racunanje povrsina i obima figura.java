package drugidomaci;

import java.util.Scanner;

public class TreciZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String figura;
		System.out.println("Figura");
		figura = sc.nextLine();

		switch (figura) {
		case "kvadrat":
			System.out.println("Unos stranice: ");
			double ok, pk, a;
			a = sc.nextDouble();
			pk = a * a;
			System.out.println("Povrsinva kvadrata " + pk);
			ok = 4 * a;
			System.out.println("Obim kvadrata" + ok);
			break;
		case "pravougaonik":
			System.out.println("Unos stranice: ");
			double pp, op, aa, b;
			aa = sc.nextDouble();
			System.out.println("Unos stranice: ");
			b = sc.nextDouble();
			pp = aa * b;
			System.out.println("Povrsinva pravougaonika " + pp);
			op = 2 * (aa + b);
			System.out.println("Obim pravougaonika" + op);
			break;
		case "krug":
			System.out.println("Unos precnika: ");
			double r, okr, pkr;
			r = sc.nextDouble();
			pkr = r * r * Math.PI;
			System.out.println("Povrsina kruga" + pkr);
			okr = 2 * r * Math.PI;
			System.out.println("Obim kruga" + okr);
			break;
		default:
			System.out.println("los unos");

		}
	}

}
