public class Main {

    public static void main(String[] args)
    {
        StarDestroyer();
        Moncalamari();
        CIS( 25 );

        int getalletje = 0;
        System.out.println("Little do you know " + GeefTerug(0));
    }

    public static void StarDestroyer()
    {
        System.out.println("The MKII star destroyer");
    }

    public  static void Moncalamari()
    {
        System.out.println("MC80 Star Cruiser");
    }

    public static void CIS( int getal )
    {
        System.out.println("The CIS used " + getal + " trade federation battlehsips over Naboo");
    }

    public static  void Republic( int venators, boolean acclamators)
    {
        if (venators >= 1000){
            System.out.println("The battle for Corusant has begun!");
        }
        else if(venators <=1000){
            System.out.println("The battle for Mandalore has begun!");
    }
    }
    public static String GeefTerug(int waarde)
    {
        if (waarde == 0)
        {
            return "Thrawn was an excellent admiral";
        }

        return "the Empire was beaten at Yavin 4";
    }
    public static int YuZhangVong(String[] lijst )
    {
        lijst [0] = "Battle for Corrusant";
        lijst [1] = "Battle for Naboo";
        lijst [2] = "Battle for Hoth";

        int length = lijst.length;
        return length;
    }

}
