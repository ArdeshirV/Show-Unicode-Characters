// ShowUnicodeCharacters.java - Show Unicode Characters
// Copyright (c) 2015 ardeshirv@protonmail.com, Licensed under GPLv3+
//------------------------------------------------------------------------------
import java.util.Scanner;
//------------------------------------------------------------------------------
public class ShowUnicode {
  private static Scanner input;
  public static final int intAvestanEnd = 68415;
  public static final int intAvestanBegin = 68352;
  //----------------------------------------------------------------------------
  public static void main(String[] args) {
    String strDinDabire = "𐬵𐬭𐬫𐬌𐬠𐬀𐬛 𐬥𐬍𐬛";
    //String strAvestan = "𐬀𐬁𐬂𐬃𐬄𐬅𐬆𐬇𐬈𐬉𐬊𐬋𐬌𐬍𐬎𐬏𐬐𐬑𐬒𐬓𐬔𐬕𐬖𐬗𐬘𐬙𐬚𐬛𐬜𐬝𐬞𐬟𐬠𐬡𐬢𐬣𐬤𐬥𐬦𐬧𐬨𐬩𐬪𐬫𐬬𐬭𐬮𐬯𐬰𐬱𐬲𐬳𐬴𐬵𐬶𐬷𐬸𐬹𐬺𐬻𐬼𐬽𐬾";
    //TestAvestanCharacters(strAvestan);
    input = new Scanner(System.in);
    ShowUnicodeCharacters(strDinDabire);
    ConvertCodeToUnicode();
    input.close();
  }
  //----------------------------------------------------------------------------
  public static void ConvertCodeToUnicode() {
    System.out.println("This Application Shows Unicode Number of a Character.");

    for(;;) {
      System.out.print("Please enter unicode number(0 to exit): \033[0;32m");
      int intUnicodeNumber = input.nextInt();

      if(intUnicodeNumber == 0) {
        System.out.print("\033[0m");
        break;
      }
      System.out.printf("\033[0mchar(\033[0;32m%d\033[0m) = " +
      "\033[0;35m\'%c\'\033[0m\n",
        intUnicodeNumber, intUnicodeNumber);
    }
  }
  //----------------------------------------------------------------------------
  public static void ShowUnicodeCharacters(String strStrang) {
    System.out.printf("Processing: %s\n", strStrang);

    for(int intIndex = 0; intIndex < strStrang.length(); intIndex++) {
      int intUnicode = strStrang.codePointAt(intIndex);
      System.out.printf("Character(%c) = Unicode(%d)\n",
                        intUnicode, (int)intUnicode);
    }
  }
}
//------------------------------------------------------------------------------
