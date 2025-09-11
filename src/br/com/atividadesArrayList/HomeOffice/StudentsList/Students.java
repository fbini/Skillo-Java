package br.com.atividadesArrayList.HomeOffice.StudentsList;

public class Students {
    private String name;
    private double note;

    public Students(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
