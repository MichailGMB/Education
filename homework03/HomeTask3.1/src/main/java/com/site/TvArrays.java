package main.java.com.site;
import java.util.Scanner;
public class TvArrays {
    private final Television[] tvArray;
    private final int k;

    public TvArrays(Television[] tvArray, int k)
    {
        this.tvArray = tvArray;
        this.k = k;
    }

    public void vvod()
    {
        Scanner inputINT = new Scanner(System.in);
        Scanner inputSTR = new Scanner(System.in);
        String brand;
        String model;
        int serial;
        int year;
        for (int i = 0; i < k; i++)
        {

            System.out.print("Введите бренд " + (i + 1) + " телевизора: ");
            brand = inputSTR.nextLine();
            System.out.print("Введите модель " + (i + 1) + " телевизора: ");
            model = inputSTR.nextLine();
            System.out.print("Введите серийный номер " + (i + 1) + " телевизора: ");
            serial = inputINT.nextInt();
            System.out.print("Введите год выпуска " + (i + 1) + " телевизора: ");
            year = inputINT.nextInt();
            tvArray[i] = new Television(brand, model, serial, year);
        }

    }
    public void output()
    {
        System.out.println();
        for (int i = 0; i<k; i++)
        {
            System.out.println("Телевизор #"+ (i+1) +":");
            System.out.println(tvArray[i]);
            System.out.println();
        }
    }

    public void sortingForYears()
    {
        int buffer;
        String buffer2;
        for (int i = 0; i<(k-1);i++)
        {
            for(int j = (i+1); j<k;j++)
            {
                if (tvArray[i].getYear() > tvArray[j].getYear())
                {
                    buffer = tvArray[i].getYear();
                    tvArray[i].setYear(tvArray[j].getYear());
                    tvArray[j].setYear(buffer);

                    buffer = tvArray[i].getSerial();
                    tvArray[i].setSerial(tvArray[j].getSerial());
                    tvArray[j].setSerial(buffer);

                    buffer2 = tvArray[i].getBrand();
                    tvArray[i].setBrand(tvArray[j].getBrand());
                    tvArray[j].setBrand(buffer2);

                    buffer2 = tvArray[i].getModel();
                    tvArray[i].setModel(tvArray[j].getModel());
                    tvArray[j].setModel(buffer2);
                }
            }
        }

    }

}