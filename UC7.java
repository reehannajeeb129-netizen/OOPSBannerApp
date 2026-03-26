public class UC7{
    public class OOPSBannerApp {
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[] {
            "***** ",
            "**  **",
            "**  **",
            "***** ",
            "**    ",
            "**    ",
            "**    "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " *****",
            "    **",
            "    **",
            "***** "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[] {
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  ",
            "  "
        });

        return characterPatternMap;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int line = 0; line < 7; line++) {
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                output.append(pattern[line]).append(" ");
            }

            System.out.println(output.toString());
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
}