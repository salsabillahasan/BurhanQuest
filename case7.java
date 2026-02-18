                    // boolean balikMenuUtama = false;
                    // while (!balikMenuUtama) {
                    //     System.out.println("Filter daftar quest");
                    //     System.out.println("1. Filter berdasarkan status");
                    //     System.out.println("2. Filter berdasarkan tingkat kesulitan");
                    //     System.out.println("X. Kembali ke menu utama");
                    //     System.out.print("Masukkan tipe filter : ");
                    //     String pilihan = input.nextLine().trim();

                    //     switch (pilihan.toLowerCase()) {
                    //         case "1" :
                    //             boolean filter = false;
                    //             while (filter) {
                    //                 System.out.print("Masukkan status quest yang ingin difilter (tersedia/diambil/selesai), masukkan 'x' atau 'X' untuk keembali ke menu utama: ");
                    //                 String statusQ = input.nextLine();

                    //                 if (statusQ.equalsIgnoreCase("x")) {
                    //                     balikMenuUtama = true;
                    //                     filter = false;
                    //                     break;

                    //                 } if (statusQ.matches("^[a-zA-Z0-9 ]+$")) {
                    //                     Scanner filterStatus = new Scanner(questData);

                    //                     while (filterStatus.hasNextLine()) {
                    //                         String baris7 = filterStatus.nextLine();

                    //                         int diff7 = baris7.indexOf(DIFFICULTY_IDENTIFIER);
                    //                         int status7 = baris7.indexOf(STATUS_IDENTIFIER);

                    //                         String tingkatKesulitan = baris7.substring(diff7 + 1, status7);
                    //                         String bintang = "";
                    //                         if (tingkatKesulitan.equalsIgnoreCase("mudah")) {
                    //                             bintang = "\u2605"; 
                    //                         } else if (tingkatKesulitan.equalsIgnoreCase("menengah")) {
                    //                             bintang = "\u2605 \u2605"; 
                    //                         } else if (tingkatKesulitan.equalsIgnoreCase("sulit")) {
                    //                             bintang = "\u2605 \u2605 \u2605"; 
                    //                         }

                    //                         String status = baris7.substring(status7 + 1);
                    //                         if (status.equalsIgnoreCase("tersedia")) {
                    //                             status = "tersedia \ud83d\udfe2";
                    //                         } else if (status.startsWith("diambil-")) {
                    //                             status = status + "\u231b";
                    //                         } else if (status.equalsIgnoreCase("selesai")) {
                    //                             status = "selesai \ud83c\udfc6";
                    //                         }
                                            
                    //                         if (status.equalsIgnoreCase(statusQ)) {
                    //                             if (statusQ.equalsIgnoreCase("diambil") && status.startsWith("diambil-")) {
                    //                                 System.out.println("Daftar quest terfilter : ");
                    //                                 System.out.println("ID Quest : " + baris7.substring(0, baris7.indexOf(NAME_IDENTIFIER)));
                    //                                 System.out.println("Nama Quest : " + baris7.substring(baris7.indexOf(NAME_IDENTIFIER) + 1, baris7.indexOf(DESC_IDENTIFIER)));
                    //                                 System.out.println("Deskripsi Quest : " + baris7.substring(baris7.indexOf(DESC_IDENTIFIER) + 1, baris7.indexOf(REWARD_IDENTIFIER)));
                    //                                 System.out.println("Reward Quest : " + baris7.substring(baris7.indexOf(REWARD_IDENTIFIER) + 1, baris7.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                 System.out.println("Bonus Exp Quest : " + baris7.substring(baris7.indexOf(EXP_IDENTIFIER) + 1, baris7.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                 System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                 System.out.println("Status Quest : " + status);
                    //                                 System.out.println();
                    //                                 break;
                                                    
                    //                             } else if (status.equalsIgnoreCase(statusQ)) {
                    //                                 if (statusQ.equalsIgnoreCase("tersedia")) {
                    //                                     System.out.println("Daftar quest terfilter : ");
                    //                                     System.out.println("ID Quest : " + baris7.substring(0, baris7.indexOf(NAME_IDENTIFIER)));
                    //                                     System.out.println("Nama Quest : " + baris7.substring(baris7.indexOf(NAME_IDENTIFIER) + 1, baris7.indexOf(DESC_IDENTIFIER)));
                    //                                     System.out.println("Deskripsi Quest : " + baris7.substring(baris7.indexOf(DESC_IDENTIFIER) + 1, baris7.indexOf(REWARD_IDENTIFIER)));
                    //                                     System.out.println("Reward Quest : " + baris7.substring(baris7.indexOf(REWARD_IDENTIFIER) + 1, baris7.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                     System.out.println("Bonus Exp Quest : " + baris7.substring(baris7.indexOf(EXP_IDENTIFIER) + 1, baris7.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                     System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                     System.out.println("Status Quest : " + status);                                                        
                    //                                     System.out.println();
                    //                                 }
                    //                                 if (statusQ.equalsIgnoreCase("selesai")) {
                    //                                     System.out.println("Daftar quest terfilter : ");
                    //                                     System.out.println("ID Quest : " + baris7.substring(0, baris7.indexOf(NAME_IDENTIFIER)));
                    //                                     System.out.println("Nama Quest : " + baris7.substring(baris7.indexOf(NAME_IDENTIFIER) + 1, baris7.indexOf(DESC_IDENTIFIER)));
                    //                                     System.out.println("Deskripsi Quest : " + baris7.substring(baris7.indexOf(DESC_IDENTIFIER) + 1, baris7.indexOf(REWARD_IDENTIFIER)));
                    //                                     System.out.println("Reward Quest : " + baris7.substring(baris7.indexOf(REWARD_IDENTIFIER) + 1, baris7.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                     System.out.println("Bonus Exp Quest : " + baris7.substring(baris7.indexOf(EXP_IDENTIFIER) + 1, baris7.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                     System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                     System.out.println("Status Quest : " + status);
                    //                                     System.out.println();
                    //                                 }
                    //                                 break;                                                
                    //                             } else {
                    //                                 System.out.println("Pilihan tidak valid. Harap masukkan pilihan dengan benar.");
                    //                             }
                    //                         }    
                    //                     filterStatus.close();
                    //                     break;
                    //                         }
                    //                     }
                    //                     }
                    //             break;
                    //         case "2" :
                    //             boolean filter2 = false;
                    //             while (!filter2) {                                        
                    //                 System.out.print("Masukkan tingkat kesulitan quest yang ingin difilter (mudah/menengah/sulit), masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                    //                 String kesulitanInput = input.nextLine();
                    //                 if (kesulitanInput.equalsIgnoreCase("x")) {
                    //                     balikMenuUtama = true;
                    //                     filter2 = false;
                    //                     break;

                    //                 } if (kesulitanInput.matches("^[a-zA-Z0-9 ]+$")) {
                    //                     Scanner filterDiff = new Scanner(questData);    
                    //                     while (filterDiff.hasNextLine()) {
                    //                         String baris7D = filterDiff.nextLine();
                                            
                    //                         int diff7 = baris7D.indexOf(DIFFICULTY_IDENTIFIER);
                    //                         int status7 = baris7D.indexOf(STATUS_IDENTIFIER);
    
                    //                         String tingkatKesulitan = baris7D.substring(diff7 + 1, status7);
                    //                         String bintang = "";
                    //                         if (tingkatKesulitan.equalsIgnoreCase("mudah")) {
                    //                             bintang = "\u2605"; 
                    //                         } else if (tingkatKesulitan.equalsIgnoreCase("menengah")) {
                    //                             bintang = "\u2605 \u2605"; 
                    //                         } else if (tingkatKesulitan.equalsIgnoreCase("sulit")) {
                    //                             bintang = "\u2605 \u2605 \u2605"; 
                    //                         }
    
                    //                         String status = baris7D.substring(status7 + 1);
                    //                         if (status.equalsIgnoreCase("tersedia")) {
                    //                             status = "tersedia \ud83d\udfe2";
                    //                         } else if (status.startsWith("diambil-")) {
                    //                             status = status + "\u231b";
                    //                         } else if (status.equalsIgnoreCase("selesai")) {
                    //                             status = "selesai \ud83c\udfc6";
                    //                         }
                                            
                    //                         if (tingkatKesulitan.equalsIgnoreCase(kesulitanInput)) {
                    //                             if (kesulitanInput.equalsIgnoreCase("mudah")) {
                    //                                 System.out.println("Daftar quest terfilter : ");
                    //                                 System.out.println("ID Quest : " + baris7D.substring(0, baris7D.indexOf(NAME_IDENTIFIER)));
                    //                                 System.out.println("Nama Quest : " + baris7D.substring(baris7D.indexOf(NAME_IDENTIFIER) + 1, baris7D.indexOf(DESC_IDENTIFIER)));
                    //                                 System.out.println("Deskripsi Quest : " + baris7D.substring(baris7D.indexOf(DESC_IDENTIFIER) + 1, baris7D.indexOf(REWARD_IDENTIFIER)));
                    //                                 System.out.println("Reward Quest : " + baris7D.substring(baris7D.indexOf(REWARD_IDENTIFIER) + 1, baris7D.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                 System.out.println("Bonus Exp Quest : " + baris7D.substring(baris7D.indexOf(EXP_IDENTIFIER) + 1, baris7D.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                 System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                 System.out.println("Status Quest : " + status);
                    //                                 System.out.println();
                    //                                 balikMenuUtama = true;
                    //                                 break;
                                                    
                    //                             }else if (kesulitanInput.equalsIgnoreCase("menengah")) {
                    //                                 System.out.println("Daftar quest terfilter : ");
                    //                                 System.out.println("ID Quest : " + baris7D.substring(0, baris7D.indexOf(NAME_IDENTIFIER)));
                    //                                 System.out.println("Nama Quest : " + baris7D.substring(baris7D.indexOf(NAME_IDENTIFIER) + 1, baris7D.indexOf(DESC_IDENTIFIER)));
                    //                                 System.out.println("Deskripsi Quest : " + baris7D.substring(baris7D.indexOf(DESC_IDENTIFIER) + 1, baris7D.indexOf(REWARD_IDENTIFIER)));
                    //                                 System.out.println("Reward Quest : " + baris7D.substring(baris7D.indexOf(REWARD_IDENTIFIER) + 1, baris7D.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                 System.out.println("Bonus Exp Quest : " + baris7D.substring(baris7D.indexOf(EXP_IDENTIFIER) + 1, baris7D.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                 System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                 System.out.println("Status Quest : " + status);                                                        
                    //                                 System.out.println();
                    //                                 balikMenuUtama = true;
                    //                                 break;
        
                    //                             } else if (kesulitanInput.equalsIgnoreCase("sulit")) {
                    //                                 System.out.println("Daftar quest terfilter : ");
                    //                                 System.out.println("ID Quest : " + baris7D.substring(0, baris7D.indexOf(NAME_IDENTIFIER)));
                    //                                 System.out.println("Nama Quest : " + baris7D.substring(baris7D.indexOf(NAME_IDENTIFIER) + 1, baris7D.indexOf(DESC_IDENTIFIER)));
                    //                                 System.out.println("Deskripsi Quest : " + baris7D.substring(baris7D.indexOf(DESC_IDENTIFIER) + 1, baris7D.indexOf(REWARD_IDENTIFIER)));
                    //                                 System.out.println("Reward Quest : " + baris7D.substring(baris7D.indexOf(REWARD_IDENTIFIER) + 1, baris7D.indexOf(EXP_IDENTIFIER)) + " koin");
                    //                                 System.out.println("Bonus Exp Quest : " + baris7D.substring(baris7D.indexOf(EXP_IDENTIFIER) + 1, baris7D.indexOf(DIFFICULTY_IDENTIFIER)) + " poin exp");
                    //                                 System.out.println("Tingkat Kesulitan Quest : " + bintang);
                    //                                 System.out.println("Status Quest : " + status);
                    //                                 System.out.println();
                    //                                 balikMenuUtama = true;
                    //                                 break;
    
                    //                             } else {
                    //                                 System.out.println("Pilihan tidak valid. Harap masukkan data dengan benar.");
                    //                                 break;
    
                    //                             }

                    //                         }
                    //                         break;
                    //                     }    
                    //                     filterDiff.close();
                    //                     break;
                    //             }
                    //         }
                    //         break;
