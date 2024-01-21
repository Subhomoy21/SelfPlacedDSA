package BitsMagic;

public class lookUpTable {
    static int[] table = new int[256];

    // Function to initialise the lookup table
    public static void initialize()
    {

        // To initially generate the
        // table algorithmically
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    // Function to return the count
    // of set bits in n
    public static int countSetBits(int n)
    {
        return (table[n & 0xff]
                + table[(n >> 8) & 0xff]
                + table[(n >> 16) & 0xff]
                + table[n >> 24]);
    }
    public static void main(String[] args) {
            // Initialise the lookup table
        initialize();
        int n = 9;
        System.out.print(countSetBits(n));
    }
}
