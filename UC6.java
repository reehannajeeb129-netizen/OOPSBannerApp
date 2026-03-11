class UC6{

    static void printBanner(String[] banner) {
        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
    public static void main(String[] args) {
        String[] banner = {
            " ***    ***    ****    **** ",
            "*   *  *   *   *   *  *     ",
            "*   *  *   *   ****    ***  ",
            "*   *  *   *   *          * ",
            " ***    ***    *      ****  "
        };
        printBanner(banner); // function call
    }
}