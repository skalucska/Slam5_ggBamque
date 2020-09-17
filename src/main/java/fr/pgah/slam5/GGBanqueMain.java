package fr.pgah.slam5;

import java.util.Scanner;

public class GGBanqueMain {
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    BanqueClient client = new BanqueClient(scanner);
    client.run();
  }
}