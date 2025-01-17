public class OperatorContoh {

    public static void main(String[] args) {
        // Contoh penggunaan operator bit
        int a = 5, b = 3; // a = 5 (0101), b = 3 (0011)
        int hasilBitwiseAND = a & b; // Operator Bitwise AND
        int hasilBitwiseOR = a | b;  // Operator Bitwise OR
        
        System.out.println("Contoh Operator Bitwise:");
        System.out.println("a & b = " + hasilBitwiseAND); // 0101 & 0011 = 0001 (1)
        System.out.println("a | b = " + hasilBitwiseOR);  // 0101 | 0011 = 0111 (7)
        
        // Contoh penggunaan operator logika
        boolean x = true, y = false;
        boolean hasilLogikaAND = x && y; // Operator Logika AND
        boolean hasilLogikaOR = x || y;  // Operator Logika OR
        
        System.out.println("\nContoh Operator Logika:");
        System.out.println("x && y = " + hasilLogikaAND); // true && false = false
        System.out.println("x || y = " + hasilLogikaOR);  // true || false = true
        
        // Contoh penggunaan operator penugasan
        int z = 10; // Penugasan awal
        z += 5; // Operator Penugasan Penambahan (z = z + 5)
        z -= 3; // Operator Penugasan Pengurangan (z = z - 3)
        
        System.out.println("\nContoh Operator Penugasan:");
        System.out.println("z setelah z += 5 dan z -= 3 = " + z); // 10 + 5 - 3 = 12
    }
}
