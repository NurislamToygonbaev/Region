import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        System.out.println(STR."""
                1. \{Region.CHUY}
                   \{Region.CHUY.features()}

                2. \{Region.BATKEN}
                   \{Region.BATKEN.features()}

                3. \{Region.OSH}
                   \{Region.OSH.features()}

                4. \{Region.JDAJAJ_ABAD}
                   \{Region.JDAJAJ_ABAD.features()}

                5. \{Region.TALAS}
                   \{Region.TALAS.features()}

                6. \{Region.NARYN}
                   \{Region.NARYN.features()}

                7. \{Region.YSYK_KOL}
                   \{Region.YSYK_KOL.features()}
                """);
    }
}