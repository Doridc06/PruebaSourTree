package ejer10;

import ejer2.PropiaException;

public class Jerarquia {

            public static void main(String[] args) {
                C c = new C();
                try {
                    c.nivelUno();
                } catch (PropiaException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
