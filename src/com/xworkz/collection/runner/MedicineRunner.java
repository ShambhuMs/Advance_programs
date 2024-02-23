package com.xworkz.collection.runner;

import com.xworkz.collection.dto.MedicineDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineRunner {
    public static void main(String[] args) {

           
                String[] ingredients = { "Paracetamol", "Microcrystalline cellulose", "Pregelatinized starch", "Povidone",
                        "Starch", "Starch", "Starch" };
                MedicineDTO medicineDTO = new MedicineDTO("dolo650", 101, "dolo", LocalDate.of(2024, 1, 13),
                        LocalDate.of(2024, 2, 20), 10, ingredients);

                String[] panadolIngredients = { "Paracetamol", "Microcrystalline cellulose", "Pregelatinized starch",
                        "Povidone", "Starch" };
                MedicineDTO medicineDTO2 = new MedicineDTO("panadol", 102, "paracetamol", LocalDate.of(2024, 2, 10),
                        LocalDate.of(2024, 2, 20), 15, panadolIngredients);

                String[] ibuprofenIngredients = { "Ibuprofen", "Croscarmellose Sodium", "Colloidal Silicon Dioxide",
                        "Microcrystalline Cellulose", "Stearic Acid" };
                MedicineDTO medicineDTO3 = new MedicineDTO("ibuprofen", 103, "ibuprofen", LocalDate.of(2023, 7, 10),
                        LocalDate.of(2024, 7, 10), 20, ibuprofenIngredients);

                String[] aspiriningredients = { "Acetylsalicylic acid", "Corn starch", "Lactose", "Calcium carbonate",
                        "Tricalcium phosphate" };
                MedicineDTO medicineDTO4 = new MedicineDTO("aspirin", 104, "aspirin", LocalDate.of(2023, 8, 15),
                        LocalDate.of(2024, 8, 15), 25, aspiriningredients);

                String[] tylenolingredients = { "Acetaminophen", "Pregelatinized starch", "Corn starch", "Stearic acid",
                        "Povidone" };
                MedicineDTO medicineDTO5 = new MedicineDTO("tylenol", 105, "acetaminophen", LocalDate.of(2023, 9, 25),
                        LocalDate.of(2024, 9, 25), 30, tylenolingredients);

                String[] advilingredients = { "Ibuprofen", "Colloidal silicon dioxide", "Croscarmellose sodium",
                        "FD&C red no. 40 aluminum lake", "Hypromellose" };
                MedicineDTO medicineDTO21 = new MedicineDTO("advil", 106, "ibuprofen", LocalDate.of(2023, 10, 5),
                        LocalDate.of(2024, 10, 5), 35, advilingredients);

                String[] naproxeningredients = { "Naproxen", "Microcrystalline cellulose", "Pregelatinized starch",
                        "Croscarmellose sodium", "Magnesium stearate" };
                MedicineDTO medicineDTO6 = new MedicineDTO("naproxen", 107, "naproxen", LocalDate.of(2023, 11, 15),
                        LocalDate.of(2024, 11, 15), 40, naproxeningredients);

                String[] zyrtecingredients = { "Cetirizine", "Lactose monohydrate", "Microcrystalline cellulose",
                        "Colloidal anhydrous silica", "Magnesium stearate" };
                MedicineDTO medicineDTO7 = new MedicineDTO("zyrtec", 108, "cetirizine", LocalDate.of(2023, 12, 25),
                        LocalDate.of(2024, 12, 25), 45, zyrtecingredients);

                String[] benadrylingredients = { "Diphenhydramine", "Cellulose", "Magnesium stearate", "Sodium citrate",
                        "Lactose" };
                MedicineDTO medicineDTO8 = new MedicineDTO("benadryl", 109, "diphenhydramine", LocalDate.of(2024, 1, 5),
                        LocalDate.of(2025, 1, 5), 50, benadrylingredients);

                String[] claritinIngredients = { "Loratadine", "Calcium phosphate", "Lactose monohydrate", "Maize starch",
                        "Magnesium stearate" };
                MedicineDTO medicineDTO9 = new MedicineDTO("claritin", 110, "loratadine", LocalDate.of(2024, 2, 15),
                        LocalDate.of(2025, 2, 15), 55, claritinIngredients);

                String[] peptoingredients = { "Bismuth subsalicylate", "Calcium carbonate", "Magnesium carbonate", "Kaolin",
                        "Povidone" };

                MedicineDTO medicineDTO10 = new MedicineDTO("pepto-bismol", 111, "bismuth subsalicylate",
                        LocalDate.of(2024, 3, 25), LocalDate.of(2025, 3, 25), 60, peptoingredients);

                MedicineDTO medicineDTO11 = new MedicineDTO("motrin", 112, "ibuprofen", LocalDate.of(2023, 4, 10),
                        LocalDate.of(2024, 4, 10), 40, ingredients);

                MedicineDTO medicineDTO12 = new MedicineDTO("aleve", 113, "naproxen", LocalDate.of(2023, 5, 20),
                        LocalDate.of(2024, 5, 20), 45, ingredients);


                MedicineDTO medicineDTO13 = new MedicineDTO("cetirizine", 114, "cetirizine", LocalDate.of(2023, 6, 30),
                        LocalDate.of(2024, 6, 30), 50, ingredients);

                MedicineDTO medicineDTO14 = new MedicineDTO("dramamine", 115, "dimenhydrinate", LocalDate.of(2023, 7, 10),
                        LocalDate.of(2024, 7, 10), 55, ingredients);

                MedicineDTO medicineDTO15 = new MedicineDTO("zyrtec-d", 116, "cetirizine and pseudoephedrine",
                        LocalDate.of(2023, 8, 15), LocalDate.of(2024, 8, 15), 60, ingredients);

                MedicineDTO medicineDTO16 = new MedicineDTO("tylenol pm", 117, "acetaminophen and diphenhydramine",
                        LocalDate.of(2023, 9, 25), LocalDate.of(2024, 9, 25), 65, ingredients);

                MedicineDTO medicineDTO17 = new MedicineDTO("allegra", 118, "fexofenadine", LocalDate.of(2023, 10, 5),
                        LocalDate.of(2024, 10, 5), 70, ingredients);

                MedicineDTO medicineDTO18 = new MedicineDTO("zantac", 119, "ranitidine", LocalDate.of(2023, 11, 15),
                        LocalDate.of(2024, 11, 15), 75, ingredients);

                MedicineDTO medicineDTO19 = new MedicineDTO("pepcid", 120, "famotidine", LocalDate.of(2023, 12, 25),
                        LocalDate.of(2024, 12, 25), 80, ingredients);

                MedicineDTO medicineDTO20 = new MedicineDTO("tagamet", 121, "cimetidine", LocalDate.of(2024, 1, 5),
                        LocalDate.of(2025, 1, 5), 85, ingredients);

                List<MedicineDTO> list =new ArrayList<>();
                list.add(medicineDTO);
                list.add(medicineDTO4);
                list.add(medicineDTO2);
                list.add(medicineDTO3);
                list.add(medicineDTO6);
                list.add(medicineDTO5);
                list.add(medicineDTO7);
                list.add(medicineDTO8);
                list.add(medicineDTO9);
                list.add(medicineDTO10);
                list.add(medicineDTO11);
                list.add(medicineDTO12);
                list.add(medicineDTO13);
                list.add(medicineDTO14);
                list.add(medicineDTO15);
                list.add(medicineDTO16);
                list.add(medicineDTO17);
                list.add(medicineDTO18);
                list.add(medicineDTO19);
                list.add(medicineDTO20);



                System.out.println("sort all medicine by company name");
                Collections.sort(list);
                list.forEach(l -> System.out.println(l));
                System.out.println("========================================");

                System.out.println("sort all by expiry date desc");
                list.stream().sorted((e1, e2) -> e2.getExpiryDate().compareTo(e1.getExpiryDate()))
                        .forEach(l -> System.out.println(l));

                System.out.println("===============================");
                System.out.println("sort all by cost ascending order");
                list.stream().sorted((c1, c2) -> Double.compare(c1.getCost(), c2.getCost()))
                        .forEach(l -> System.out.println(l));

                System.out.println("===============================");
                System.out.println("collect all elements where ingredients greater than 5");
                List<MedicineDTO> list1 = list.stream().filter(l -> l.getIngredients().length > 5).collect(Collectors.toList());

                list1.forEach(l -> System.out.println(l));

                System.out.println("===================================");

                System.out.println("collect only ingredients");

                List<String[]> list2 = list.stream().map(MedicineDTO::getIngredients).collect(Collectors.toList());

                list2.forEach(list4 -> {
                    for (String i : list4) {
                        System.out.println(i);
                    }
                });

                System.out.println("==============================================");

                System.out.println("collect only company sort by descending order");
                List<String> companydesc = list.stream().map(MedicineDTO::getCompany).collect(Collectors.toList());

                companydesc.stream().sorted(Collections.reverseOrder()).forEach(l -> System.out.println(l.toUpperCase()));

                System.out.println("==============================================");
                System.out.println("collect only name in lower case and sort in descending order ");

                list.stream().map(MedicineDTO::getName).map(String::toLowerCase).sorted(Collections.reverseOrder())
                        .forEach(l -> System.out.println(l));

                System.out.println("==============================================");
                System.out.println("collect all manufacture date less than 30 days");

                list.stream().filter(l -> l.getManufactureDate().isBefore(LocalDate.now().plusDays(30))).forEach(l -> System.out.println(l));

                System.out.println("==============================================");
                System.out.println("collect all expiry date less than 30 days");

                list.stream().filter(l -> l.getExpiryDate().isBefore(LocalDate.now().plusDays(30))).forEach(l -> System.out.println(l));

                System.out.println("==============================================");
                System.out.println("collect all manufacture date greater than 30 days");

                list.stream().filter(l -> l.getManufactureDate().isAfter(LocalDate.now().plusDays(30))).forEach(l -> System.out.println(l));

            
    }
}
