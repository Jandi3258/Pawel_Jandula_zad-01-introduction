package uj.wmii.pwj.introduction;
import java.util.HashMap;
import java.util.Map;


public class Banner {
    private final Map<Character, String[]> MapaLiter = new HashMap<>();
    public Banner() {
        zamiana(); 
    }
    private void zamiana(){
        MapaLiter.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######" ,
                "#     #",
                "#     #"
        });
        MapaLiter.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        MapaLiter.put('C', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        MapaLiter.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        MapaLiter.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        MapaLiter.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        MapaLiter.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        MapaLiter.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        MapaLiter.put('I', new String[]{
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        MapaLiter.put('J', new String[]{
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        MapaLiter.put('K', new String[]{
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        MapaLiter.put('L', new String[]{
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        MapaLiter.put('M', new String[]{
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #" 
        });
        MapaLiter.put('N', new String[]{
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        MapaLiter.put('O', new String[]{
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        MapaLiter.put('P', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        MapaLiter.put('Q', new String[]{
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        MapaLiter.put('R', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #" 
        });
        MapaLiter.put('S', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        MapaLiter.put('T', new String[]{
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        MapaLiter.put('U', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        MapaLiter.put('V', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "

        });
        MapaLiter.put('W', new String[]{
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        MapaLiter.put('X', new String[]{  
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        MapaLiter.put('Y', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        MapaLiter.put('Z', new String[]{
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        MapaLiter.put(' ', new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
    }
    public String[] toBanner(String wejscie){
        if(wejscie == null || wejscie.isEmpty()){
            return new String[0];
        }
        wejscie = wejscie.toUpperCase();
        int rozmiarBannera = 7;
        String[] banner = new String[rozmiarBannera];
        for(int i = 0; i < rozmiarBannera; i++){
            banner[i] = "";
        }
        for(int i = 0; i < rozmiarBannera; i++){
            for(int j = 0; j < wejscie.length(); j++){
                char litera = wejscie.charAt(j);
                if(MapaLiter.containsKey(litera)){
                    banner[i] += MapaLiter.get(litera)[i];
                }
                if (j < wejscie.length() - 1) {
                    banner[i] += " ";
                }
            }
            
        }
        return banner;
    }
    
}
