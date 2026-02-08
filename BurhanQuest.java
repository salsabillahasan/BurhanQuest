import java.util.Scanner;

public class BurhanQuest {
    // Banner pembuka, silakan manfaatkan variabel ini untuk menampilkan banner di
    // awal dan di akhir program
    private static final String BANNER = " ____             _                  ___                 _   \n" + //
            "| __ ) _   _ _ __| |__   __ _ _ __  / _ \\ _   _  ___ ___| |_ \n" + //
            "|  _ \\| | | | '__| '_ \\ / _` | '_ \\| | | | | | |/ _ / __| __|\n" + //
            "| |_) | |_| | |  | | | | (_| | | | | |_| | |_| |  __\\__ | |_ \n" + //
            "|____/ \\__,_|_|  |_| |_|\\__,_|_| |_|\\__\\_\\\\__,_|\\___|___/\\__|";
    private static final String STUDENT_NAME = "Salsabilla Hasan";
    private static final String STUDENT_ID = "2506548660";

    // Penanda atribut, silakan manfaatkan variabel ini untuk menandai atribut di
    // dalam data
    // Atribut yang sama
    private static final char NAME_IDENTIFIER = '!';
    private static final char STATUS_IDENTIFIER = '@';
    private static final char EXP_IDENTIFIER = '#';

    // Atribut khusus quest
    private static int questId = 1;
    private static final char REWARD_IDENTIFIER = '$';
    private static final char DESC_IDENTIFIER = '%';
    private static final char DIFFICULTY_IDENTIFIER = '^';

    // Atribut khusus pengembara
    private static int travelerId = 1;
    private static final char LEVEL_IDENTIFIER = '$';

    private static final int MAX_EXP = 1_310_720_000;

    // Scanner untuk input, silakan manfaatkan variabel ini untuk mengambil input
    // dari user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO: Tampilkan banner
        System.out.println(BANNER);
        System.out.println();
        System.out.println("Selamat datang di BurhanQuest!");
        System.out.println("Dibuat oleh: " + STUDENT_NAME + " - " + STUDENT_ID);
        System.out.println("Mari kita mulai dengan membuat sejumlah data quest dan pengembara.");

        // TODO: Seeding data quest dan pengembara
        int questCount = 0, travelerCount = 0;
        boolean invalidInput = true;

        // TODO: Input banyak quest dan pengembara
        while (invalidInput) {
            System.out.print("Silakan masukkan banyak quest yang ingin didaftarkan: ");
   
            if (input.hasNextInt()){
                questCount = input.nextInt();
            // TODO: Validasi input jumlah quest
                input.nextLine(); 

                if (questCount >= 0) {
                    invalidInput = false;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }

            } else {
                input.nextLine();
                System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
            }
        }
        // TODO: Input jumlah pengembara
        invalidInput = true;
        while (invalidInput) {
            System.out.print("Silakan masukkan banyak pengembara yang ingin didaftarkan: ");
            if (input.hasNextInt()){
                travelerCount = input.nextInt();
                input.nextLine();
                if (travelerCount >= 0) {
                    invalidInput = false;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan bulat nonnegatif.");
                input.nextLine();
            }
        }           
        System.out.println();

        String questData = "";
        String travelerData = "";
        System.out.println("Mulai memasukkan data quest.");

        // TODO: Input data quest sebanyak quest yang diminta
        for (int i = 0; i < questCount; i++) {
            System.out.println("Quest " + (i + 1));

            System.out.print("Masukkan nama quest: ");
            String nama = input.nextLine();

            System.out.print("Masukkan deskripsi quest: ");
            String desc = input.nextLine();

            int reward = -1;
            while (reward < 0) {
                System.out.print("Masukkan reward quest berupa bilangan bulat nonnegatif: ");
                if (input.hasNextInt()) {
                    reward = input.nextInt();
                    input.nextLine();
                    if (reward < 0) {
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    }
    
                } else {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    input.nextLine();
                }
                
            }

            int exp = -1;
            while (exp < 0) {
                System.out.print("Masukkan bonus exp quest berupa bilangan bulat nonnegatif : ");
                if (input.hasNextInt()) {
                    exp = input.nextInt();
                    input.nextLine();
                    if (exp < 0) {
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    }
    
                } else {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    input.nextLine();
                }
                
            }

            String kesulitan = "";
            while (true) {
                System.out.print("Masukkan tingkat kesulitan quest (opsi : mudah, menengah, sulit) : ");
                kesulitan = input.nextLine();

                if (kesulitan.equalsIgnoreCase("mudah") || kesulitan.equalsIgnoreCase("menengah") ||  kesulitan.equalsIgnoreCase("sulit")) {
                    break;
                }
                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
            }

            questData += "Q" + questId + "" + NAME_IDENTIFIER + nama + DESC_IDENTIFIER + desc + REWARD_IDENTIFIER +reward + EXP_IDENTIFIER + exp + DIFFICULTY_IDENTIFIER +kesulitan + STATUS_IDENTIFIER + "tersedia\n" ;
            questId++;
            System.out.println("Quest berhasil ditambahkan");   
        }
        System.out.println();

        System.out.println("Mulai memasukkan data pengembara.");
        // TODO: Input data pengembara sebanyak pengembara yang diminta
        for (int i = 0; i < travelerCount; i++) {
            boolean entryValid = false;

            while (!entryValid) {
                System.out.println("Pengembara " + (i + 1));
                System.out.print("Masukkan nama pengembara : ");
                String namatraveler = input.nextLine();

                System.out.print("Masukkan level pengembara berupa bilangan bulat [1, 20]: ");
                if (input.hasNextInt()) {
                    int level = input.nextInt();
                    input.nextLine();

                    if (namatraveler.matches("^[a-zA-Z0-9 ]+$") && (level >= 1) && (level <= 20) ) {
                        int expValue = 0;
                        if (level > 1) {
                            expValue = (int) (5000 * Math.pow(2, (level-2)));
                        }
                        travelerData += "P" + travelerId + "" + NAME_IDENTIFIER + namatraveler + LEVEL_IDENTIFIER + level + EXP_IDENTIFIER + expValue + STATUS_IDENTIFIER + "kosong\n";
                        travelerId ++;
                        System.out.println("Pengembara berhasil ditambahkan");
                        System.out.println("Data berhasil dimasukkan.");
                        entryValid = true;
                    } else {
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                    }
                } else {
                    System.out.println("Intput tidak valid. Harap masukkan data dengan benar.");
                }
            }
        }
        

        boolean running = true;
        // TODO: Loop menu utama
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Lihat daftar quest");
            System.out.println("2. Lihat daftar pengembara");
            System.out.println("3. Tambah quest");
            System.out.println("4. Tambah pengembara");
            System.out.println("5. Menjalankan quest");
            System.out.println("6. Menyelesaikan quest");
            System.out.println("7. Filter daftar quest");
            System.out.println("8. Filter daftar pengembara");
            System.out.println("9.Tampilkan daftar quest terurut");
            System.out.println("10.Tampilkan daftar pengembara terurut");
            System.out.println("11. Keluar");
            System.out.print("Masukkan pilihan: ");
            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    // TODO: Tampilkan daftar quest
                    if (questData.isEmpty()) {
                        System.out.println("Daftar quest kosong.");
                    } else {
                        System.out.println("Quest yang terdaftar : ");
                        String[] barisQuest = questData.split("\n");

                        for(String baris : barisQuest){
                            String[] data = baris.split("[!%\\$#\\^@]");

                            String tingkatKesulitan = "";
                            if (data[5].equalsIgnoreCase("mudah")) tingkatKesulitan = "\u2605";
                            else if (data[5].equalsIgnoreCase("menengah")) tingkatKesulitan = "\u2605\u2605";
                            else if (data[5].equalsIgnoreCase("sulit")) tingkatKesulitan = "\u2605\u2605\u2605";

                            String statusMentah = data[6];
                            String statusTampilan = "";
                            if (statusMentah.equals("tersedia")) statusTampilan = "tersedia \ud83d\udfe2";
                            else if (statusMentah.equals("selesai")) statusTampilan = "selesai \ud83c\udfc6";
                            else if (statusMentah.startsWith("diambil")) statusTampilan = statusMentah +"\u231b";

                            System.out.println("ID Quest: " + data[0]);
                            System.out.println("Nama Quest: " + data[1]);
                            System.out.println("Deskripsi Quest: " + data[2]);
                            System.out.println("Reward Quest: " + data[3] + " koin");
                            System.out.println("Bonus Exp Quest: " + data[4] + " poin exp");
                            System.out.println("Tingkat Kesulitan Quest: " + tingkatKesulitan);
                            System.out.println("Status Quest: " + statusTampilan);
                            System.out.println();

                        }
                    }
                    break;
                case "2":
                    // TODO: Tampilkan daftar pengembara
                    if (travelerData.isEmpty()) {
                        System.out.println("Daftar pengembara kosong.");
                    } else {
                        System.out.println("Pengembara yang terdaftar : ");
                        String[] lines = travelerData.split("\n");
                        for (String line : lines) {
                            String[] data = line.split("[!\\$#@]");

                            String statusBentuk = data[4];
                            if (data[4].equalsIgnoreCase("kosong")) statusBentuk = "kosong \u2705";
                            else if (data[4].equalsIgnoreCase("dalam quest")) statusBentuk = "dalam quest \u274c ";

                            System.out.println("ID Pengembara : " + data[0]);
                            System.out.println("Nama Pengembara : " + data[1]);
                            System.out.println("Level Pengembara : " + data[2]);
                            System.out.println("Exp Pengembara : " + data[3] + " poin exp");
                            System.out.println("Status Pengembara : " + statusBentuk);
                            System.out.println();
                        }
                    }
                    break;
                case "3":
                    // TODO: Tambah quest
                    System.out.print("Masukkan nama quest: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan deskripsi quest: ");
                    String desc = input.nextLine();

                    int reward = -1;
                    while(reward < 0) {
                        System.out.print("Masukkan reward quest berupa bilangan bulat. " );
                        if (input.hasNextInt()) {
                            reward = input.nextInt();
                            input.nextLine();
                            if (reward < 0) {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        } else {
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            input.nextLine();
                        }
                    }

                    int exp = -1;
                    while (exp < 0) {
                        System.out.print("Masukkan bonus exp quest berupa bilangan bulat: ");
                        if (input.hasNextInt()) {
                            exp = input.nextInt();
                            input.nextLine();
                            if (exp < 0) {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        } else {
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            input.nextLine();
                        }
                    }

                    String kesulitan = "";
                    while (true) {
                        System.out.print("Masukkan tingkat kesulitan quest (opsi : mudah, menengah, sulit): ");
                        kesulitan = input.nextLine();

                        if (kesulitan.equalsIgnoreCase("mudah") || kesulitan.equalsIgnoreCase("menengah") || kesulitan.equalsIgnoreCase("sulit")) {
                            break;
                        }
                        System.out.println("Input tidak valid. Harap masukkan data dengan benar.");

                    }

                    questData += "Q" + questId + NAME_IDENTIFIER + nama + DESC_IDENTIFIER + desc + REWARD_IDENTIFIER + reward + EXP_IDENTIFIER + exp + DIFFICULTY_IDENTIFIER + kesulitan + STATUS_IDENTIFIER + "tersedia\n";
                    questId ++;
                    System.out.println("Quest berhasil ditambahkan.");
                    System.out.println(); 
                    break;
                case "4":
                    // TODO: Tambah pengembara
                    boolean entryValid = false;
                    while (!entryValid) {
                        System.out.print("Masukkan nama pengembara: ");
                        String namatraveler = input.nextLine();

                        System.out.print("Masukkan level pengembara berupa bilangan bulat: ");
                        if (input.hasNextInt()) {
                            int level = input.nextInt();
                            if ((namatraveler.matches("^[a-zA-Z0-9 ]+$")) && (level >= 1) && (level <= 20)) {
                                int expValue = 0;
                                input.nextLine();
                                if (level > 1) {
                                    expValue = (int) (5000 * Math.pow (2, (level-2)));
                                }
                                travelerData += "P" + travelerId + NAME_IDENTIFIER + namatraveler + LEVEL_IDENTIFIER + level + EXP_IDENTIFIER + expValue + STATUS_IDENTIFIER + "kosong\n" ;
                                travelerId ++;
                                entryValid = true;
                                System.out.println("Pengembara berhasil ditambahkan.");
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        } else {
                            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            input.nextLine();
                        }
                    }
                    break;
                case "5":
                    // TODO: Menjalankan quest
                    System.out.println("Belum diimplementasikan");
                    break;
                case "6":
                    // TODO: Menyelesaikan quest
                    System.out.println("Belum diimplementasikan");
                    break;
                case "7":
                    // TODO: Filter daftar quest
                    System.out.println("Belum diimplementasikan");
                    break;
                case "8":
                    // TODO: Filter daftar pengembara
                    System.out.println("Belum diimplementasikan");
                    break;
                case "9":
                    // TODO: Tampilkan daftar quest terurut
                    System.out.println("Belum diimplementasikan");
                    break;
                case "10":
                    // TODO: Tampilkan daftar pengembara terurut
                    System.out.println("Belum diimplementasikan");
                    break;
                case "11":
                    // TODO: Keluar
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
