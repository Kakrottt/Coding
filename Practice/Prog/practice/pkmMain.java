package Prog.practice;

import java.util.Scanner;

public class pkmMain {
    public static void main(String[] args) {
        System.out.print("\n1. Ash \n2. Misty \nPlease Enter your choice >> ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        pkmAl pokemonAl;

        if(choice == 1){
            pokemonAl = new pkmAshpokemon();
            pokemonAl.pmk();
        }
        
        else if(choice == 2){
            pokemonAl = new pkmMisty();
            pokemonAl.pmk();
        }

        else {
            pokemonAl = new pkmAl();
            pokemonAl.pmk();
        }

    }
}
