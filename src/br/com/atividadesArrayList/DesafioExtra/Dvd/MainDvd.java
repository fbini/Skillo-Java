package br.com.atividadesArrayList.DesafioExtra.Dvd;

public class MainDvd {
    public static void main(String[] args) {
        // set do tamanho da array
        // collection - nome da minha lista
        Dvd[] dvdCollection = new Dvd[15];

        // .length tamanho da Array
        int capacidade = dvdCollection.length;
        System.out.println("A array te a capacidade de " + capacidade );

        Dvd avangersDVD = new Dvd("The Avengers", 2012, "Joss Whedon");
        // adição do objeto a lista na posição 1
        dvdCollection[0] = avangersDVD;

        Dvd incrediblesDVD = new Dvd("The Incredibles", 2004, "Brad Bird");
        Dvd findingDoryDVD = new Dvd("Finding Dory", 2016, "Andrew Stanton");
        Dvd lionKingDVD = new Dvd("The Lion King", 2019, "Jon Favreau");
        dvdCollection[4] = incrediblesDVD; // posição 3
        dvdCollection[3] = findingDoryDVD; // posição 2
        dvdCollection[10] = lionKingDVD; // posição 9

        Dvd starWarsDVD = new Dvd("Star Wars", 1977, "George Lucas");
        dvdCollection[10] = starWarsDVD; // posição 9 - sobreescrevendo o lionKing

        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[2]); // null pq está vazia

        int[] squareNumbers = new int[10];
        for (int i = 0; i < 10; i++){
            int square = (i + i) * (i + i);
            squareNumbers[i] = square;
            System.out.println(squareNumbers[i]);
        }

    }
}
