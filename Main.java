public class Main {
    public static void main(String[] args) {
        int size = 5;  // Velikost čtverce (počet „buněk” na každé straně)

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Hrana čtverce: první nebo poslední řádek, nebo první či poslední sloupec
                // Pro plný čtverec stačí odstanit if podmínku a nechat pouze print "*"
                if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
