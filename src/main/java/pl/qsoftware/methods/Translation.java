package pl.qsoftware.methods;

import org.jetbrains.annotations.NotNull;

public class Translation {
  static String[] units = {"", "jeden ", "dwa ", "trzy ", "cztery ",
      "pięć ", "sześć ", "siedem ", "osiem ", "dziewięć ",};

  static String[] teens = {"", "jedenaście ", "dwanaście ", "trzynaście ",
      "czternaście ", "piętnaście ", "szesnaście ", "siedemnaście ",
      "osiemnaście ", "dziewiętnaście ",};

  static String[] decimals = {"", "dziesięć ", "dwadzieścia ",
      "trzydzieści ", "czterdzieści ", "pięćdziesiąt ",
      "sześćdziesiąt ", "siedemdziesiąt ", "osiemdziesiąt ",
      "dziewięćdziesiąt ",};

  static String[] hundreds = {"", "sto ", "dwieście ", "trzysta ", "czterysta ",
      "pięćset ", "sześćset ", "siedemset ", "osiemset ",
      "dziewięćset ",};

  static String[][] groups = {{"", "", ""},
      {"tysiąc ", "tysiące ", "tysięcy "},
      {"milion ", "miliony ", "milionów "},
      {"miliard ", "miliardy ", "miliardów "},
      {"bilion ", "biliony ", "bilionów "},
      {"biliard ", "biliardy ", "biliardów "},
      {"trylion ", "tryliony ", "trylionów "},};

  static long u;
  static long t;
  static long d;
  static long h;
  static long g = 0;
  static long k;
  static StringBuilder inWords = new StringBuilder();
  static String sign = "";

  public static @NotNull String translationToWords(long num) {
    if (num < 0) {
      sign = "minus ";
      num = -num;
    }
    if (num == 0) {
      sign = "zero";
    }

    while (num != 0) {
      h = num % 1000 / 100;
      d = num % 100 / 10;
      u = num % 10;

      if (d == 1 & u > 0) {
        t = u;
        d = 0;
        u = 0;
      } else {
        t = 0;
      }

      if (u == 1 & h + d + t == 0) {
        k = 0;

        if (h + d == 0 && g > 0) {
          u = 0;
          inWords.insert(0, groups[(int) g][(int) k]);
        }
      } else if (u == 2) {
        k = 1;
      } else if (u == 3) {
        k = 1;
      } else if (u == 4) {
        k = 1;
      } else {
        k = 2;
      }

      if (h + d + t + u > 0) {
        inWords.insert(0, hundreds[(int) h] + decimals[(int) d] + teens[(int) t]
            + units[(int) u] + groups[(int) g][(int) k]);
      }
      num = num / 1000;
      g = g + 1;
    }
    inWords.insert(0, sign);
    return inWords.toString();
  }
}