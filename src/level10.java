public class level10 {
    public static void main(String[] args) {

//either while, do while, for or nested structures

        //Display all possible unit numbers (level from 1 to 8 each level with 10 units)

        //    level-unit (1-10)   (A-Z)

        int level, unit;

        for (level = 1; level <= 8; level++)
        {
            System.out.println("Level " + level );

            for(unit = 1; unit <= 10; unit++)
            {
                System.out.println( level + " - " + unit );
            }
        }







    }
}
