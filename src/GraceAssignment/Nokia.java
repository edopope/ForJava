package GraceAssignment;
import java.util.Scanner;


public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int game = 1; game <= 3; game++) {
            while (true) {
                System.out.print("NOKIA 3310 \n");
                System.out.print("PRESS:1:: FOR PHONEBOOK \n");
                int phonebook = input.nextInt();
                System.out.print("PRESS:2::FOR MESSAGES \n");
                int messages = input.nextInt();
                System.out.print("PRESS:3::FOR CALL REGISTER \n");
                int register = input.nextInt();
                System.out.print("PRESS:4::FOR TONES \n");
                int tones = input.nextInt();
                System.out.print("PRESS:5:: FOR SETTINGS \n");
                int settings = input.nextInt();
                System.out.print("PRESS:6::FOR SIM SERVICES \n");
                int sim = input.nextInt();
                System.out.print("PRESS:0::TO QUIT MENU\n");
                int quit = input.nextInt();
                if (phonebook == 1) {
                    System.out.print("\n1: SEARCH \n 2:SERVICE NUMBERS \n 3:ADD NAME \n 4:ERASE\n 5:EDIT\n 6:ASSIGN TONE\n 7:SEND CARD\n 8:OPTIONS\n");
                    break;

                }
                if (messages == 2) {
                    System.out.print("\n1->WRITE MESSAGES\n 2-> INBOX \n 3-> OUTBOX \n 4-> PICTURES MESSAGES\n 5-> TEMPLATES\n 6->SMILEYS \n 7->MESSAGE SETTING\n");
                    break;
                }
                if (register == 3) {
                    System.out.print("\n1->MISSED CALLS\n 2->RECEIVED CALLS\n 3->DIALLED CALLS\n 4-> DELETE CALL LIST\n 5-> SHOW CALL DURATION\n");
                    continue;
                }
                if (tones == 4) {
                    System.out.print("\n1->RINGING TONE 2->RING VOLUME/n 3-> INCOMING CALLS ALERT\n 4->COMPOSER\n 5->MESSAGE ALERT TONE\n 6->KEYPAD TONE\n 7->VIBRATING ALERT\n");
                    break;
                }
                if (settings == 5) {
                    System.out.print("\n 1->CALL SETTINGS\n 2->PHONE SETTING\n 3->SECURITY SETTINGS\n 4->RESTORE FACTORY SETTING\n");
                    break;
                }
                if (sim == 6) {
                    System.out.print("\n SIM SERVICES");

                    if (quit == 0) {
                        break;
                    }

                }
            }
        }

    }


}