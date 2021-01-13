package labw;

import java.io.PrintWriter;
import java.util.*;

public class SipirtAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("DO YOU WNAT TO FIND OUT WHAT ARE YOUR SIPIRT ANIMALS ???");
		System.out.println("IF YESSS THEN ENETER YOUR NAME ");
		System.out.println("REMEMBE TO ONLY ENTER YOU FIRST NAME ");

		Scanner kb = new Scanner(System.in);
		String name = kb.next().toLowerCase();
		System.out.println("================================================");
		System.out.println("YOUR SPIRIT ANIMALS ACCORDING TO YOUR NAME ARE ");
		for (int i = 0; i < name.length(); i++) {
			String animal;
			switch (name.charAt(i)) {
			case 'a': {
				animal = Character.toString(128028);
				System.out.println(animal+" Ant ->> hardworker");
				break;
			}
			case 'b': {
				animal = Character.toString(128038);
				System.out.println(animal+" Bird ->> free-well");
				break;
			}
			case 'c': {
				animal = Character.toString(128049);
				System.out.println(animal+" Cat ->> cute");
				break;
			}
			case 'd': {
				animal = Character.toString(128054);
				System.out.println(animal+" Dog ->> loyal");
				break;
			}
			case 'e': {
				animal = Character.toString(128024);
				System.out.println(animal+" Elephant ->> strong, power");
				break;
			}
			case 'f': {
				animal = Character.toString(128031);
				System.out.println(animal+" Fish ->> Calm , love");
				break;
			}
			case 'g': {
				animal = Character.toString(128017);
				System.out.println(animal+" Goat ->> confident ");
				break;
			}
			case 'h': {
				animal = Character.toString(128014);
				System.out.println(animal+" Horse ->> freedom , love");
				break;
			}
			case 'i': {
				animal = Character.toString(128025);
				System.out.println(animal+" Immortal Jellyfish ->> Happy");
				break;
			}
			case 'j': {
				animal = Character.toString(128025);
				System.out.println(animal+" Jellyfish ->> happy");
				break;
			}
			case 'k': {
				animal = Character.toString(128040);
				System.out.println(animal+" Koala ->> kindness, motherhood");
				break;
			}
			case 'l': {
				animal = Character.toString(128047);
				System.out.println(animal+" Leopard. ->> sucessful");
				break;
			}
			case 'm': {
				animal = Character.toString(128053);
				System.out.println(animal+" Monkey ->> Freedom, Lovely");
				break;
			}
			case 'n': {
				animal = Character.toString(128054);
				System.out.println(animal+" Norfolk Terrier ->> higher knowledge");
				break;
			}
			case 'o': {
				animal = Character.toString(128025);
				System.out.println(animal+" Octopus ->> Dreams, Messages");
				break;
			}
			case 'p': {
				animal = Character.toString(128039);
				System.out.println(animal+" Penguin ->> creative ");	
				break;
			}
			case 'q': {
				animal = Character.toString(128013);
				System.out.println(animal+"+ Queen snake->>  fertility , healing");
				break;
			}
			case 'r': {
				animal = Character.toString(128048);
				System.out.println(animal+"+ Rabbit->> Cleverness and creativity");
				break;
			}
			case 's': {
				animal = Character.toString(128012);
				System.out.println(animal+" Snail ->> patient , Grateful");
				break;
			}
			case 't': {
				animal = Character.toString(128034);
				System.out.println(animal+"+ Turtle ->> Patient ,Grateful");
				break;
			}
			case 'u': {
				animal = Character.toString(128038);
				System.out.println(animal+"+ Umbrellabird ->> empowerment");
				break;
			}
			case 'v': {
				animal = Character.toString(128032);
				System.out.println(animal+"+ Viperfish ->> faith, and sensitivity");
				break;
			}
			case 'w': {
				animal = Character.toString(128058);
				System.out.println(animal+"+ Wolf ->> Strong , intelligence");
				break;
			}

			case 'x': {
				animal = Character.toString(128037);
				System.out.println(animal+"+ Xenops ->> Lovely , Strong ");
				break;
			}

			case 'y': {
				animal = Character.toString(128046);
				System.out.println(animal+"+ Yak ->> Patient, Productive");
				break;
			}

			case 'z': {
				animal = Character.toString(128050);
				System.out.println(animal+"+ Zibra ->> Productive");
				break;
			}

			}
		}
		
		System.out.println("THANK YOU FOR USING MY FIRST PROGRAM "+Character.toString(128525)+
				Character.toString(128525)+Character.toString(128525));
		System.out.println("IF YOU LIKE IT PLEASE "+ Character.toString(128077) +Character.toString(128077)
		+Character.toString(128077)+Character.toString(128077)+Character.toString(128077));
		
		

	}
}
