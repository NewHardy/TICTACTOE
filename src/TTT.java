import java.util.Random;
import java.util.Scanner;

public class TTT {
    Scanner scan = new Scanner(System.in);
    String[] grid = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void gameStart() {
        Random random = new Random();
        System.out.println("Welcome to the TicTacToe game\n____________________\nPlayer - X\nPC - O");
        while (true)
        {
        System.out.println("Select your move");
        drawGrid();
        String choose = scan.nextLine();
        checkUse(choose);
        if (playerWon)
        {
            System.out.println("YOU WON!!!");
        }
        int a;
        a = random.nextInt(9);
        checkUse(a);
        if (PCWon)
        {
            System.out.println("GAME OVER\nLuck next time!!!");
        }
        drawGrid();

        }
    }

    private void drawGrid() {
        for (int i = 0; i < grid.length - 3; i += 3) {
            System.out.println(grid[i] + "|" + grid[i + 1] + "|" + grid[i + 2]);
        }
    }

    private void checkUse(String choose) {
        boolean correct = true;
        while (correct) {
            if (choose.equals("1")) {
                if (grid[0].equals("O") || grid[0].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("2")) {
                if (grid[1].equals("O") || grid[1].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("3")) {
                if (grid[2].equals("O") || grid[2].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("4")) {
                if (grid[3].equals("O") || grid[3].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("5")) {
                if (grid[4].equals("O") || grid[4].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("6")) {
                if (grid[5].equals("O") || grid[5].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("7")) {
                if (grid[6].equals("O") || grid[6].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("8")) {
                if (grid[7].equals("O") || grid[7].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("9")) {
                if (grid[8].equals("O") || grid[8].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else {
                System.out.println("Error");
            }
        }
    }
    private void checkUse(int a) {
        String choose= String.valueOf(a);
        boolean correct = true;
        while (correct) {
            if (choose.equals("1")) {
                if (grid[0].equals("O") || grid[0].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("2")) {
                if (grid[1].equals("O") || grid[1].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("3")) {
                if (grid[2].equals("O") || grid[2].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("4")) {
                if (grid[3].equals("O") || grid[3].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("5")) {
                if (grid[4].equals("O") || grid[4].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("6")) {
                if (grid[5].equals("O") || grid[5].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("7")) {
                if (grid[6].equals("O") || grid[6].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("8")) {
                if (grid[7].equals("O") || grid[7].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else if (choose.equals("9")) {
                if (grid[8].equals("O") || grid[8].equals("X")) {
                    System.out.println("is all ready in use");
                } else {
                    grid[1] = "X";
                    correct = true;
                }
            } else {
                System.out.println("Error");
            }
        }
    }
    private boolean checkWin(char player)
    {

    }
}
