package Sem_6_DZ;

public class Notebook {

  String brand;
  String model;
  int ram;
  int hardDisk;
  String operSystem;
  String graphicCard;

  // Конструктор
  public Notebook(String brand, String model, int ram, int hardDisk, String operSystem, String graphicCard) {
    this.brand = brand.toUpperCase();
    this.model = model.toUpperCase();
    this.ram = ram;
    this.hardDisk = hardDisk;
    this.operSystem = operSystem.toUpperCase();
    this.graphicCard = graphicCard.toUpperCase();
  }

  // Сэттеры
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setHardDisk(int hardDisk) {
    this.hardDisk = hardDisk;
  }

  public void setOperSystem(String operSystem) {
    this.operSystem = operSystem;
  }

  public void setGraphicCard(String graphicCard) {
    this.graphicCard = graphicCard;
  }

  // Геттеры
  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getRam() {
    return ram;
  }

  public int getHardDisk() {
    return hardDisk;
  }

  public String getOperSystem() {
    return operSystem;
  }

  public String getGraphicCard() {
    return graphicCard;
  }

  // Вывод в консоль
  public void showInfo() {
    System.out.println(
        String.format(
            "Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nВидеокарта: %s\n",
            this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.graphicCard));
  }

  @Override
  public String toString() {
    return (String.format(
        "Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nВидеокарта: %s\n" + "\n",
        this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.graphicCard));
  }

}
