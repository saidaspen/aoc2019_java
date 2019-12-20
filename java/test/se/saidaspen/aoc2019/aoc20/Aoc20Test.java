package se.saidaspen.aoc2019.aoc20;

import org.junit.Test;

import static org.junit.Assert.*;

public class Aoc20Test {

    @Test
    public void part2Example1() {
        String input =
                "         A           \n" +
                        "         A           \n" +
                        "  #######.#########  \n" +
                        "  #######.........#  \n" +
                        "  #######.#######.#  \n" +
                        "  #######.#######.#  \n" +
                        "  #######.#######.#  \n" +
                        "  #####  B    ###.#  \n" +
                        "BC...##  C    ###.#  \n" +
                        "  ##.##       ###.#  \n" +
                        "  ##...DE  F  ###.#  \n" +
                        "  #####    G  ###.#  \n" +
                        "  #########.#####.#  \n" +
                        "DE..#######...###.#  \n" +
                        "  #.#########.###.#  \n" +
                        "FG..#########.....#  \n" +
                        "  ###########.#####  \n" +
                        "             Z       \n" +
                        "             Z       ";
        Aoc20 app = new Aoc20(input);
        assertEquals(26, app.run());
    }

    @Test
    public void part2Example2() {
        String input =
                "             Z L X W       C                 \n" +
                "             Z P Q B       K                 \n" +
                "  ###########.#.#.#.#######.###############  \n" +
                "  #...#.......#.#.......#.#.......#.#.#...#  \n" +
                "  ###.#.#.#.#.#.#.#.###.#.#.#######.#.#.###  \n" +
                "  #.#...#.#.#...#.#.#...#...#...#.#.......#  \n" +
                "  #.###.#######.###.###.#.###.###.#.#######  \n" +
                "  #...#.......#.#...#...#.............#...#  \n" +
                "  #.#########.#######.#.#######.#######.###  \n" +
                "  #...#.#    F       R I       Z    #.#.#.#  \n" +
                "  #.###.#    D       E C       H    #.#.#.#  \n" +
                "  #.#...#                           #...#.#  \n" +
                "  #.###.#                           #.###.#  \n" +
                "  #.#....OA                       WB..#.#..ZH\n" +
                "  #.###.#                           #.#.#.#  \n" +
                "CJ......#                           #.....#  \n" +
                "  #######                           #######  \n" +
                "  #.#....CK                         #......IC\n" +
                "  #.###.#                           #.###.#  \n" +
                "  #.....#                           #...#.#  \n" +
                "  ###.###                           #.#.#.#  \n" +
                "XF....#.#                         RF..#.#.#  \n" +
                "  #####.#                           #######  \n" +
                "  #......CJ                       NM..#...#  \n" +
                "  ###.#.#                           #.###.#  \n" +
                "RE....#.#                           #......RF\n" +
                "  ###.###        X   X       L      #.#.#.#  \n" +
                "  #.....#        F   Q       P      #.#.#.#  \n" +
                "  ###.###########.###.#######.#########.###  \n" +
                "  #.....#...#.....#.......#...#.....#.#...#  \n" +
                "  #####.#.###.#######.#######.###.###.#.#.#  \n" +
                "  #.......#.......#.#.#.#.#...#...#...#.#.#  \n" +
                "  #####.###.#####.#.#.#.#.###.###.#.###.###  \n" +
                "  #.......#.....#.#...#...............#...#  \n" +
                "  #############.#.#.###.###################  \n" +
                "               A O F   N                     \n" +
                "               A A D   M                     \n";
        Aoc20 app = new Aoc20(input);
        assertEquals(396, app.run());
    }
}
