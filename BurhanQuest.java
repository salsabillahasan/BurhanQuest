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

            String nama = "";
            while (true) {
                System.out.print("Masukkan nama quest: ");
                nama = input.nextLine();
                if (nama.matches("^[a-zA-Z0-9 ]+$")) {
                    break;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }
            }
         
            String desc = "";
            while (true) {
                System.out.print("Masukkan deskripsi quest: ");
                desc = input.nextLine();
                if (desc.matches("^[a-zA-Z0-9 ]+$")) {
                    break;
                } else {
                    System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                }
            }

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
                    System.out.println("Quest yang terdaftar : ");
                    Scanner bacaData = new Scanner(questData);

                    while (bacaData.hasNextLine()) {
                        String baris = bacaData.nextLine();

                        int posisiNama = baris.indexOf(NAME_IDENTIFIER);
                        int posisiDesc = baris.indexOf(DESC_IDENTIFIER);
                        int posisiReward = baris.indexOf(REWARD_IDENTIFIER);
                        int posisiBonusExp = baris.indexOf(EXP_IDENTIFIER);
                        int posisiDiff = baris.indexOf(DIFFICULTY_IDENTIFIER);
                        int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);

                        String id = baris.substring(0, posisiNama);
                        String nama = baris.substring(posisiNama + 1, posisiDesc);
                        String desc = baris.substring(posisiDesc + 1, posisiReward);
                        String reward = baris.substring(posisiReward + 1, posisiBonusExp);
                        String exp = baris.substring(posisiBonusExp + 1, posisiDiff);

                        String diff = baris.substring(posisiDiff + 1, posisiStatus);
                        if (diff.equalsIgnoreCase("mudah")) {
                            diff = "\u2605"; }
                        if (diff.equalsIgnoreCase("menengah")) {
                            diff = "\u2605 \u2605"; }
                        if (diff.equalsIgnoreCase("sulit")) {
                            diff = "\u2605 \u2605 \u2605"; }
             

                        String status = baris.substring(posisiStatus + 1);
                        if (status.equalsIgnoreCase("tersedia")) {
                            status = "tersedia \ud83d\udfe2";
                        } else if (status.startsWith("diambil-")) {
                            status = status + "\u231b";
                        } else if (status.equalsIgnoreCase("selesai")) {
                            status = "selesai \ud83c\udfc6";
                        }

                        System.out.println("ID Quest : " + id);
                        System.out.println("Nama Quest : " + nama);
                        System.out.println("Deskripsi Quest : " + desc);
                        System.out.println("Reward Quest : " + reward + " koin");
                        System.out.println("Bonus Exp Quest : " + exp + " poin exp");
                        System.out.println("Tingkat Kesulitan Quest : " + diff);
                        System.out.println("Status Quest : " + status);
                        System.out.println();
                    }
                    bacaData.close();
                    break;

                case "2":
                    // TODO: Tampilkan daftar pengembara
                    System.out.println("Pengembara yang terdaftar : ");
                    Scanner lihatData = new Scanner(travelerData);
                    
                    while (lihatData.hasNextLine()){
                        String baris = lihatData.nextLine();

                        int posisiNama = baris.indexOf(NAME_IDENTIFIER);
                        int posisiLevel = baris.indexOf(LEVEL_IDENTIFIER);
                        int posisiExp = baris.indexOf(EXP_IDENTIFIER);
                        int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);

                        String id = baris.substring(0, posisiNama);
                        String nama = baris.substring(posisiNama + 1, posisiLevel);
                        String level = baris.substring(posisiLevel + 1, posisiExp);
                        String exp = baris.substring(posisiExp + 1, posisiStatus);

                        String status = baris.substring(posisiStatus + 1);
                        if (status.equalsIgnoreCase("kosong")) {
                            status = "kosong \u2705";
                        } else if (status.equalsIgnoreCase("dalam quest")) {
                            status = "dalam quest \u274c";
                        }

                        System.out.println("ID Pengembara : " + id);
                        System.out.println("Nama Pengembara : " + nama);
                        System.out.println("Level Pengembara : " + level);
                        System.out.println("Exp Pengembara : " +exp + " poin exp");
                        System.out.println("Status Pengembara : " + status);
                        System.out.println();

                    }

                    lihatData.close();
                    break;

                case "3":
                    // TODO: Tambah quest
                    boolean kembali = false;
                    String namaQ = "";
                    String descQ = "";
                    String rewardQinput = "";
                    int rewardQ = -1;
                    String expQinput = "";
                    int expQ = -1;
                    String diffQ = "";
                    
                    while (true) {
                        System.out.print("Masukkan nama quest (masukkan 'x' atau 'X' untuk kembali) : ");
                        namaQ = input.nextLine();

                        if (namaQ.equalsIgnoreCase("x")) {
                            kembali = true;
                            break;
                        } else if (namaQ.matches("^[a-zA-Z0-9 ]+$")) {
                            break;
                        } else {
                            System.out.println("Input tidak valid. Masukkan data dengan benar.");
                        }
                    }

                    if (!kembali){
                        while (true) {
                            System.out.print("Masukkan deskripsi quest (masukkan 'x' atau 'X' untuk kembali) : ");
                            descQ = input.nextLine();
    
                            if (descQ.equalsIgnoreCase("x")) {
                                kembali = true;
                                break;
                            } else if (descQ.matches("^[a-zA-Z0-9 ]+$")) {
                                break;
                            } else {
                                System.out.println("Input tidak valid. Masukkan data dengan benar.");
                            }
                        }
                    }

                    if (!kembali) {
    
                        while (true) {
                            System.out.println("Masukkan reward quest berupa bilangan bulat (masukkan 'x' atau 'X' untuk kembali) : ");
                            rewardQinput = input.nextLine();
    
                            if (rewardQinput.equalsIgnoreCase("x")) {
                                kembali = true;
                                break;
                            } else if (rewardQinput.matches("^[0-9]+$")) {
                                rewardQ = Integer.parseInt(rewardQinput);
                                if (rewardQ >= 0)  {
                                    break;
                                }
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        }
                    }
                    
                    if (!kembali) {
                        
                        while (true) {
                            System.out.println("Masukkan bonus exp quest berupa bilangan bulat (masukkan 'x' atau 'X' untuk kembali) : ");
                            expQinput = input.nextLine();
    
                            if (expQinput.equalsIgnoreCase("x")) {
                                kembali = true;
                                break;
                            } else if (expQinput.matches("^[0-9]+$")) {
                                expQ = Integer.parseInt(expQinput);
                                if (expQ >= 0) {
                                    break;
                                }
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        }
                    }

                    if (!kembali) {
    
                        while (true) {
                            System.out.println("Masukkan tingkat kesulitan quest (opsi : mudah, menengah, sulit) (masukkan 'x' atau 'X' untuk kembali) : ");
                            diffQ = input.nextLine();
    
                            if (diffQ.equalsIgnoreCase("x")) {
                                kembali = true;
                                break;
                            } else if (diffQ.equalsIgnoreCase("mudah") || diffQ.equalsIgnoreCase("menengah") || diffQ.equalsIgnoreCase("sulit")) {
                                break;
                            }
                        }
                    }

                    if (!kembali) {
                        questData += "Q" + questId + "" + NAME_IDENTIFIER + namaQ + DESC_IDENTIFIER + descQ + REWARD_IDENTIFIER +rewardQinput + EXP_IDENTIFIER + expQinput + DIFFICULTY_IDENTIFIER +diffQ + STATUS_IDENTIFIER + "tersedia\n" ;
                        questId++;
                        System.out.println("Quest berhasil ditambahkan");   

                    }
                    break;

                case "4":
                    // TODO: Tambah pengembara
                    boolean cancel = false;
                    String namaP = "";
                    String levelPinput = "";
                    int levelP = -1;
                    
                    if (!cancel) {
                        while (true) {
                            System.out.print("Masukkan nama pengembara ((masukkan 'x' atau 'X' untuk kembali) : ");
                            namaP = input.nextLine();
                            if (namaP.equalsIgnoreCase("x")) {
                                cancel = true;
                                break;
                            } else if (namaP.matches("^[a-zA-Z0-9 ]+$")) {
                                break;
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        }
                    }

                    if (!cancel) {
                        while (true) {
                            System.out.print("Masukkan level pengembara berupa bilangan bulat (masukkan 'x' atau 'X' untuk kembali) : ");
                            levelPinput = input.nextLine();

                            if (levelPinput.equalsIgnoreCase("x")) {
                                cancel = true;
                                break;
                            } else if (levelPinput.matches("^[0-9]+$")) {
                                levelP = Integer.parseInt(levelPinput);
                                if ((levelP >= 1) && (levelP <= 20)) {
                                    break;
                                }
                            } else {
                                System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
                            }
                        }
                    }

                    if (!cancel) {
                        int expValue = 0;
                        if (levelP > 1) {
                        expValue = (int) (5000 * Math.pow(2, (levelP-2)));
                    }

                        travelerData += "P" + travelerId + "" + NAME_IDENTIFIER + namaP + LEVEL_IDENTIFIER + levelPinput + EXP_IDENTIFIER + expValue + STATUS_IDENTIFIER + "kosong\n";
                        travelerId ++;
                        System.out.println("Pengembara berhasil ditambahkan");
                    }

                    break;

                case "5":
                    // TODO: Menjalankan quest
                    boolean balikMenu = false;
                    String idInputQ = "";
                    String diff = "";
                    while (!balikMenu) {
                        boolean questKetemu = false;

                        while (true){
                            System.out.print("Masukkan ID Quest yang ingin diambil (atau 'X' / 'x' untuk kembali) : ");
                            idInputQ = input.nextLine();
                            if (idInputQ.equalsIgnoreCase("x")) {
                                balikMenu = true;
                                break;
                            } 
                            
                            Scanner cariQuest = new Scanner(questData);    
                            while (cariQuest.hasNextLine()) {
                                String baris = cariQuest.nextLine();
                                int posisiNama = baris.indexOf(NAME_IDENTIFIER);
                                int posisiDiff = baris.indexOf(DIFFICULTY_IDENTIFIER);
                                int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);
    
                                String id = baris.substring(0, posisiNama);
                                diff = baris.substring(posisiDiff + 1, posisiStatus);
                                String status = baris.substring(posisiStatus + 1);
    
                                if (id.equalsIgnoreCase(idInputQ)) {
                                    if (status.equalsIgnoreCase("tersedia")) {
                                        questKetemu = true;
                                        idInputQ = id;
                                        break;
                                    } 
                                } 
                            }
                            cariQuest.close();
    
                            if (questKetemu) {
                                break;
                            } else {
                                System.out.println("Quest tidak ditemukan atau sudah diambil/selesai.");
                            }
                        }

                        if(balikMenu) {
                            break;
                        }
                        boolean ketemuPengembara = false;
                        boolean syaratLevel = false;
                        String idInputP = "";
                        while (true) {
                            System.out.print("Masukkan ID Pengembara yang akan mengambil quest (atau 'X'/'x' untuk kembali) : ");
                            idInputP = input.nextLine();
    
                            if (idInputP.equalsIgnoreCase("x")) {
                                balikMenu = true;
                                break;
                            }
    
                            Scanner cariPengembara = new Scanner(travelerData);
                            while (cariPengembara.hasNextLine()) {
                                String baris = cariPengembara.nextLine();
    
                                int posisiNama = baris.indexOf(NAME_IDENTIFIER);
                                int posisiLevel = baris.indexOf(LEVEL_IDENTIFIER);
                                int posisiExp = baris.indexOf(EXP_IDENTIFIER);
                                int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);
    
                                String id = baris.substring(0, posisiNama);
                                int level = Integer.parseInt(baris.substring(posisiLevel + 1, posisiExp));
                                String status = baris.substring(posisiStatus + 1);
    
                                if (idInputP.equalsIgnoreCase(id)) {
                                    if (status.equalsIgnoreCase("kosong")) {
                                        if (diff.equalsIgnoreCase("sulit") && level >= 16) {
                                            syaratLevel = true;
                                        } else if (diff.equalsIgnoreCase("menengah") && level >= 6) {
                                            syaratLevel = true;
                                        } else if (diff.equalsIgnoreCase("mudah")) {
                                            syaratLevel = true;
                                        }
    
                                        if (syaratLevel) {
                                            ketemuPengembara = true;
                                            break;
                                        }
                                    }
                                }
                            }
                          
                            cariPengembara.close();
    
                            if (ketemuPengembara) {
                                String questDataBaru = "";
                                Scanner updateQuest = new Scanner(questData);
    
                                while (updateQuest.hasNextLine()) {
                                    String baris = updateQuest.nextLine();
                                    if (baris.startsWith(idInputQ + NAME_IDENTIFIER)) {
                                        int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);
                                        questDataBaru += baris.substring(0, posisiStatus + 1) + "diambil-" + idInputP + "\n";
                                    } else {
                                        questDataBaru += baris + "\n";
                                    }
                                }
                                questData = questDataBaru;
                                updateQuest.close();
    
                                String travelerDataBaru = "";
                                Scanner updatePengembara = new Scanner(travelerData);
    
                                while (updatePengembara.hasNextLine()) {
                                    String baris = updatePengembara.nextLine();
                                    if (baris.startsWith(idInputP + NAME_IDENTIFIER)) {
                                        int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);
                                        travelerDataBaru += baris.substring(0, posisiStatus + 1) + "dalam quest\n";
                                    } else {
                                        travelerDataBaru += baris + "\n";
                                    }
                                }
                                travelerData = travelerDataBaru;
                                updatePengembara.close();
                                System.out.println("Quest berhasil dijalankan!");
                                balikMenu = true;
                                break;
    
                            } else {
                                System.out.println("Pengembara tidak ditemukan atau tidak memenuhi persyaratan untuk mengambil quest.");
                                break;
                            }
                        }
                    }       
                    break;

                case "6":
                    // TODO: Menyelesaikan quest
                    boolean balikMenu6 = false;

                    while (!balikMenu6) {
                        System.out.print("Masukkan ID Quest yang ingin diselesaikan (atau 'X'/'x' untuk kembali) : ");
                        String idquestSelesai = input.nextLine();

                        if (idquestSelesai.equalsIgnoreCase("x")) {
                            balikMenu6 = true;
                            break;
                        }

                        //cari quest
                        Scanner cariQuest6 = new Scanner(questData);
                        boolean questKetemu6 = false;
                        String idPengembaraYangAmbil = "";
                        long bonusExpQ = 0;

                        while(cariQuest6.hasNextLine()) {
                            String baris = cariQuest6.nextLine();
                            int posisiNama6 = baris.indexOf(NAME_IDENTIFIER);
                            int posisiBonusExp6 = baris.indexOf(EXP_IDENTIFIER);
                            int posisiDiff6 = baris.indexOf(DIFFICULTY_IDENTIFIER);
                            int posisiStatus6 = baris.indexOf(STATUS_IDENTIFIER);

                            String idQuest6 = baris.substring(0, posisiNama6);
                            String status6 = baris.substring(posisiStatus6 + 1);

                            if (idQuest6.equalsIgnoreCase(idquestSelesai)) {
                                if (status6.startsWith("diambil-")) {
                                    questKetemu6 = true;
                                    idPengembaraYangAmbil = status6.substring(status6.indexOf("-") + 1);
                                    bonusExpQ = Long.parseLong(baris.substring(posisiBonusExp6 + 1, posisiDiff6));                                    
                                    break;
                                }

                            }
                        }
                        cariQuest6.close();

                        Scanner cariPengembara6 = new Scanner(travelerData);
                        long expLama = 0;
                        int levelBaru = 0;
                        boolean naikLevel = false;
                        long totalexpBaru = 0;
                        String travelerDataBaru = "";

                        while (cariPengembara6.hasNextLine()) {
                            String baris6 = cariPengembara6.nextLine();
                            int posisiNamaP6 = baris6.indexOf(NAME_IDENTIFIER);
                            int level = baris6.indexOf(LEVEL_IDENTIFIER);
                            int posisiExp6 = baris6.indexOf(EXP_IDENTIFIER);
                            int statusP6 = baris6.indexOf(STATUS_IDENTIFIER);

                            String idP6 = baris6.substring(0, posisiNamaP6);
                            
                            if (idP6.equalsIgnoreCase(idPengembaraYangAmbil)) {
                                int levelLama6 = Integer.parseInt(baris6.substring(level + 1, posisiExp6));
                                expLama = Long.parseLong(baris6.substring(posisiExp6 + 1, statusP6));
                                totalexpBaru = expLama + bonusExpQ;
                                long targetExp = (long) (5000 * Math.pow(2, levelLama6-1));

                                if ((totalexpBaru >= targetExp) && (levelLama6 < 20)) {
                                    levelBaru = levelLama6 + 1;
                                    naikLevel = true;
                                } else {
                                    levelBaru = levelLama6;
                                }
                                if (totalexpBaru > MAX_EXP) {
                                    totalexpBaru = MAX_EXP; 
                                }

                                namaP = baris6.substring(posisiNamaP6 + 1, level);
                                travelerDataBaru += idP6 + NAME_IDENTIFIER + namaP + LEVEL_IDENTIFIER + levelBaru +EXP_IDENTIFIER + totalexpBaru + STATUS_IDENTIFIER + "kosong\n";
                                travelerData = travelerDataBaru;
                            } else {
                                travelerDataBaru += baris6 + "\n";
                            }
                        }    
                        cariPengembara6.close();

                        if (questKetemu6) {
                            String questDataBaru = "";
                            Scanner updateQuest = new Scanner(questData);

                            while (updateQuest.hasNextLine()) {
                                String baris = updateQuest.nextLine();
                                if (baris.startsWith(idquestSelesai + NAME_IDENTIFIER)) {
                                    int posisiStatus = baris.indexOf(STATUS_IDENTIFIER);
                                    questDataBaru += baris.substring(0, posisiStatus + 1) + "selesai\n";
                                } else {
                                    questDataBaru += baris + "\n";
                                }
                            }
                            questData = questDataBaru;
                            updateQuest.close();
                            System.out.println("Quest berhasil diselesaikan!");
                            System.out.println("Exp didapatkan : " + bonusExpQ);
                            System.out.println("Total Exp : " + totalexpBaru);

                            if (naikLevel) {
                                System.out.println("Level pengembara naik menjadi : " + levelBaru);
                            }
                            balikMenu6 = true;
                            break;                        
                        } else {
                            System.out.println("Quest tidak ditemukan atau belum diambil/selesai.");
                        }
                    }    
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
                    System.out.println("Terima kasih telah menggunakan BurhanQuest!");
                    System.out.println("Dibuat oleh: " + STUDENT_NAME + " - " + STUDENT_ID);
                    System.out.println(BANNER);
                    


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
