import java.io.Console;

class Laptop {
	private String idNumber;
    private String brandName;
	private String modelName;
	private int ramAmount;
	private int hddAmount;
    private String OS;
    private double displaySize;
    private String color;


	public Laptop(String idNumber, String brandName, String modelName, int ramAmount, int hddAmount, String OS, double displaySize, String color) {
		this.idNumber = idNumber;
        this.brandName = brandName;
        this.modelName = modelName;
        this.ramAmount = ramAmount;
        this.hddAmount = hddAmount;
        this.OS = OS;
        this.displaySize = displaySize;
        this.color = color;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public String getBrandName() {
		return brandName;
	}


	public String getModelName() {
		return modelName;
	}


	public int getRamAmount() {
		return ramAmount;
	}


    public int getHddAmount() {
		return hddAmount;
	}
    

	public String getOS() {
		return OS;
	}
    

	public double getdisplaySize() {
		return displaySize;
	}


    public String getColor() {
		return color;
	}
}


public class app {
    public static void outputArray(Laptop[] laptops) {
        Console console = System.console();
        int arrayLength = laptops.length;
        
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - идентификатор");
        System.out.println("2 - производитель");
        System.out.println("3 - название модели");
        System.out.println("4 - объем RAM");
        System.out.println("5 - объем HDD");
        System.out.println("6 - операционная система");
        System.out.println("7 - диагональ экрана");
        System.out.println("8 - цвет");
        
        String inputNumber = console.readLine("Введите цифру: ");
        char num = inputNumber.charAt(0);

        switch (num) {
            case '1':
                String idNumber = console.readLine("Введите идентификатор для поиска: ");

                System.out.printf("Ноутбук с идентификатором %s: ", idNumber);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getIdNumber().compareToIgnoreCase(idNumber) == 0) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            case '2':
                String brandName = console.readLine("Введите производителя для поиска: ");

                System.out.printf("Ноутбуки производителя %s:\n", brandName);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getBrandName().compareToIgnoreCase(brandName) == 0) {
                        System.out.println(laptops[i].getModelName());
                    }
                }

                break;
            case '3':
                String modelName = console.readLine("Введите название модели для поиска: ");

                System.out.printf("Ноутбуки модели %s:\n", modelName);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getModelName().compareToIgnoreCase(modelName) == 0) {
                        System.out.println(laptops[i].getBrandName());
                    }
                }
            case '4':
                String ramAmountFrom = console.readLine("Введите объем памяти с: ");
                String ramAmountTo = console.readLine("Введите объем памяти по: ");

                System.out.printf("Ноутбуки с памятью с %s по %s:\n", ramAmountFrom, ramAmountTo);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getRamAmount() >= Integer.parseInt(ramAmountFrom) && laptops[i].getRamAmount() <= Integer.parseInt(ramAmountTo)) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            case '5':
                String hddAmountFrom = console.readLine("Введите объем жесткого диска с: ");
                String hddAmountTo = console.readLine("Введите объем жесткого диска по: ");

                System.out.printf("Ноутбуки объем жесткого диска с %s по %s:\n", hddAmountFrom, hddAmountTo);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getHddAmount() >= Integer.parseInt(hddAmountFrom) && laptops[i].getHddAmount() <= Integer.parseInt(hddAmountTo)) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            case '6':
                String OS = console.readLine("Введите название операционной системы для поиска: ");

                System.out.printf("Ноутбуки модели %s:\n", OS);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getOS().compareToIgnoreCase(OS) == 0) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            case '7':
                String displaySizeFrom = console.readLine("Введите диагональ экрана с: ");
                String displaySizeTo = console.readLine("Введите диагональ экрана по: ");

                System.out.printf("Ноутбуки диагональ экрана с %s по %s:\n", displaySizeFrom, displaySizeTo);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getdisplaySize() >= Double.parseDouble(displaySizeFrom) && laptops[i].getdisplaySize() <= Double.parseDouble(displaySizeTo)) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            case '8':
                String color = console.readLine("Введите цвет ноутбука для поиска: ");

                System.out.printf("Ноутбуки с цветом %s:\n", color);
                
                for (int i = 0; i < arrayLength; i++) {
                    if (laptops[i].getColor().compareToIgnoreCase(color) == 0) {
                        String laptopName = String.format("%s %s", laptops[i].getBrandName(), laptops[i].getModelName());
                        System.out.println(laptopName);
                    }
                }

                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[5];
        
        laptops[0] = new Laptop("1257812", "HP", "t123", 8, 500, "Windows 11", 17, "black");  
        laptops[1] = new Laptop("1257813", "Dell", "d1234", 16, 1000, "Windows 10", 16, "black");  
        laptops[2] = new Laptop("1257814", "Lenovo", "FG4555", 4, 250, "Windows 10", 14, "grey");
        laptops[3] = new Laptop("1257815", "NoName", "GGGGG", 2, 100, "Windows 7", 13, "dirty white");  
        laptops[4] = new Laptop("1257816", "MacBook", "Air 13", 32, 2000, "iOS", 13, "silver");  

        outputArray(laptops);
    }
}
