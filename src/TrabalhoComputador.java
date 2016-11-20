import java.util.Scanner;

public class TrabalhoComputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] memoria = new String[256];
		for (int i = 0; i < 256; i++)
			memoria[i] = "_";
		int i = 0;
		while (true) {
			System.out.printf("Digite %dª instrução ou 9999 para parar: ", i + 1);
			String v = teclado.nextLine();
			if (v.equals("9999"))
				break;
			else
				memoria[i] = v;
			i++;
		}
		fill(memoria, '_');
		System.out.printf(
				" _______________                                 ____MEMÓRIA____\n"
						+ "| _____________ |                             10|______%s_____|\n"
						+ "||      UC     ||                             0F|______%s_____|\n"
						+ "||_____________||                             0E|______%s_____|\n"
						+ "| _|___     |   |                             0D|______%s_____|\n"
						+ "||_ULA_|    |   |                             0C|______%s_____|\n"
						+ "| _|________|__ |                             0B|______%s_____|\n"
						+ "||      A      ||                             0A|______%s_____|\n"
						+ "||_____________||                             09|______%s_____|\n"
						+ "||      B      ||                             08|______%s_____|\n"
						+ "||_____________||                             07|______%s_____|       ______VIDEO______\n"
						+ "||      PC     ||                             06|______%s_____|      | _______________ |\n"
						+ "||_____________||                             05|______%s_____|      ||               ||\n"
						+ "||      IR     ||                             04|______%s_____|      ||               ||\n"
						+ "||_____________||                             03|______%s_____|      ||               ||\n"
						+ "||    FLAGS    ||                             02|______%s_____|      ||               ||\n"
						+ "||_____________||                             01|______%s_____|      ||_______________||\n"
						+ "|_______________|                             00|_______________|      |_________________|\n"
						+ "|   |   |   |                                     |   |   |               |   |   |\n"
						+ "|   |   |   |                                     |   |   |               |   |   |\n"
						+ "|   |   |   |_____________________________________|___|___|_______________|___|___|______Dados:\n"
						+ "|   |   |_____________________________________________|___|___________________|___|______Endereço:\n"
						+ "|   |_____________________________________________________|_______________________|______Read=0\n"
						+ "|________________________________________________________________________________________Memória=0\n",
				memoria[15], memoria[14], memoria[13], memoria[12], memoria[11], memoria[10], memoria[9], memoria[8],
				memoria[7], memoria[6], memoria[5], memoria[4], memoria[3], memoria[2], memoria[1], memoria[0]);
		teclado.close();
	}

	public static String[] fill(String[] s, char fill) {
		for (int i = 0; i < s.length; i++) {
			while (s[i].length() < 4) {
				s[i] += fill;
			}
		}
		return s;
	}
}
