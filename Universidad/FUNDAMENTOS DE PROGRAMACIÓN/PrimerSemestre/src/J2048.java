import java.util.Random;
import java.util.Scanner;

public class J2048 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rng = new Random();

            String ocho = "8";
            System.out.println(ocho.equals("8m"));

            String[][] snumbers = new String[4][4];

            byte move = 1;

            boolean continueGame = true;

            boolean isEmpty;

            boolean updatedBoard = true;

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    //"initialize" cnumbers to ' ' (blank)
                    snumbers[i][j] = " ";
                }
            }

            //snumbers[rng.nextInt(3)][rng.nextInt(3)] = Integer.toString(generateNumber()); //generate 1st number

            while(continueGame){
                System.out.println("movimiento " + move);
            /*
            1. if the next positions box is empty -> shift number (repeat until no more possible shifts)
            2. if the number is equal to the number in the next positions box ->
                2.1. if the number in the next position box will merge with another number -> don't merge
                2.2. if it won't -> merge
            3. repeat only step 1
            4. generate new number
            */
                //boolean willMerge;
                int shifts;
                do{
                    shifts = 0;

                    switch(move){
                        case 1: //up
                            for(int i = 1; i < 4; i++){
                                for(int j = 0; j < 4; j++){
                                    if(snumbers[i-1][j].isBlank() && !(snumbers[i][j].isBlank())){ //shift
                                        snumbers[i-1][j] = snumbers[i][j];
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    } else if(snumbers[i-1][j].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank())){ //merge
                                        snumbers[i-1][j] = (Integer.toString(2*(Integer.parseInt(snumbers[i][j]))) + "m");
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    }
                                }
                            }
                            break;

                        case 2: //down
                            for(int i = 2; i >= 0; i--){
                                for(int j = 0; j < 4; j++){
                                    if(snumbers[i+1][j].isBlank() && !(snumbers[i][j].isBlank())){ //shift
                                        snumbers[i+1][j] = snumbers[i][j];
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    } else if(snumbers[i+1][j].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank())){ //merge
                                        snumbers[i+1][j] = (Integer.toString(2*(Integer.parseInt(snumbers[i][j]))) + "m");
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    }
                                }
                            }
                            break;

                        case 3: //right
                            for(int i = 0; i < 4; i++){
                                for(int j = 2; j >= 0; j--){
                                    if(snumbers[i][j+1].isBlank() && !(snumbers[i][j].isBlank())){ //shift
                                        snumbers[i][j+1] = snumbers[i][j];
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    } else if(snumbers[i][j+1].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank())){ //merge
                                        snumbers[i][j+1] = (Integer.toString(2*(Integer.parseInt(snumbers[i][j]))) + "m");
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    }
                                }
                            }
                            break;

                        case 4: //left
                            for(int i = 0; i < 4; i++){
                                for(int j = 1; j < 4; j++){
                                    if(snumbers[i][j-1].isBlank() && !(snumbers[i][j].isBlank())){ //shift
                                        snumbers[i][j-1] = snumbers[i][j];
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    } else if(snumbers[i][j-1].equals(snumbers[i][j]) && !(snumbers[i][j].isBlank())){ //merge
                                        snumbers[i][j-1] = (Integer.toString(2*(Integer.parseInt(snumbers[i][j]))) + "m");
                                        snumbers[i][j] = " ";
                                        shifts++;
                                    }
                                }
                            }
                            break;
                    }
                    if(shifts > 0){
                        updatedBoard = true;
                    }
                }while(shifts > 0);

                if(updatedBoard){ //choose wheter to generate a new number or not
                    do{
                        //choose random box to generate new number
                        //System.out.println("iterate");
                        int row = rng.nextInt(3);
                        int column = rng.nextInt(3);

                        if(snumbers[row][column].isBlank()){
                            isEmpty = true;
                            snumbers[row][column] = Integer.toString(generateNumber());
                        } else{
                            isEmpty = false;
                        }
                    }while(!isEmpty);
                }


                for(int i = 0; i < 4; i++){ //remove "m" from numbers
                    for(int j = 0; j < 4; j++){
                        if(snumbers[i][j].contains("m")){
                            snumbers[i][j] = snumbers[i][j].replace("m", " ");
                            snumbers[i][j] = snumbers[i][j].strip();
                        }
                    }
                }

                for(int i = 0; i < 4; i++){
                    //print the board
                    System.out.println(" " + snumbers[i][0] + " | " + snumbers[i][1] + " | " + snumbers[i][2] + " | " + snumbers[i][3]);
                }

                do{
                    //capture the move for next iteration
                    System.out.println("1.up   2.down   3.right   4.left");
                    move = sc.nextByte();
                }while(move < 1 || move > 4);
                updatedBoard = false;
            }
        }
        static int generateNumber(){
            //choose whether to generate a 2 or a 4
            byte probability = (byte)Math.floor(Math.random()*10);
            if(probability > 8){
                return 4;
            } else{
                return 2;
            }
        }
    }

