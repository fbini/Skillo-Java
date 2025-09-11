package br.com.atividadesArrayList.HomeOffice.StudentsList;

import java.util.ArrayList;

public class MainStudents {
    public static void main(String[] args) {
        Students students01 = new Students("Ingrid Bini", 10);
        Students students02 = new Students("José", 3);
        Students students03 = new Students("Gabriel", 10);
        Students students04 = new Students("Mariana", 10);

        ArrayList<Students> listStudents =  new ArrayList<>();
        listStudents.add(students01);
        listStudents.add(students02);
        listStudents.add(students03);
        listStudents.add(students04);

        double soma = 0.0;
        double media = 0.0;

        // calcule a média das notas e imprima os aprovados (nota ≥ 7).
        for (Students students : listStudents){
            soma += students.getNote() ;
            media = soma / listStudents.size();

            if (students.getNote() >= 7){
                System.out.println("Aprovado: " + students.getName() + " Nota: " + students.getNote());
            } else {
                System.out.println("Reprovado: " + students.getName() + " Nota: " + students.getNote());
            }
        }
        System.out.println("A média é: " + media);
    }
}
