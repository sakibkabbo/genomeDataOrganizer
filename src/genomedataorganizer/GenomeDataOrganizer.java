/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genomedataorganizer;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhtasim
 */
public class GenomeDataOrganizer {

    private File[] rawData;
    private String[] sequences;
    private String[] individuals;
    char[][] genotype1;
    char[][] genotype2;
    char[][] genotype3;
    char[][] genotype4;
    char[][] genotype5;
    char[][] genotype6;
    char[][] genotype7;
    char[][] genotype8;
    char[][] genotype9;
    private int numIndividuals = 2504;

    /**
     * @param sequences
     * @param args the command line arguments
     */
    public void table1(String[] sequences, String[] individuals, char[][] genotype, File rawData, int seqnum) {
        try {

            Scanner sc = new Scanner(rawData);
            sequences[seqnum] = sc.nextLine();
            int i = 0;
            while (sc.hasNext()) {
                String nextline = sc.nextLine();
                String[] nextlineparts = nextline.split(":", 3);
                char[] nextlineusefulparts = (nextlineparts[2]).toCharArray();
                char[] individual = new char[7];
                for (int j = 0; j < individual.length; j++) {
                    individual[j] = nextlineusefulparts[j];
                }
                /*for (int j = 0; j < nextlineusefulparts.length; j++){
                 System.out.println(j + " " + nextlineusefulparts[j]);
                 }*/
                individuals[i] = new String(individual);
                genotype[i][0] = nextlineusefulparts[8];
                genotype[i][1] = nextlineusefulparts[10];

                //System.out.println(this.individuals[i] + " " + genotype[i][0] + "|" + genotype[i][1]); 
                i++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenomeDataOrganizer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void makeTables() {
        rawData = new File[9];
        sequences = new String[9];
        individuals = new String[numIndividuals];
        genotype1 = new char[numIndividuals][2];
        genotype2 = new char[numIndividuals][2];
        genotype3 = new char[numIndividuals][2];
        genotype4 = new char[numIndividuals][2];
        genotype5 = new char[numIndividuals][2];
        genotype6 = new char[numIndividuals][2];
        genotype7 = new char[numIndividuals][2];
        genotype8 = new char[numIndividuals][2];
        genotype9 = new char[numIndividuals][2];

        rawData[0] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data1.txt");
        rawData[1] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data2.txt");
        rawData[2] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data3.txt");
        rawData[3] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data4.txt");
        rawData[4] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data5.txt");
        rawData[5] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data6.txt");
        rawData[6] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data7.txt");
        rawData[7] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data8.txt");
        rawData[8] = new File("C:\\Users\\Muhtasim\\Documents\\U of T\\work\\genomeDataOrganizer\\src\\genomedataorganizer\\data9.txt");


        table1(sequences, individuals, genotype1, rawData[0], 0);
        table1(sequences, individuals, genotype2, rawData[1], 1);
        table1(sequences, individuals, genotype3, rawData[2], 2);
        table1(sequences, individuals, genotype4, rawData[3], 3);
        table1(sequences, individuals, genotype5, rawData[4], 4);
        table1(sequences, individuals, genotype6, rawData[5], 5);
        table1(sequences, individuals, genotype7, rawData[6], 6);
        table1(sequences, individuals, genotype8, rawData[7], 7);
        table1(sequences, individuals, genotype9, rawData[8], 8);

        //Printing table1 on console
        /*System.out.println("individual" + "    " + sequences[0]+ "   " + sequences[1] + "   " + sequences[2] + "   " + sequences[3] + "   " + sequences[4] + "   " + sequences[5]+ "   " + sequences[6]);
         for(int i = 0; i < numIndividuals; i++){
         System.out.println((i+1) + ". " +this.individuals[i] + "     " + genotype1[i][0] + "|" + genotype1[i][1] + "          " + genotype2[i][0] + "|" + genotype2[i][1] + "         " 
         + genotype3[i][0] + "|" + genotype3[i][1] + "          " + genotype4[i][0] + "|" + genotype4[i][1] + "          " + genotype5[i][0] + "|" + genotype5[i][1] + "          " + genotype6[i][0] + "|" + genotype6[i][1]+ "          " + genotype7[i][0] + "|" + genotype7[i][1]);  
         }*/
         
        //Printing table2 on console
        /*System.out.println("individual" + "     " + "genotype");
         for(int i = 0; i < numIndividuals; i++){
         System.out.println((i+1) + ". " +this.individuals[i] + "     " + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "/" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1]);  
         }*/
        /*Printing table 3 on console
         int GTAT = 0;
         int GCAT = 0;
         int ATGG = 0;
         int oth = 0;
         int othidx = 1;
         int GTGG = 0;
         int GTGT = 0;
         int ACGG = 0;
         System.out.println("individual" + "      " + "sequence" + "      " + "position" + "    " + "Other idx");
         for (int i = 0; i < numIndividuals; i++) {
         //First position links
         if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
         GTAT++;
         } else if (genotype1[i][0] == 'G' && genotype2[i][0] == 'C' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
         GCAT++;
         } else if (genotype1[i][0] == 'A' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
         ATGG++;
         } else {
         if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
         GTGG++;
         } else if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'T') {
         GTGT++;
         } else if (genotype1[i][0] == 'A' && genotype2[i][0] == 'C' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
         ACGG++;
         }
         System.out.println((i + 1) + " " + individuals[i] + "           " + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1" + "        " + othidx++);
         oth++;
         }

         //Second position links
         if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
         GTAT++;
         } else if (genotype1[i][1] == 'G' && genotype2[i][1] == 'C' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
         GCAT++;
         } else if (genotype1[i][1] == 'A' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
         ATGG++;
         } else {
         if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
         GTGG++;
         } else if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'T') {
         GTGT++;
         } else if (genotype1[i][1] == 'A' && genotype2[i][1] == 'C' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
         ACGG++;
         }
         System.out.println((i + 1) + " " + individuals[i] + "           " + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2" + "        " + othidx++);
         oth++;
         }

         }

         int Tally = GTAT + GCAT + ATGG + oth;
         System.out.println("cat1(GTAT) = " + GTAT);
         System.out.println("cat2(GCAT) = " + GCAT);
         System.out.println("cat3(ATGG) = " + ATGG);
         System.out.println("cat4(other) = " + oth);
        
         System.out.println("GTGG = " + GTGG);
         System.out.println("GTGT = " + GTGT);
         System.out.println("ACGG = " + ACGG);        
        
         System.out.println("Tally = " + Tally);
        
         */
        //Printing Table 4 or 5 on console
        /*int G_ATGG_s5 = 0;
        int C_ATGG_s5 = 0;
        int T_ATGG_s6 = 0;
        int G_ATGG_s6 = 0;
        System.out.println("individual" + "      " + "sequence" + "      " + "position");
        for (int i = 0; i < numIndividuals; i++) {
            //First position links
            if (genotype1[i][0] == 'A' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
                //Table 4 prints
                if (genotype5[i][0] == 'G') {
                    G_ATGG_s5++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype5[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1" );
                } else {
                    C_ATGG_s5++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype5[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1" );
                }

                //Table 5 prints
                if (genotype6[i][0] == 'T') {
                    T_ATGG_s6++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype6[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    G_ATGG_s6++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype6[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            }

            //Second position links
            if (genotype1[i][1] == 'A' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
                //Table 4 prints
                if (genotype5[i][1] == 'G') {
                    G_ATGG_s5++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype5[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2" );
                } else {
                    C_ATGG_s5++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype5[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2" );
                }

                //Table 5 prints
                if (genotype6[i][1] == 'T') {
                    T_ATGG_s6++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype6[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    G_ATGG_s6++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype6[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            }
        }
        int Tally_s5 = G_ATGG_s5 + C_ATGG_s5;
        int Tally_s6 = T_ATGG_s6 + G_ATGG_s6;
        System.out.println("cat1(G-ATGG) = " + G_ATGG_s5);
        System.out.println("cat2(C-ATGG) = " + C_ATGG_s5);
        System.out.println("Tally_s5 = " + Tally_s5);

        System.out.println("cat3(T-ATGG) = " + G_ATGG_s5);
        System.out.println("cat4(G-ATGG) = " + C_ATGG_s5);
        System.out.println("Tally_s6 = " + Tally_s6);
*/
        //Printing Table 6 + 7
        /*int A_GCAT = 0;
        int G_GCAT = 0;
        int A_GTAT = 0;
        int G_GTAT = 0;
        int A_ATGG = 0;
        int G_ATGG = 0;
        
        int other = 0;

        System.out.println("individual" + "      " + "sequence" + "      " + "position");
        for (int i = 0; i < numIndividuals; i++) {
            //First position links
            if (genotype1[i][0] == 'G' && genotype2[i][0] == 'C' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype7[i][0] == 'A') {
                    A_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    G_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype7[i][0] == 'A') {
                    A_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    G_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'A' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
                if (genotype7[i][0] == 'A') {
                    A_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    G_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else {
                other++;
                System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "     ot " + "pos 1");   
            }

            //Second position links
            if (genotype1[i][1] == 'G' && genotype2[i][1] == 'C' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype7[i][1] == 'A') {
                    A_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    G_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype7[i][1] == 'A') {
                    A_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    G_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'A' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
                if (genotype7[i][1] == 'A') {
                    A_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    G_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            }
            else {
                other++;
                System.out.println((i + 1) + " " + individuals[i] + "           " + genotype7[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "     ot " + "pos 2");   
            }
        }
        
        int Tally_s7 = A_ATGG + A_GCAT + A_GTAT + G_ATGG + G_GCAT + G_GTAT + other;
        System.out.println("cat1(A-GCAT) = " + A_GCAT);
        System.out.println("cat2(A-GTAT) = " + A_GTAT);
        System.out.println("cat3(A-ATGG) = " + A_ATGG);
        System.out.println("cat4(G-GCAT) = " + G_GCAT);
        System.out.println("cat5(G-GTAT) = " + G_GTAT);
        System.out.println("cat6(G-ATGG) = " + G_ATGG);        
        System.out.println("cat4(oth) = " + other);
        System.out.println("Tally_s7 = " + Tally_s7);*/
        
        //Printing Table 8 + 9
        /*int C_GCAT = 0;
        int G_GCAT = 0;
        int C_GTAT = 0;
        int G_GTAT = 0;
        int C_ATGG = 0;
        int G_ATGG = 0;
        
        int other = 0;

        System.out.println("individual" + "      " + "sequence" + "      " + "position");
        for (int i = 0; i < numIndividuals; i++) {
            //First position links
            if (genotype1[i][0] == 'G' && genotype2[i][0] == 'C' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype8[i][0] == 'G') {
                    G_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_GCAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype8[i][0] == 'G') {
                    G_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_GTAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'A' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
                if (genotype8[i][0] == 'G') {
                    G_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_ATGG++;
                  //  System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else {
                other++;
                //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "     ot " + "pos 1");   
            }

            //Second position links
            if (genotype1[i][1] == 'G' && genotype2[i][1] == 'C' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype8[i][1] == 'G') {
                    G_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_GCAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype8[i][1] == 'G') {
                    G_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_GTAT++;
                   // System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'A' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
                if (genotype8[i][1] == 'G') {
                    G_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_ATGG++;
                 //   System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            }
            else {
                other++;
               // System.out.println((i + 1) + " " + individuals[i] + "           " + genotype8[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "     ot " + "pos 2");   
            }
        }
        
        int Tally_s8 = G_ATGG + G_GCAT + G_GTAT + C_ATGG + C_GCAT + C_GTAT + other;
        System.out.println("cat1(G-GCAT) = " + G_GCAT);
        System.out.println("cat2(G-GTAT) = " + G_GTAT);
        System.out.println("cat3(G-ATGG) = " + G_ATGG);
        System.out.println("cat4(C-GCAT) = " + C_GCAT);
        System.out.println("cat5(C-GTAT) = " + C_GTAT);
        System.out.println("cat6(C-ATGG) = " + C_ATGG);        
        System.out.println("cat7(oth) = " + other);
        System.out.println("Tally_s8 = " + Tally_s8);*/
        
        
        //Printing table 10 + 11
        int C_GCAT = 0;
        int T_GCAT = 0;
        int C_GTAT = 0;
        int T_GTAT = 0;
        int C_ATGG = 0;
        int T_ATGG = 0;
        
        int other = 0;

        System.out.println("individual" + "      " + "sequence" + "      " + "position");
        for (int i = 0; i < numIndividuals; i++) {
            //First position links
            if (genotype1[i][0] == 'G' && genotype2[i][0] == 'C' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype9[i][0] == 'T') {
                    T_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_GCAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'G' && genotype2[i][0] == 'T' && genotype3[i][0] == 'A' && genotype4[i][0] == 'T') {
                if (genotype9[i][0] == 'T') {
                    T_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_GTAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else if (genotype1[i][0] == 'A' && genotype2[i][0] == 'T' && genotype3[i][0] == 'G' && genotype4[i][0] == 'G') {
                if (genotype9[i][0] == 'T') {
                    T_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                } else {
                    C_ATGG++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "      " + "pos 1");
                }
            } else {
                other++;
                //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][0] + "-" + genotype1[i][0] + genotype2[i][0] + genotype3[i][0] + genotype4[i][0] + "     ot " + "pos 1");   
            }

            //Second position links
            if (genotype1[i][1] == 'G' && genotype2[i][1] == 'C' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype9[i][1] == 'T') {
                    T_GCAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_GCAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'G' && genotype2[i][1] == 'T' && genotype3[i][1] == 'A' && genotype4[i][1] == 'T') {
                if (genotype9[i][1] == 'T') {
                    T_GTAT++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_GTAT++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            } else if (genotype1[i][1] == 'A' && genotype2[i][1] == 'T' && genotype3[i][1] == 'G' && genotype4[i][1] == 'G') {
                if (genotype9[i][1] == 'T') {
                    T_ATGG++;
                    System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                } else {
                    C_ATGG++;
                    //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "      " + "pos 2");
                }
            }
            else {
                other++;
                //System.out.println((i + 1) + " " + individuals[i] + "           " + genotype9[i][1] + "-" + genotype1[i][1] + genotype2[i][1] + genotype3[i][1] + genotype4[i][1] + "     ot " + "pos 2");   
            }
        }
        
        int Tally_s8 = T_ATGG + T_GCAT + T_GTAT + C_ATGG + C_GCAT + C_GTAT + other;
        System.out.println("cat1(T-GCAT) = " + T_GCAT);
        System.out.println("cat2(T-GTAT) = " + T_GTAT);
        System.out.println("cat3(T-ATGG) = " + T_ATGG);
        System.out.println("cat4(C-GCAT) = " + C_GCAT);
        System.out.println("cat5(C-GTAT) = " + C_GTAT);
        System.out.println("cat6(C-ATGG) = " + C_ATGG);        
        System.out.println("cat7(oth) = " + other);
        System.out.println("Tally_s9 = " + Tally_s8);        


    }

    public static void main(String[] args) {

        GenomeDataOrganizer org = new GenomeDataOrganizer();
        org.makeTables();

    }

}
